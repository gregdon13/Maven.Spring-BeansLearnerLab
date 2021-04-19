package classes;

import interfaces.Learner;
import interfaces.Teacher;

import java.util.ArrayList;
import java.util.Iterator;

public class Instructor extends Person implements Teacher {
    double numberOfHoursTaught;

    public Instructor(long id, String name) {
        super(id, name);
    }

    public double getNumberOfHoursTaught() {
        return numberOfHoursTaught;
    }

    public void setNumberOfHoursTaught(double numberOfHoursTaught) {
        this.numberOfHoursTaught = numberOfHoursTaught;
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    @Override
    public void lecture(Iterable<? extends Learner> learners, double numberOfHours) {
        int counter = 0;
        while(learners.iterator().hasNext()) {
            counter++;
        }
        int finalCounter = counter;
        learners.forEach(learner -> learner.learn(numberOfHours / finalCounter));
    }

    @Override
    public String toString() {
        return "Instructor{" + "id=" + this.id + ", name=" + this.name + "}";
    }
}
