package classes;

import abstractclasses.People;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Students extends People<Student> {

    public Students(Student... student) {
        super(student);
    }


    @Override
    public Iterator<Student> iterator() {
        return super.findAll().iterator();
    }

    @Override
    public void forEach(Consumer<? super Student> action) {
        super.forEach(action);
    }

    @Override
    public Spliterator<Student> spliterator() {
        return super.spliterator();
    }

    @Override
    public String toString() {
        String out = "Students{";
        for (Student s : super.findAll()) {
            out += s.toString();
        }
        out += "}";
        return out;
    }

}
