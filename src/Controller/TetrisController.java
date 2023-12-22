package Controller;

import Model.Tetris;
import View.Client;

import java.io.IOException;

public class TetrisController implements ITetrisController {

    private Tetris model;
    private ITetrisView view;
    private GameState state;


    public TetrisController(ITetrisView view, int width, int height) {

        this.state = GameState.GAME;
        this.view = view;
        this.model = new Tetris(width, height);
    }

    @Override
    public void nextFrame() {

        switch (state) {
            case TITLESCREEN -> {


                view.drawTitleScreen();


            }
            case GAME -> {

                view.drawGame(model.returnSpielfeld());
                model.generateRandomBlock();
            }
            case END_SCREEN -> {

                view.drawEndScreen();

            }
        }

    }

    @Override
    public void updateState() {

        if (state == GameState.TITLESCREEN) {

            state = GameState.GAME;

        } else if (state == GameState.GAME) {

            state = GameState.END_SCREEN;

        } else if (state == GameState.END_SCREEN) {

            state = GameState.TITLESCREEN;
        }
    }
}

