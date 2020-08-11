package com.peixiao.command;

/**
 * @Author: Peixiao Zhao
 */
public class RemoteController {

    // 开按钮的命令数组
    Command[] onCommands;
    Command[] offCommands;

    // 执行撤销的命令
    Command undoCommands;

    public RemoteController() {
        onCommands = new Command[5];
        offCommands = new Command[5];

        for (int i = 0; i < 5; i ++){
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    // 给我们的按钮设置你需要的命令即可
    public void setCommand(int num, Command onCommand, Command offCommand){
        onCommands[num] = onCommand;
        offCommands[num] = offCommand;
    }

    // 按下开按钮
    public void onButtonPushed(int num){
        // 找到你按下的按钮，并调用相应方法
        onCommands[num].excute();
        // 记录最后这次的操作, 用于撤销
        undoCommands = onCommands[num];
    }

    // 按下关按钮
    public void offButtonPushed(int num){
        // 找到你按下的按钮，并调用相应方法
        offCommands[num].excute();
        // 记录最后这次的操作, 用于撤销
        undoCommands = offCommands[num];
    }


    // 按下撤销按钮
    public void undoButtonPushed(){
        undoCommands.undo();
    }
}
