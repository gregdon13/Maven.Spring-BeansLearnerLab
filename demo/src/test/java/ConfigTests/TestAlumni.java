package ConfigTests;

import classes.*;
import configurations.ClassroomConfig;
import configurations.InstructorsConfig;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = Alumni.class)
@SpringBootTest
public class TestAlumni {
    Alumni alumni = new Alumni();

    @Test
    public void checkHoursLearned() {
        double expected = 1200.0;
        alumni.executeBootcamp();

        double actual = alumni.getClassroom().getStudents().findAll().get(0).getTotalStudyTime();

        Assert.assertEquals(expected, actual, 1e-15);
    }

    @Test
    public void checkHoursTaught() {
        double expected = 3200.0;
        alumni.executeBootcamp();

        double actual = alumni.getClassroom().getInstructors().findAll().get(0).getNumberOfHoursTaught();

        Assert.assertEquals(expected, actual, 1e-15);
    }
}
