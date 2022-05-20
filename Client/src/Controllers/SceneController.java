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
        Pane root = new Pane();
        Scene scene = new Scene(root, 1200, 600);
        Image background = new Image("res/arena grün.png");

        BackgroundImage bImg = new BackgroundImage(background,
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.DEFAULT,
                BackgroundSize.DEFAULT);

        Background bGround = new Background(bImg);
        root.setBackground(bGround);

        Image normal = new Image("res/alle frösche/normaler frosch.png",160,160,false,true);
        ImageView normalFrosch = new ImageView(normal);
        normalFrosch.setX(900);
        normalFrosch.setY(300);

        Image musik = new Image("res/alle frösche/musik frosch.png",160, 160,false,true);
        ImageView musikFrosch = new ImageView(musik);
        musikFrosch.setX(700);
        musikFrosch.setY(225);

        Image weinen = new Image("res/alle frösche/weinender frosch.png",160, 160,false,true);
        ImageView weinFrosch = new ImageView(weinen);
        weinFrosch.setX(850);
        weinFrosch.setY(150);


        root.getChildren().add(normalFrosch);
        root.getChildren().add(musikFrosch);
        root.getChildren().add(weinFrosch);


        stage.setScene(scene);
        stage.show();
    }


}


