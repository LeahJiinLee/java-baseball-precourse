package model;

import util.Message;
import java.util.ArrayList;

public class Validation {

    public boolean checkInputLength(String userInput) {
        if (userInput.length() < 3) {
            Message.printLengthErrorMessage();
            return false;
        }
        return true;
    }

    public boolean checkInputContainsZero(String userInput) {
        for (int i = 0; i < userInput.length(); i++) {
            if (userInput.charAt(i) == '0') {
                Message.printInputContainsZeroMessage();
                return false;
            }
        }
        return true;
    }

    public boolean checkInputFormat(String userInput) {
        for (int i = 0; i < userInput.length(); i++) {
            if (!(userInput.charAt(i) >= '0' && userInput.charAt(i) <= '9')) {
                Message.printInputValidErrorMessage();
                return false;
            }
        }
        return true;
    }

    public boolean checkInputDuplicate(int userInputDigit, ArrayList<Integer> numbers) {
        if (numbers.contains(userInputDigit)) {
            Message.printDuplicateErrorMessage();
            return false;
        }
        return true;
    }

    public boolean checkStartOrEndFlag(int startOrEndFlag) {
        if (startOrEndFlag == 1 || startOrEndFlag == 2) {
            return true;
        }
        return false;
    }
}
