package Scenes;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class MenuScene extends SceneProperties {
    @Override
    public Scene generate(int WIDTH, int HEIGHT) {
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
        return scene;
    }
}
