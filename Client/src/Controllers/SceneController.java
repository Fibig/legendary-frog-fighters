package Controllers;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;


public class SceneController {
    Stage stage;
    int WIDTH;
    int HEIGHT;
    OnlineController onlineController;
    Scene activeScene;

    public SceneController(Stage stage, int WIDTH, int HEIGHT, OnlineController onlineController) {
        this.stage = stage;
        this.stage.setResizable(false);
        this.stage.setTitle("Legendary Frog Fighters");

        this.WIDTH = WIDTH;
        this.HEIGHT = HEIGHT;
        this.onlineController = onlineController;

        setMenuScene();
        this.stage.show();
    }

    public void setMenuScene()  {
        Pane pane = new Pane();
        VBox vBox = new VBox();

        Label label = new Label();
        label.setText("Menu Scene");

        TextField textField = new TextField();

        Button button = new Button();
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                try {
                    if (!textField.getText().isBlank()) {
                        //onlineController.bufferedWriter.write(textField.getText());
                        System.out.println(textField.getText());
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        vBox.getChildren().add(label);
        vBox.getChildren().add(textField);
        vBox.getChildren().add(button);

        pane.getChildren().add(vBox);

        Scene scene = new Scene(pane, WIDTH, HEIGHT);
        this.stage.setScene(scene);
    }

    public void setRoomScene()  {
        Pane pane = new Pane();
        VBox vBox = new VBox();

        Label label = new Label();
        label.setText("Menu Scene");

        TextField textField = new TextField();

        Button button = new Button();
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

            }
        });

        vBox.getChildren().add(label);
        vBox.getChildren().add(textField);
        vBox.getChildren().add(button);

        pane.getChildren().add(vBox);

        Scene scene = new Scene(pane, WIDTH, HEIGHT);
        this.stage.setScene(scene);
    }


}
