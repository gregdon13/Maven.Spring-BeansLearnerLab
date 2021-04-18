package classes;

import interfaces.Teacher;

public class Classroom {
    Students students;
    Instructors instructors;

    public Classroom(Students students, Instructors instructors) {
        this.instructors = instructors;
        this.students = students;
    }

    public void hostLecture(Teacher teacher, double numberOfHours) {
        for (Student s : students) {
            teacher.teach(s, numberOfHours/students.size());
        }
    }
}
