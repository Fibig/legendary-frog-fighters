package Controllers;

import javafx.stage.Stage;

public class GameController {
    public GameController(Stage stage, int WIDTH, int HEIGHT) {
        startGameController(stage, WIDTH, HEIGHT);
    }


    public void startGameController(Stage stage, int WIDTH, int HEIGHT)  {
        new SceneController(stage, WIDTH, HEIGHT);
        new OnlineController();
    }
}
