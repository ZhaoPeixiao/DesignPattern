package com.peixiao.visitor;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author: Peixiao Zhao
 */
public class ObjectStructure {

    // 维护一个集合
    private List<Person> persons = new LinkedList<>();

    // add
    public void attach(Person person){
        persons.add(person);
    }

    // remove
    public void detach(Person person){
        persons.remove(person);
    }

    // show
    public void display(Action action){
        for (Person person : persons){
            person.accept(action);
        }
    }
}
