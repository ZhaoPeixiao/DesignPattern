package com.peixiao.memento;

/**
 * @Author: Peixiao Zhao
 */
public class Client {

    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState("State 1");
        caretaker.add(originator.saveStateMemeto());

        originator.setState("State 2");
        caretaker.add(originator.saveStateMemeto());

        originator.setState("State 3");
        caretaker.add(originator.saveStateMemeto());

        System.out.println("Current");
        System.out.println(originator.getState());

        originator.getStateFromMemento(caretaker.get(0));
        System.out.println("Load");
        System.out.println(originator.getState());
    }
}
