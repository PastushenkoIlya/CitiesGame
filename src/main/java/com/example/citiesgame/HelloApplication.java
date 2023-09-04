package com.example.citiesgame;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        stage.setTitle("Game Cities");

        Label welcomeText = new Label("Welcome to the game of childhood, to the game of Сities!");


        Button startButton = new Button("START");
        startButton.setOnAction(event -> {
            // Відкрити головне вікно гри після натискання кнопки
            PlayWindow gameWindow = new PlayWindow();
            try {
                gameWindow.start(new Stage());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            stage.close(); // Закрити вітальне вікно
        });

        VBox vbox = new VBox(10);
        vbox.getChildren().add(welcomeText);
        vbox.getChildren().add(startButton);
        vbox.setAlignment(Pos.CENTER);

        Scene scene = new Scene(vbox, 400, 100);

        stage.setScene(scene);

        stage.show();
    }

    public static void main(String[] args) throws IOException {
        launch();
        }
    }
