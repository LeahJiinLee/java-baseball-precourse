package model;

import view.Message;
import java.util.ArrayList;
public class Validation {
    public boolean checkInputLength(String userInput){
        if (userInput.length()<3){
            Message.printLengthErrorMessage();
            return false;
        }
        return true;
    }
    public boolean checkInputDuplicate(int userInputDigit, ArrayList<Integer> numbers){
        if (numbers.contains(userInputDigit)) {
            Message.printDuplicateErrorMessage();
            return false;
        }
        return true;
    }
}
