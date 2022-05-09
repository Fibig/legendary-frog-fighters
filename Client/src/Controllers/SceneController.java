package Controllers;

import Scenes.MenuScene;
import Scenes.SceneProperties;
import javafx.stage.Stage;


public class SceneController {
    Stage stage;
    int WIDTH;
    int HEIGHT;

    public SceneController(Stage stage, int WIDTH, int HEIGHT) {
        this.stage = stage;
        this.stage.setResizable(false);
        this.stage.setTitle("Legendary Frog Fighters");

        this.WIDTH = WIDTH;
        this.HEIGHT = HEIGHT;

        setStageScene(new MenuScene());
        this.stage.show();
    }

    public void setStageScene(SceneProperties scene)  {
        this.stage.setScene(scene.generate(this.WIDTH, this.HEIGHT));

    }


}
