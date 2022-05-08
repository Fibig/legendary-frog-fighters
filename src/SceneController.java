import com.sun.tools.javac.Main;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
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

        setMenuScene();
    }

    public void setMenuScene()  {
        Pane pane = new Pane();
        VBox vBox = new VBox();
        HBox hBox = new HBox();

        Label label = new Label();
        label.setText("Menu Scene");
        TextField textField = new TextField();
        Button button = new Button();
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                setGameScene();
            }
        });

        pane.getChildren().add(button);
        pane.getChildren().add(label);
        pane.getChildren().add(textField);




        Scene scene = new Scene(pane, this.WIDTH, this.HEIGHT);


        this.stage.setScene(scene);
        this.stage.show();
    }

    public void setGameScene()  {
        Pane pane = new Pane();

        Label label = new Label();
        label.setText("GAME Scene");


        pane.getChildren().add(label);




        Scene scene = new Scene(pane, this.WIDTH, this.HEIGHT);


        this.stage.setScene(scene);
        this.stage.show();
    }


}
