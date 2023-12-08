package View;

import Controller.ITetrisController;
import Controller.TetrisController;
import Controller.ITetrisView;
import Model.Tetris;

import processing.core.PApplet;

public class Client extends PApplet implements ITetrisView {

    private final int WIDTH = 1200;
    private final int HEIGHT = 900;
    private ITetrisController controller;

    public static void main(String args[]) {
        PApplet.main(Client.class);
    }

    public Client(){setSize(WIDTH, HEIGHT);}

    public void setup(){
        this.controller = new TetrisController(this, width, height);
    }


    @Override
    public void drawGame() {

    }

    @Override
    public void drawTitleScreen() {

    }
}
