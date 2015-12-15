import org.gradle.api.Plugin;
import org.gradle.api.Project;
import org.gradle.api.Task;

class SimpleExamplePlugin implements Plugin<Project> {
  void apply(Project project) {
    Task task = project.getTasks().create("simpleExample", SimpleExampleTask.class);
  }
}
