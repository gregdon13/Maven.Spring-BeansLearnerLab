package ConfigTests;

import classes.Students;
import configurations.ClassroomConfig;
import configurations.StudentConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes= StudentConfig.class)
@SpringBootTest
public class TestStudentConfig {

    @Qualifier("students")
    @Autowired
    private Students students;

    @Qualifier("previousStudents")
    @Autowired
    private Students lastCohort;

    @Test
    public void currentStudents() {
        System.out.println(students.toString());
    }
}
