package com.example.drawingstuff;


import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage) {
        Group root = new Group();
        Scene scene = new Scene(root, 600, 600,Color.LIGHTSKYBLUE);
        Stage stage = new Stage();

        Text text = new Text("");
        text.setText("Clube do remo");
        text.setX(50);
        text.setY(50);

        root.getChildren().add(text);
        stage.setScene(scene);
        stage.show();

    }
}
