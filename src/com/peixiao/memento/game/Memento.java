package com.peixiao.memento.game;

/**
 * @Author: Peixiao Zhao
 */
public class Memento {

    private int vit;
    private int def;

    public Memento(int vit, int def) {
        this.vit = vit;
        this.def = def;
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
