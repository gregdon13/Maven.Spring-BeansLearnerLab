package classes;

import interfaces.Learner;

public class Student extends Person implements Learner {
    double totalStudyTime;

    public Student(long id, String name) {
        super(id, name);
    }

    @Override
    public void learn(double numberOfHours) {
        totalStudyTime += numberOfHours;
    }

    public double getTotalStudyTime() {
        return totalStudyTime;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + this.id + ", name=" + this.name + ", studyhours=" + this.totalStudyTime + "}";
    }
}
