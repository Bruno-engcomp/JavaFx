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
        Scene scene = new Scene(root, 600, 600,Color.LIGHTSKYBLUE); // Chose the sizeand color of scene
        Stage stage = new Stage();


        // Text
        Text text = new Text(); // Creating a new object text
        text.setText("Clube do remo"); //Set the text that will be printed

        // Set the position of the text
        text.setX(50);
        text.setY(50);

        // Metod to choose the Font and the size of the font
        text.setFont(Font.font("Verdana", 50));
        // Metod to choose the color of font
        text.setFill(Color.GRAY);

        // LINE
        Line line = new Line(); // Create the object line

        // Set the position of start of line
        line.setStartX(200);
        line.setStartY(200);

        // Set the position of the end of line
        line.setEndX(500);
        line.setEndY(200);

        // Set the stroke of the line
        line.setStrokeWidth(25);
        line.setStroke(Color.RED); // Set the color of the line
        line.setOpacity(0.5); // Set the Opacity of the line
        line.setRotate(45); // Set the Rotate of the line

        // RECTANGLE
        Rectangle rectangle = new Rectangle(); // Creating a new object Rectangle

        // Metods to set the position of the rectangle
        rectangle.setX(100);
        rectangle.setY(100);

        // Metods to set the size of the rectangle
        rectangle.setWidth(100);
        rectangle.setHeight(100);

        // Metod to add the objects to the group root
        root.getChildren().add(text); // To add the object text to the group root
        root.getChildren().add(line); // To add the object line to the group root
        root.getChildren().add(rectangle); // To add the object rectangle to the group root

        stage.setScene(scene); //Set the object scene to stage
        stage.show(); // Show stage

    }
}
