package Controllers;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.chart.BubbleChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.io.IOException;


public class SceneController {
    Stage stage;
    int WIDTH;
    int HEIGHT;
    OnlineController onlineController;

    public SceneController(Stage stage, int WIDTH, int HEIGHT, OnlineController onlineController) {
        this.stage = stage;
        this.stage.setResizable(false);
        this.stage.setTitle("Legendary Frog Fighters");

        this.WIDTH = WIDTH;
        this.HEIGHT = HEIGHT;
        this.onlineController = onlineController;

        setGameScene();
        this.stage.show();
    }

    public void setMenuScene() {
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

    public void setRoomScene() {
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


    public void setGameScene() {
        StackPane root = new StackPane();
        Scene scene = new Scene(root, 1200, 600);
        Image img = new Image("res/arena grün.png");

        BackgroundImage bImg = new BackgroundImage(img,
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.DEFAULT,
                BackgroundSize.DEFAULT);

        Background bGround = new Background(bImg);
        root.setBackground(bGround);

        stage.setScene(scene);
        stage.show();
    }


}
