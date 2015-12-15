import org.gradle.api.Plugin;
import org.gradle.api.Project;
import org.gradle.api.Task;

public class SimpleExamplePlugin implements Plugin<Project> {
  @Override
  public void apply(Project project) {
    Task task = project.getTasks().create("simpleExample", SimpleExampleTask.class);
  }
}
