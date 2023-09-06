package com.example.citiesgame;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class FinallyWindow_theComputerWon extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("computerWon-view.fxml"));
        stage.setTitle("Game Cities");

        Label welcomeText = new Label("Unfortunately, the computer won(");

//        Button playAgainButton = new Button("Play again");
//        playAgainButton.setOnAction(event -> {
//            // Open the main game window after pressing the button
//            PlayWindow gameWindowAgain = new PlayWindow();
//            try {
//                gameWindowAgain.start(stage);
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//            stage.close(); // Close the welcome window
//        });
        Button againButton = new Button("Play again");

        againButton.setOnAction(event -> {
            // Open the main game window after pressing the button
            PlayWindow gameWindow = new PlayWindow();
            try {
                gameWindow.start(new Stage());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            stage.close(); // Close the welcome window
        });

        Button closeGameButton = new Button("Close game");
        closeGameButton.setOnAction(event -> {
            Platform.exit();
        });

        VBox vbox = new VBox(10);
        vbox.getChildren().addAll(welcomeText, againButton, closeGameButton);
        vbox.setAlignment(Pos.CENTER);

        Scene scene = new Scene(vbox, 400, 200);

        stage.setScene(scene);

        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
