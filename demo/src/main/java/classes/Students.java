package classes;

import abstractclasses.People;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Students extends People<Student> {

    public Students(Student... student) {
        super(student);
    }

    @Override
    public Iterator<Student> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super Student> action) {
        super.forEach(action);
    }

    @Override
    public Spliterator<Student> spliterator() {
        return super.spliterator();
    }
}
