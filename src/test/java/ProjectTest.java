import org.gradle.api.Project;
import org.gradle.api.internal.project.DefaultProject;
import org.gradle.testfixtures.ProjectBuilder;
import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.assertTrue;

class ProjectTest {

    @Test
    void testFailure() {
        File dir = new File(".").getAbsoluteFile().getParentFile();
        File projectDir = new File(dir + "/src/test/resources/example-project");
        assertTrue(projectDir.exists());
        Project project = ProjectBuilder.builder().withProjectDir(projectDir).build();
        ((DefaultProject) project).evaluate();
    }

}