package com.example.logic;

import java.util.ArrayList;
import java.util.List;

public class DataSingleton {

    private static final DataSingleton instance = new DataSingleton();
    private DataSingleton(){}
    private String lastWord = "";
    private String enteredWord;
    private List<String> availableWords;
    private List<String> usedWords = new ArrayList<>(60);
    private int moveCounter = 0;

    public static DataSingleton getInstance(){

        return instance;
    }

    public String getLastWord() {
        return lastWord;
    }

    public void setLastWord(String lastWord) {
        this.lastWord = lastWord;
    }

    public String getEnteredWord() {
        return enteredWord;
    }

    public void setEnteredWord(String enteredWord) {
        this.enteredWord = enteredWord;
    }

    public List<String> getAvailableWords() {
        return availableWords;
    }



    public void setAvailableWords(List<String> availableWords) {
        this.availableWords = availableWords;
    }
    public void removeAvailableWords(String enteredWord){
        availableWords.remove(enteredWord);
    }

    public List<String> getUsedWords() {
        return usedWords;
    }

    public void addUsedWords(String usedWord) {
        usedWords.add(usedWord);
    }

    public int getMoveCounter() {
        return moveCounter;
    }

    public void setMoveCounter(int moveCounter) {
        this.moveCounter = moveCounter;
    }
    public void incrementMoveCounter(){
        moveCounter++;
    }
}
