package ConfigTests;

import classes.Instructors;
import configurations.InstructorsConfig;
import configurations.StudentConfig;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes= InstructorsConfig.class)
@SpringBootTest
public class TestInstructorConfig {

    @Qualifier("instructors")
    @Autowired
    private Instructors instructors;

    @Test
    public void zcwInstructors() {
        String actual = instructors.toString();
        String expected = "{Instructor{id=100, name=Dolio}Instructor{id=200, name=Kris}Instructor{id=300, name=Nobles}}";

        Assert.assertEquals(expected, actual);
    }
}
