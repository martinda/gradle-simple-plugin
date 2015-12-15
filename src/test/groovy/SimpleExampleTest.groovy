import org.junit.Test;
import org.junit.Rule;
import static org.junit.Assert.assertTrue;
import org.gradle.api.Project;
import org.gradle.testfixtures.ProjectBuilder;

class SimpleExampleTest {
  @Test
  public void boo() {
    Project project = ProjectBuilder.builder().build();
    project.getPluginManager().apply("simple-example");
    assertTrue(project.getTasks().getByName("simpleExample") instanceof SimpleExampleTask);
  }
}
