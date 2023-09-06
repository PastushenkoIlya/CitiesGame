package com.example.logic;

import java.util.List;
import java.util.stream.Collectors;
public class LogicUtils {
    public static boolean isValid(String enteredString, List<String> availableWords, List<String> usedWords,String lastWord){
        //is not empty string validation
        String enteredWord= enteredString.toLowerCase();
        if(enteredWord.length() == 0){
            System.out.println("Enter a city name");
            return false;
        }
        //is not used word validation
        else if(usedWords.contains(caseFormatString(enteredWord.toLowerCase()))){
            System.out.println("You are repeating a city");
            return false;
        }
        //is existing city validation
        else if (!availableWords.contains(caseFormatString(enteredWord))){
            System.out.println("non existing city");
            return false;
        }
        //enteredWord's first letter is matching lastWord's last letter
        if(lastWord.equals("")) return true;
        else if (!(lastWord.substring(lastWord.length()-1).equals(enteredWord.substring(0,1)))) {
            System.out.println("The word must begin with a letter: " +
                    lastWord.substring(lastWord.length()-1));
            return false;
        }
        //words is valid
        return true;
    }
    public static String caseFormatString(String enteredString){
        //formats lOndON to London,
        return enteredString.substring(0, 1).toUpperCase() +
                enteredString.substring(1).toLowerCase( );
    }
    public static List<String> answerOptions(List<String> availableWords,String lastWord){
        //creating a new list with words that start with last letter of lastWord
        return availableWords.stream().filter(word -> word
                        .substring(0, 1)
                        .toLowerCase()
                        .equals(lastWord))
                .collect(Collectors.toList());
    }
    //is looking for the first needed word
    public static String getFirstAvailableWord(List<String> availableWords, String lastWord){
        return availableWords.stream()
                        .filter((word) -> word.toLowerCase().substring(0,1)
                            .equals(lastWord.substring(lastWord.length()-1))
                        )
                        .findFirst().orElse(null);
        }
    }

