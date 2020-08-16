package com.peixiao.memento.game;

/**
 * @Author: Peixiao Zhao
 */
public class GameRole {

    private String name;
    private int vit;
    private int def;

    public Memento createMemento(){
        return new Memento(vit, def);
    }

    public void recoverGameRoleFromMemento(Memento memento){
        this.vit = memento.getVit();
        this.def = memento.getDef();
    }

    public void display() {
        System.out.println(name + "{" +
                "vit=" + vit +
                ", def=" + def +
                '}');
    }

    public GameRole(String name) {
        this.name = name;
    }

    public int getVit() {
        return vit;
    }

    public int getDef() {
        return def;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public void setDef(int def) {
        this.def = def;
    }
}
