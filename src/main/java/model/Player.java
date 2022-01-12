package model;

import java.util.ArrayList;
import nextstep.utils.Console;
import util.Message;

public class Player {

    Validation validation = new Validation();

    public ArrayList<Integer> playerNumber() {
        ArrayList<Integer> numbers = new ArrayList<>();
        String userInput;
        userInput = Console.readLine();
        if (!validation.checkInputFormat(userInput)) {
            return numbers;
        }
        if (!validation.checkInputLength(userInput)) {
            return numbers;
        }
        if (!validation.checkInputContainsZero(userInput)) {
            return numbers;
        }
        for (int i = 0; i < userInput.length(); i++) {
            if (validation.checkInputDuplicate(userInput.charAt(i) - '0', numbers)) {
                numbers.add(userInput.charAt(i) - '0');
            }
        }
        return numbers;
    }

    public int startOrEnd() {
        int startOrEndFlag = 0;
        while (!validation.checkStartOrEndFlag(startOrEndFlag)) {
            Message.printGameStartMessage();
            String userInput = Console.readLine();
            startOrEndFlag = Integer.parseInt(userInput);
        }
        return startOrEndFlag;
    }
}
