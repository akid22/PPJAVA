package com.example.bmiak;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;


import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));

        Label height = new Label("Enter Height");
        Label weight = new Label("Enter Weight");
        Label result = new Label("BMI = ");
        TextField textField1 = new TextField();
        textField1.setText("0");
        textField1.setStyle("-fx-background-color: rgb(192, 224, 240);");
        textField1.setStyle("-fx-border-color: #000000; ");
        height.setAlignment(Pos.CENTER);

        TextField textField2 = new TextField();
        textField2.setText("0");

        TextField textField3 = new TextField();

        Button button = new Button( "BMI Result = ");

        GridPane grid = new GridPane();
        grid.addRow(0, height, textField1);
        grid.addRow(1, weight, textField2);
        grid.addRow(2, result, textField3);
        grid.addRow(3, button);
        Scene scene=new Scene(grid, 1000, 500);
        ImageView image = new ImageView(new Image("KANTAR.gif"));
        grid.add(image, 1, 5);

        stage.setTitle("BMI Calculator");
        stage.setScene(scene);
        stage.show();

        button.setOnAction(e -> {
            String height1 = textField1.getText();
            String weight1 = textField2.getText();

            BMI bmi = new BMI("Johnny", 23, Integer.parseInt(weight1),Integer.parseInt(height1) );
            textField3.setText("" + bmi.getBMI());

        });

    }

    public static void main(String[] args) {
        launch();
    }
}