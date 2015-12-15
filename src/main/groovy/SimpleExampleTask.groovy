import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;

public class SimpleExampleTask extends DefaultTask {

  public static final String NAME = "simpleExample";

  // Change "name" to "name1" and the test passes
  // Or declare the next line as public String name and the test passes
  String name;

  @TaskAction
  void run() {
    System.out.println("Hello");
  }
}
