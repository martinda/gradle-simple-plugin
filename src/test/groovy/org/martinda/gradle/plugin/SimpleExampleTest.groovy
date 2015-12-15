package org.martinda.gradle.plugin

import org.gradle.testkit.runner.GradleRunner
import static org.gradle.testkit.runner.TaskOutcome.*
import org.junit.Rule
import org.junit.rules.TemporaryFolder
import spock.lang.Specification

class SimpleExampleTest extends Specification {
    @Rule final TemporaryFolder testProjectDir = new TemporaryFolder()
    File buildFile
    List<File> pluginClasspath

    def setup() {
        buildFile = testProjectDir.newFile('build.gradle')
        def pluginClasspathResource = getClass().classLoader.findResource("plugin-classpath.txt")
        if (pluginClasspathResource == null) {
            throw new IllegalStateException("Did not find plugin classpath resource, run `testClasses` build task.")
        }
 
        pluginClasspath = pluginClasspathResource.readLines().collect { new File(it) }
    }

    def "simpleExampleTask prints the greeting"() {
        given:
        buildFile << """
            plugins {
              id 'org.martinda.simple-example'
            }
            simpleExample {
                name = 'John'
            }
        """

        when:
        def result = GradleRunner.create()
            .withProjectDir(testProjectDir.root)
            .withArguments('simpleExample')
            .withPluginClasspath(pluginClasspath)
            .build()

        then:
        println(result.output)
        result.output.contains('Hello John')
        result.task(":simpleExample").outcome == SUCCESS
    }
}
