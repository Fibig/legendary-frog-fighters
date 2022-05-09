import Controllers.GameController;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
    public final int WIDTH = 1200;
    public final int HEIGHT = 600;

    @Override
    public void start(Stage stage) {
        new GameController(stage, WIDTH, HEIGHT);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
