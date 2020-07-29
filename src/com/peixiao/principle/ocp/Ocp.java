package com.peixiao.principle.ocp;

/**
 * @Author: Peixiao Zhao
 */
public class Ocp {
    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Ciecle());
        graphicEditor.drawShape(new Triangle());
    }
}


class GraphicEditor {
    public void drawShape(Shape s){
        if (s.m_type == 1){
            drawRectangle(s);
        }
        else if (s.m_type == 2){
            drawCircle(s);
        }
        else if (s.m_type == 3){
            drawTriangle(s);
        }
        else{
            System.out.println("Unknown");
        }
    }

    private void drawRectangle(Shape r){
        System.out.println("Rectangle");
    }

    private void drawCircle(Shape r){
        System.out.println("Circle");
    }

    private void drawTriangle(Shape r){
        System.out.println("Triangle");
    }
}

class Shape{
    int m_type;
}


class Ciecle extends Shape{
    Ciecle(){
        super.m_type = 2;
    }
}

class Rectangle extends Shape{
    Rectangle(){
        super.m_type = 1;
    }
}

class Triangle extends Shape{
    Triangle(){
        super.m_type = 3;
    }
}