package com.peixiao.command;

/**
 * @Author: Peixiao Zhao
 */
public class Client {

    public static void main(String[] args) {

        // 使用命令设计模式，完成通过遥控器对 点灯的操作

        // 创建点灯的对象
        LightReceiver lightReceiver = new LightReceiver();

        // 创建点灯相关的开关命令
        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
        LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);

        // 需要一个遥控器
        RemoteController remoteController = new RemoteController();

        // 给遥控器设置相关命令， 比如 num = 0 是点灯的开何关操作
        remoteController.setCommand(0, lightOnCommand, lightOffCommand);

        System.out.println("--- Light On Button Pressed ----");
        remoteController.onButtonPushed(0);
        System.out.println("--- Light Off Button Pressed ----");
        remoteController.offButtonPushed(0);
        System.out.println("--- Undo Button Pressed ---");
        remoteController.undoButtonPushed();

        System.out.println();
        System.out.println();
        System.out.println();

        TVReceiver tvReceiver = new TVReceiver();

        // 创建点灯相关的开关命令
        TVOnCommand tvOnCommand = new TVOnCommand(tvReceiver);
        TVOffCommand tvOffCommand = new TVOffCommand(tvReceiver);

        remoteController.setCommand(1, tvOnCommand, tvOffCommand);

        System.out.println("--- TV On Button Pressed ----");
        remoteController.onButtonPushed(1);
        System.out.println("--- TV Off Button Pressed ----");
        remoteController.offButtonPushed(1);
        System.out.println("--- Undo Button Pressed ---");
        remoteController.undoButtonPushed();
    }
}
