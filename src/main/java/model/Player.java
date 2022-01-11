package model;

import java.util.ArrayList;
import nextstep.utils.Console;
import view.Message;

public class Player {
    public ArrayList<Integer> playerNumber(){
        Validation validation = new Validation();
        ArrayList<Integer> numbers = new ArrayList<>();
        String userInput ="";
        userInput = Console.readLine();
        if (!validation.checkInputLength(userInput)) {
            return numbers;
        }
        for (int i=0; i<3; i++){
            if(validation.checkInputDuplicate(userInput.charAt(i)-'0',numbers)){
                numbers.add(userInput.charAt(i)-'0');
            }
        }
        return numbers;
    }
    public int startOrEnd(){
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        String userInput = Console.readLine();
        int startOrEndFlag = Integer.parseInt(userInput);
        return startOrEndFlag;
    }
}
