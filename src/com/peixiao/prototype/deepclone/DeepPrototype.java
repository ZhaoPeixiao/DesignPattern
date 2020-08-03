package com.peixiao.prototype.deepclone;

import javax.management.ObjectName;
import java.io.*;

/**
 * @Author: Peixiao Zhao
 */
public class DeepPrototype implements Serializable, Cloneable {

    public String name;
    public DeepCloneableTarget deepCloneableTarget;

//    public DeepPrototype(String name, DeepCloneableTarget deepCloneableTarget) {
//        this.name = name;
//        this.deepCloneableTarget = deepCloneableTarget;
//    }

    public DeepPrototype() {
        super();
    }

    // 深拷贝
    // 方式1 使用clone方法

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object deep = null;
        // 完成对基本数据类型(属性)和字符串的克隆
        deep = super.clone();
        // 对应用类型的属性进行单独的处理
        DeepPrototype deepPrototype = (DeepPrototype) deep;
        deepPrototype.deepCloneableTarget = (DeepCloneableTarget) deepCloneableTarget.clone();

        return deepPrototype;
    }

    // 方式2 通过对象的序列化实现深拷贝(推荐)
    public Object deepClone(){

        // 创建流对象
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        try{
            // 序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);      // 当前这个对象以对象流的方式输出

            // 反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            DeepPrototype copyObj = (DeepPrototype) ois.readObject();

            return copyObj;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }finally {
            // 关闭流
            try{
                assert bos != null;
                bos.close();
                assert oos != null;
                oos.close();
                assert bis != null;
                bis.close();
                assert ois != null;
                ois.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }


    @Override
    public String toString() {
        return "DeepPrototype{" +
                "name='" + name + '\'' +
                ", deepCloneableTarget=" + deepCloneableTarget +
                ", hashcode=" + deepCloneableTarget.hashCode() +
                '}';
    }
}
