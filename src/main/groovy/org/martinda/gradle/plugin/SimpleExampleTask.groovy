package org.martinda.gradle.plugin

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class SimpleExampleTask extends DefaultTask {

  static final NAME = 'simpleExample'

  String name = 'defaultName'

  SimpleExampleTask() {
    description = 'This is a simple example task'
    group = 'Example'
  }

  @TaskAction
  void run() {
    println("Hello "+name)
  }
}
