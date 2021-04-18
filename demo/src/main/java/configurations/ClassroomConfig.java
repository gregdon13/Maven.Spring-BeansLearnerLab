package configurations;

import classes.Classroom;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
public class ClassroomConfig {

    @Bean
    //@DependsOn({"students", "instructors"})
    public Classroom currentCohort() {
        StudentConfig studentConfig = new StudentConfig();
        InstructorsConfig instructorsConfig = new InstructorsConfig();
        return new Classroom(studentConfig.currentStudents(), instructorsConfig.zipcodeInstructors());
    }

    @Bean
    //@DependsOn({"previousStudents", "instructors"})
    public Classroom previousCohort() {
        StudentConfig studentConfig = new StudentConfig();
        InstructorsConfig instructorsConfig = new InstructorsConfig();
        return new Classroom(studentConfig.previousStudents(), instructorsConfig.zipcodeInstructors());
    }

}
