package configurations;

import classes.Classroom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration("classroomConfig")
public class ClassroomConfig {
    private final StudentConfig studentConfig = new StudentConfig();

    private final InstructorsConfig instructorsConfig = new InstructorsConfig();


    @Bean("currentCohort")
    //@DependsOn(value = {"students", "instructors"})
    public Classroom currentCohort() {
        return new Classroom(studentConfig.currentStudents(), instructorsConfig.zipcodeInstructors());
    }

    @Bean("lastCohort")
    //@DependsOn(value ={"previousStudents", "instructors"})
    public Classroom previousCohort() {
        return new Classroom(studentConfig.previousStudents(), instructorsConfig.zipcodeInstructors());
    }

    public StudentConfig getStudentConfig() {
        return studentConfig;
    }

    public InstructorsConfig getInstructorsConfig() {
        return instructorsConfig;
    }
}
