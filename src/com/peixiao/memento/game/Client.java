package com.peixiao.memento.game;

/**
 * @Author: Peixiao Zhao
 */
public class Client {

    public static void main(String[] args) {

        GameRole gameRole = new GameRole("A");
        gameRole.setVit(100);
        gameRole.setDef(100);
        gameRole.display();
        System.out.println("=============================");
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(gameRole.createMemento());

        gameRole.setVit(30);
        gameRole.setDef(30);
        gameRole.display();
        System.out.println("=============================");
        System.out.println("Recover");
        gameRole.recoverGameRoleFromMemento(caretaker.getMemento());
        gameRole.display();
    }
}
