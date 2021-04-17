package abstractclasses;

import classes.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class People<PersonType extends Person> implements Iterable<PersonType>{
    List<PersonType> personList;

    public People(List<PersonType> personList) {
        this.personList = personList;
    }

    public People(PersonType... person) {
        personList = new ArrayList<>();
        personList.addAll(Arrays.asList(person));
    }

    public void add(PersonType pType) {
        personList.add(pType);
    }

    public void remove(PersonType pType) {
        personList.remove(pType);
    }

    public int size() {
        return personList.size();
    }

    public void clear() {
        personList.clear();
    }

    public void addAll(Iterable<PersonType> personTypes) {
        for (PersonType p : personTypes) {
            personList.add(p);
        }
    }

    public PersonType findById(long id) {
        for (PersonType p : personList) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    public List<PersonType> findAll() {
        return personList;
    }
}
