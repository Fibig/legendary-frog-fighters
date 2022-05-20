import Controllers.OnlineController;
import Controllers.SceneController;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
    public final int WIDTH = 1200;
    public final int HEIGHT = 600;
    public final String HOST = "localhost";
    public final int PORT = 22333;


    @Override
    public void start(Stage stage) {
        new SceneController(stage, this.WIDTH, this.HEIGHT, this.HOST, this.PORT);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
