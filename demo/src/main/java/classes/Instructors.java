package classes;

import abstractclasses.People;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Instructors extends People<Instructor> {

    public Instructors(Instructor... instructors) {
        super(instructors);
    }

    @Override
    public Iterator<Instructor> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super Instructor> action) {
        super.forEach(action);
    }

    @Override
    public Spliterator<Instructor> spliterator() {
        return super.spliterator();
    }
}
