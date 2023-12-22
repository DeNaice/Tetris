package Model;

import Controller.ITetrisController;

import java.util.Random;

public class Tetris {

    private ITetrisController controller;
    private int width;
    private int height;
    private final int rows = 16;
    private final int cols = 10;

    private int[][] grid = new int[rows][cols];
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

    public int[][] generateRandomBlock() {
        Random random = new Random();
        int randomIndex = random.nextInt(FormMatrix.length);
        int[][] nextBlock = FormMatrix[randomIndex];
        return nextBlock;
    }

    public void spawnBlock() {


    }

}
