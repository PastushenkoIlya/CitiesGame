package com.example.citiesgame;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.ResourceBundle;

import com.example.logic.DataSingleton;
import com.example.logic.LogicUtils;
import com.example.parser.Parser;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
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
    private Button end1;
    @FXML
    private Button end2;
    @FXML
    private Button move;
    @FXML
    private Text score;
    @FXML
    private Label startGame;
    @FXML
    private Text text;
    @FXML
    private Text scoreOutput;



    List<String> wordsAvailable;
    DataSingleton dataSingleton;
    public PlayController (){
        try {
            dataSingleton = DataSingleton.getInstance();
            dataSingleton.setAvailableWords(Parser.parse());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }




    @FXML
    void cityNameInputField(ActionEvent event) {

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
    void makeAMove(ActionEvent event) {
        dataSingleton.setEnteredWord(cityNameInputField.getText());
        if(LogicUtils.isValid(
                //check if it's a word, if it's not repeated...
                dataSingleton.getEnteredWord(),
                dataSingleton.getAvailableWords(),
                dataSingleton.getUsedWords(),
                dataSingleton.getLastWord()

        )){

            //adding to used words
            dataSingleton.addUsedWords(dataSingleton.getEnteredWord());
            //removing from available words list
            dataSingleton.removeAvailableWords(dataSingleton.getEnteredWord());
            //creating list of options to answer
            //soooo long time is needed
            /*

            List<String> answerOptions = LogicUtils.answerOptions(dataSingleton.getAvailableWords(),
                    dataSingleton.getLastWord());
            Random rand = new Random();
            rand.nextInt(answerOptions.size());
            text.setText(answerOptions.get(rand.nextInt(answerOptions.size())));

             */
            text.setText(dataSingleton.getAvailableWords());
            dataSingleton.setLastWord(dataSingleton.getEnteredWord());

            dataSingleton.incrementMoveCounter();
        }

    }

    @FXML
    void scoreGame(MouseEvent event) {

    }

    @FXML
    void surrended(ActionEvent event) {

    }

    @FXML
    void initialize() {

    }

}
