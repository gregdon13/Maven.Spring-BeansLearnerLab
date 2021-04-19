package ConfigTests;

import classes.Alumni;
import classes.Classroom;
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
//    Alumni alumni = new Alumni();
//    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ClassroomConfig.class);
//    Alumni alumni = context.getBean(Alumni.class);
//    alumni.
//
//
//    @Test
//    public void checkHoursLearned() {
//        double expected = 1200.0;
//        double actual = alumni.getLastCohort().findAll().get(0).getTotalStudyTime();
//
//        System.out.println(actual);
//
//        Assert.assertEquals(expected, actual);
//    }
}
