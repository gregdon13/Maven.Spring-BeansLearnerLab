package ConfigTests;

import classes.Classroom;
import configurations.ClassroomConfig;
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
    private Classroom classroom;

    @Qualifier("previousCohort")
    @Autowired
    private Classroom classroomPrevious;


}
