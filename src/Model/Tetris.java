package Model;

import Controller.ITetrisController;

import java.util.Arrays;
import java.util.Random;

public class Tetris {

    private ITetrisController controller;
    private int width;
    private int height;
    private final int rows = 16;
    private final int cols = 10;
    //TODO  grid eindimensional machen und FormMatrix 2 Dimensional
    private int[][] grid = new int[rows][cols];

    // TEST

    private int[][] nextBlock;
    private final int[][][] FormMatrix = {
            {
                    {1, 1},
                    {1, 1}
            },
            {
                    {1, 1, 1, 1},
                    {0, 0, 0, 0},
                    {0, 0, 0, 0},
                    {0, 0, 0, 0}
            },
            {
                    {1, 0, 0},
                    {1, 1, 1},
                    {0, 0, 0}
            },
            {
                    {0, 0, 1},
                    {1, 1, 1},
                    {0, 0, 0}
            },
            {
                    {0, 1, 1},
                    {1, 1, 0},
                    {0, 0, 0}
            },
            {
                    {0, 1, 0},
                    {1, 1, 1},
                    {0, 0, 0}
            },
            {
                    {1, 1, 0},
                    {0, 1, 1},
                    {0, 0, 0}
            }

    };

    public Tetris(int width, int height) {

        this.width = width;
        this.height = height;

    }

    public int[][] returnSpielfeld() {
        return grid;
    }

    public void generateRandomBlock() {
        Random random = new Random();
        int randomIndex = random.nextInt(FormMatrix.length);
        nextBlock = FormMatrix[randomIndex];

    }


    public void spawnBlock() {


    }

    public void leereGrid() {
        for (int i = 0; i <= cols; i++) {
            for (int j = 0; j <= rows; j++) {
                grid[i][j] = 0;
            }

        }
        System.out.println("Grid ist geleert");
    }

}
