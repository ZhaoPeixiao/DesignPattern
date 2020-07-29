package com.peixiao.principle.ocp.improve;

/**
 * @Author: Peixiao Zhao
 */
public class Ocp {
    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Triangle());
        graphicEditor.drawShape(new Other());
    }
}


class GraphicEditor {
    public void drawShape(Shape s){
        s.draw();
    }
}

abstract class Shape{
    int m_type;

    public abstract void draw(); // 抽象方法
}


class Circle extends Shape{
    Circle(){
        super.m_type = 2;
    }

    @Override
    public void draw() {
        System.out.println("Circle");
    }
}

class Rectangle extends Shape{
    Rectangle(){
        super.m_type = 1;
    }

    @Override
    public void draw() {
        System.out.println("Rectangle");
    }
}

class Triangle extends Shape{
    Triangle(){
        super.m_type = 3;
    }

    @Override
    public void draw() {
        System.out.println("Triangle");
    }
}

class Other extends Shape{

    Other(){
        super.m_type = 4;
    }
    @Override
    public void draw() {
        System.out.println("Other");
    }
}