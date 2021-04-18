package ConfigTests;

import classes.Classroom;
import classes.Students;
import configurations.ClassroomConfig;
import configurations.InstructorsConfig;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes= ClassroomConfig.class)
@SpringBootTest
public class TestClassroomConfig {

    @Qualifier("currentCohort")
    @Autowired
    private Classroom currentClass;

    @Qualifier("previousCohort")
    @Autowired
    private Classroom lastCohort;

    @Test
    public void currentCohort() {
        String expected = "Classroom{Student{id=1, name=Greg, studyhours=0.0}Student{id=2, name=Jorge, studyhours=0.0}Student{id=3, name=Kelly, studyhours=0.0}Student{id=4, name=Chris, studyhours=0.0}Student{id=5, name=Ashley, studyhours=0.0}Student{id=6, name=Ryan, studyhours=0.0}Student{id=7, name=Hazel, studyhours=0.0}Student{id=8, name=Justin, studyhours=0.0}Student{id=9, name=Theresa, studyhours=0.0}Student{id=10, name=Mike, studyhours=0.0}Student{id=11, name=Lena, studyhours=0.0}Student{id=12, name=Monali, studyhours=0.0}Student{id=13, name=Abe, studyhours=0.0}Student{id=14, name=Xiong, studyhours=0.0}Instructor{id=100, name=Dolio}Instructor{id=200, name=Kris}Instructor{id=300, name=Nobles}}";
        String actual = currentClass.toString();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void previousCohort() {
        String expected = "Classroom{Student{id=1, name=Josh, studyhours=0.0}Student{id=2, name=Jeremy, studyhours=0.0}Student{id=3, name=Ben, studyhours=0.0}Student{id=4, name=Hilary, studyhours=0.0}Student{id=5, name=Han, studyhours=0.0}Student{id=6, name=Gabriela, studyhours=0.0}Student{id=7, name=Jack, studyhours=0.0}Student{id=8, name=Whitney, studyhours=0.0}Instructor{id=100, name=Dolio}Instructor{id=200, name=Kris}Instructor{id=300, name=Nobles}}";
        String actual = lastCohort.toString();

        Assert.assertEquals(expected, actual);
    }
}
