package classes;

import interfaces.Teacher;
import org.springframework.beans.factory.annotation.Autowired;

public class Classroom {
    Students students;
    Instructors instructors;

    @Autowired
    public Classroom(Students students, Instructors instructors) {
        this.instructors = instructors;
        this.students = students;
    }

    public void hostLecture(Teacher teacher, double numberOfHours) {
        for (Student s : students) {
            teacher.teach(s, numberOfHours/students.size());
        }
    }

    @Override
    public String toString() {
        String classroom = "Classroom{";
        for (Student s : this.students) {
            classroom += s.toString();
        }
        for (Instructor i : this.instructors) {
            classroom += i.toString();
        }
        classroom += "}";
        return classroom;
    }

    public Students getStudents() {
        return students;
    }

    public void setStudents(Students students) {
        this.students = students;
    }

    public Instructors getInstructors() {
        return instructors;
    }

    public void setInstructors(Instructors instructors) {
        this.instructors = instructors;
    }
}
