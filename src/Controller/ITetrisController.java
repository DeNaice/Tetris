package Controller;

import java.io.IOException;

public interface ITetrisController {
    void nextFrame() throws IOException;

    void updateState();
}
