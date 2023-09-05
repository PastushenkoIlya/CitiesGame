package com.example.citiesgame;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class PlayWindow extends Application {
        @Override
        public void start(Stage stage) throws IOException {
            FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("play-view.fxml"));
            Scene scene = new Scene(loader.load(),400,500);
            stage.setTitle("Game Cities");
            Label enterLabel = new Label("Enter the name of the city: ");
            TextField inputField = new TextField();
            Button clickButton = new Button("Make a move");
            Text answer = new Text();
            Label computersAnswer = new Label("Computer answered: " + answer.getText());

            // Add an event handler to check the entered word
            VBox vbox = new VBox(10);
            vbox.getChildren().addAll(enterLabel, inputField, clickButton, computersAnswer);
            vbox.setAlignment(javafx.geometry.Pos.CENTER);
            stage.setScene(scene);

            stage.show();
        }

        public static void main(String[] args) {
            launch(args);
    }
}

