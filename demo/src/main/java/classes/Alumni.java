package classes;

import configurations.StudentConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Alumni {
    @Qualifier("previousCohort")
    @Autowired
    private Classroom classroom;

    @PostConstruct
    public void executeBootcamp() {
        int counter = 0;
        int instructorCounter = 0;
        for (Student s : classroom.students) {
            s.learn(1200);
            counter++;
        }
        for (Instructor in : classroom.instructors) {
            instructorCounter++;
        }
        double numOfHoursPerInstructor = (1200 * counter) / instructorCounter;
        for (Instructor in : classroom.instructors) {
            in.setNumberOfHoursTaught(numOfHoursPerInstructor);
        }
    }

    public Students getLastCohort() {
        return classroom.students;
    }

    public Instructors getInstructors() {
        return classroom.instructors;
    }
}
