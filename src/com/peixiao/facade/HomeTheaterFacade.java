package com.peixiao.facade;

/**
 * @Author: Peixiao Zhao
 */
public class HomeTheaterFacade {

    // 定义各个子系统对象

    private TheaterLight theaterLight;
    private Popcorn popcorn;
    private Stereo stereo;
    private Projector projector;
    private Screen screen;
    private Player player;

    public HomeTheaterFacade() {
        this.theaterLight = theaterLight.getInstance();
        this.popcorn = popcorn.getInstance();
        this.stereo = stereo.getInstance();
        this.projector = projector.getInstance();
        this.screen = screen.getInstance();
        this.player = player.getInstance();
    }

    public void ready(){
        popcorn.on();
        popcorn.serve();
        screen.down();
        projector.on();
        stereo.on();
        player.on();
        theaterLight.dim();
    }

    public void play(){
        player.play();
    }

    public void pause(){
        player.pause();
    }

    public void end(){
        popcorn.off();
        theaterLight.bright();
        screen.up();
        projector.off();
        stereo.off();
        player.off();
    }

}
