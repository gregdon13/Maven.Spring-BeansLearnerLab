package configurations;

import classes.Classroom;
import classes.Instructors;
import classes.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
public class ClassroomConfig {
    @Qualifier("instructors")
    @Autowired
    private Instructors instructors;

    @Qualifier("students")
    @Autowired
    private Students students;

    @Qualifier("previousStudents")
    @Autowired
    private Students lastCohort;

    @Bean("currentCohort")
    @DependsOn(value = {"students", "instructors"})
    public Classroom currentCohort() {
        return new Classroom(students, instructors);
    }

    @Bean("lastCohort")
    @DependsOn(value ={"previousStudents", "instructors"})
    public Classroom previousCohort() {
        return new Classroom(lastCohort, instructors);
    }

}
