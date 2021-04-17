package classes;

import interfaces.Learner;
import interfaces.Teacher;

import java.util.ArrayList;
import java.util.Iterator;

public class Instructor extends Person implements Teacher {

    public Instructor(long id, String name) {
        super(id, name);
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
}
