package com.example.firstprogram;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    public void start(Stage stage) throws IOException {
        //Stage stage = new Stage();
        Group root = new Group(); // Creating a root node to arrange all of the different nodes that we have are components
        Scene scene = new Scene(root, Color.GRAY); // adding the root node to the scene - Color dot is to set a color

        Image icon = new Image("icon.png"); // Create a new object icon type image, which is going to be usable
        stage.getIcons().add(icon);
        stage.setTitle("Remo é o maior do norte"); // Adding a Title to the Scene

        // Metods to change the size of the window
        stage.setWidth(420);
        stage.setHeight(420);

        stage.setResizable(false); // Metod to set if the window is Resizable or not (if you can change the size or not)

        // Metods to set where the window is going to appear
        stage.setX(50);
        stage.setY(50);

        stage.setFullScreen(false);
        stage.setFullScreenExitHint("You can't escape unless you press 0");
        stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("0"));

        stage.setScene(scene); // adding the scene to the stage
        stage.show(); // Show the stage
    }
}
