package Model;

import Controller.ITetrisController;

public class Tetris {

    private ITetrisController controller;
    public int width, height;


    public Tetris(int width, int height){

        this.width = width;
        this.height = height;
    }
}
