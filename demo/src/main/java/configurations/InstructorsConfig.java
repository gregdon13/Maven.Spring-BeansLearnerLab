package configurations;

import classes.Instructor;
import classes.Instructors;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration("instructorsConfig")
public class InstructorsConfig {

    @Bean
    public Instructors tcUSAInstructors() {
        Instructor leon = new Instructor(123, "Leon");
        Instructor kevin = new Instructor(456, "Kevin");
        Instructor george = new Instructor(789, "George");
        return new Instructors(leon, kevin, george);
    }

    @Bean
    public Instructors tcUKInstructors() {
        Instructor eggy = new Instructor(987, "Eggy");
        Instructor michael = new Instructor(654, "Michael");
        Instructor christian = new Instructor(321, "Christian");
        return new Instructors(eggy, michael, christian);
    }

    @Bean(name = "instructors")
    @Primary
    public Instructors zipcodeInstructors() {
        Instructor dolio = new Instructor(100, "Dolio");
        Instructor kris = new Instructor(200, "Kris");
        Instructor nobles = new Instructor(300, "Nobles");
        return new Instructors(dolio, kris, nobles);
    }
}
