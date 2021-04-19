package classes;

import configurations.ClassroomConfig;
import configurations.StudentConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Alumni {

    ClassroomConfig classroomConfig = new ClassroomConfig();
    Classroom classroom = new Classroom(classroomConfig.previousCohort().students, classroomConfig.previousCohort().instructors);
    public Students oldHeads;

    @PostConstruct
    public void executeBootcamp() {
        int counter = 0;
        int instructorCounter = 0;
        for (Student s : classroom.getStudents()) {
            s.learn(1200);
            counter++;
        }
        for (Instructor in : classroom.getInstructors()) {
            instructorCounter++;
        }
        double numOfHoursPerInstructor = (1200 * counter) / instructorCounter;
        for (Instructor in : classroom.getInstructors()) {
            in.setNumberOfHoursTaught(numOfHoursPerInstructor);
        }
    }

    public ClassroomConfig getClassroomConfig() {
        return classroomConfig;
    }

    public Classroom getClassroom() {
        return classroom;
    }
}
