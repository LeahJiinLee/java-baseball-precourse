package baseball;

import java.util.ArrayList;
import nextstep.utils.Console;

public class Player {
    public ArrayList<Integer> playerNumber(){
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.print("숫자를 입력해주세요 : ");
        String userInput = Console.readLine();
        for (int i=0; i<userInput.length(); i++){
            numbers.add(userInput.charAt(i)-'0');
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