package classes;

import abstractclasses.People;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Instructors extends People<Instructor> {

    public Instructors(Instructor... instructors) {
        super(instructors);
    }

    public int numOfInstructors() {
        int counter = 0;
        for (Instructor in : super.findAll()) {
            counter++;
        }
        return counter;
    }

    @Override
    public Iterator<Instructor> iterator() {
        return super.findAll().iterator();
    }

    @Override
    public void forEach(Consumer<? super Instructor> action) {
        super.forEach(action);
    }

    @Override
    public Spliterator<Instructor> spliterator() {
        return super.spliterator();
    }

    @Override
    public String toString() {
        String out = "{";
        for (Instructor in : super.findAll()) {
            out += in.toString();
        }
        out += "}";
        return out;
    }
}
