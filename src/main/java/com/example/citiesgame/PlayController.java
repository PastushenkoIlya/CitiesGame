package com.example.citiesgame;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

public class PlayController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField cityNameInputField;

    @FXML
    private Button end;

    @FXML
    private Button move;

    @FXML
    private ProgressBar myProgressBar;

    @FXML
    private Label percent;

    @FXML
    private Button player1Computer;

    @FXML
    private Button player2User;

    @FXML
    private Label scorelabel;

    @FXML
    private Label startGame;

    @FXML
    private Text text;
    double progress;

    @FXML
    void cityNameInputField(ActionEvent event) {

    }

    @FXML
    void computerButton(ActionEvent event) {

    }

    @FXML
    void computersAnswer(MouseEvent event) {

    }

    @FXML
    void enterAName(MouseEvent event) {

    }

    @FXML
    void finishGame(ActionEvent event) {

    }

    @FXML
    void gamePercentage(MouseEvent event) {

    }

    @FXML
    void makeAMove(ActionEvent event) {
        if(progress < 0.9) {
            progress += 0.01;
            myProgressBar.setProgress(progress);
            percent.setText(Integer.toString((int) Math.round(progress * 100)) + " %");
        }
    }

    @FXML
    void scoreGame(MouseEvent event) {

    }

    @FXML
    void userButton(ActionEvent event) {

    }

    @FXML
    void initialize() {
        myProgressBar.setStyle("-fx-accent: rgba(80, 182, 240, 1);");
    }

}