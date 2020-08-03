package com.peixiao.prototype.deepclone;

import java.io.Serializable;

/**
 * @Author: Peixiao Zhao
 */
public class DeepCloneableTarget implements Serializable, Cloneable {

    private static final long serialVersionID = 1L;

    private String cloneName;
    private String cloneClass;

    public DeepCloneableTarget(String cloneName, String cloneClass){
        this.cloneClass = cloneClass;
        this.cloneName = cloneName;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "DeepCloneableTarget{" +
                "cloneName='" + cloneName + '\'' +
                ", cloneClass='" + cloneClass + '\'' +
                '}';
    }
}
