package com.peixiao.command;

/**
 * @Author: Peixiao Zhao
 */

// 创建命令接口
public interface Command {

    public void excute();

    public void undo();
}
