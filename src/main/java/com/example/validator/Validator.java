package com.example.validator;

import java.util.List;

public class Validator {
    public boolean isValid(String enteredWord, List<String> wordList, List<String> usedWords, String lastWord){
        //is not empty string validation
        if(enteredWord.length() == 0){
            System.out.println("Enter a city name");
            return false;
        }
        //is not used word validation
        else if(usedWords.contains(enteredWord)){
            System.out.println("You are repeating a city");
            return false;
        }
        //is existing city validation
        else if (!wordList.contains(enteredWord.substring(0, 1).toUpperCase() +
                enteredWord.substring(1).toLowerCase( ))){
            System.out.println("non existing city");
            return false;
        }
        //enteredWord's first letter is matching lastWord's last letter
         else if (!lastWord.substring(lastWord.length()-1).equals(enteredWord.substring(0,1))) {
            System.out.println("city name is incorrect");
            return false;
        }
         //words is valid
        return true;
    }
}
