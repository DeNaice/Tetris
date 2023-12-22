package View;

import Controller.ITetrisController;
import Controller.TetrisController;
import Controller.ITetrisView;
import Model.Tetris;

import processing.core.PApplet;

public class Client extends PApplet implements ITetrisView {

    private final int WIDTH = 900;
    private final int HEIGHT = 900;
    private ITetrisController controller;

    public static void main(String args[]) {
        PApplet.main(Client.class);
    }

    public Client() {
        setSize(WIDTH, HEIGHT);
    }

    public void setup() {

        this.controller = new TetrisController(this, width, height);
        // Spielfeld aufbauen mit den Quadraten 10 breit 16 hoch
    }


    public void draw() {
        controller.nextFrame();
    }


    public void drawGame(int[][] grid) {

        drawSpielfeld(grid);
    }


    public void drawSpielfeld(int[][] grid) {
        int cellSize = (width / 10) / 2;
        // Zeichne das Spielfeld
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                int x = j * cellSize;
                int y = i * cellSize;
                if (grid[i][j] == 1) {
                    // Für jedes einzelne Feld -> Wenn Feld auf 1 gesetzt
                    stroke(150, 0, 150);
                    rect(x + 25, y + 25, 40, 40);
                    fill(150, 0, 150);
                    // Wenn das Feld auf 0 sitzt dann wird es leer
                } else {
                    noFill();
                    stroke(255, 255, 255);
                    rect(x + 25, y + 25, 40, 40);

                }
            }
        }
    }


    @Override
    public void drawTitleScreen() {

    }

    @Override
    public void drawEndScreen() {

    }


}