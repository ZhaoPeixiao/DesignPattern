package com.peixiao.principle.inversion.improve;

/**
 * @Author: Peixiao Zhao
 */
public class DependencyPass {
    public static void main(String[] args) {
        // 方法 1
//        SonyTV sonyTV = new SonyTV();
//        OpenAndClose openAndClose = new OpenAndClose();
//        openAndClose.open(sonyTV);

        // 方法 2
//        SonyTV sonyTV = new SonyTV();
//        OpenAndClose openAndClose = new OpenAndClose(sonyTV);
//        openAndClose.open();

        // 方法 3
        SonyTV sonyTV = new SonyTV();
        OpenAndClose openAndClose = new OpenAndClose();
        openAndClose.setTv(sonyTV);
        openAndClose.open();
    }
}

class SonyTV implements ITV{
    @Override
    public void play() {
        System.out.println("sony大法好");
    }
}

// 方式1：通过接口传递实现依赖
// 开关的接口
//interface IOpenAndClode{
//    public void open (ITV tv);
//}
//
//interface ITV{
//    public void play();
//}
//
//class OpenAndClose implements IOpenAndClode {
//    public void open(ITV tv){
//        tv.play();
//    }
//}


// 方式2: 通过构造方法依赖传递
//interface IOpenAndClose{
//    public void open ();
//}
//
//interface ITV{
//    public void play();
//}
//
//class OpenAndClose implements IOpenAndClose{
//    public ITV tv;
//
//    public OpenAndClose(ITV tv){
//        this.tv = tv;
//    }
//    public void open(){
//        this.tv.play();
//    }
//}

// 方式3: 通过setter方法传递
interface IOpenAndClose{
    public void open();

    public void setTv(ITV tv);
}

interface ITV {
    public void play();
}

class OpenAndClose implements IOpenAndClose{
    private ITV tv;
    public void setTv(ITV tv){
        this.tv = tv;
    }

    public void open(){
        this.tv.play();
    }
}


