import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;

class SimpleExampleTask extends DefaultTask {

  static final String NAME = "simpleExample";

  // Change "name" in the next line to anything else and it passes
  String name1 = "John";

  @TaskAction
  void run() {
    System.out.println("Hello");
  }
}
