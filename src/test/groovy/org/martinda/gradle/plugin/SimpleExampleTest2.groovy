package org.martinda.gradle.plugin

import org.junit.Test
import org.junit.Rule
import static org.junit.Assert.assertTrue
import org.gradle.api.Project
import org.gradle.testfixtures.ProjectBuilder

class SimpleExampleTest2 {
  @Test
  public void boo() {
    Project project = ProjectBuilder.builder().build()
    project.pluginManager.apply 'org.martinda.simple-example'
    assertTrue(project.tasks.simpleExample instanceof SimpleExampleTask)
  }
}