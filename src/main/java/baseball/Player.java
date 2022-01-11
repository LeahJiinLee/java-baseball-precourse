package baseball;

import java.util.ArrayList;
import nextstep.utils.Console;

public class Player {
    public ArrayList<Integer> playerNumber(){
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.print("숫자를 입력해주세요 : ");
        String userInput = Console.readLine();
        for (int i=0; i<userInput.length(); i++){
            if (numbers.contains(userInput.charAt(i)-'0')) {
                System.out.println("ERROR: 각 자리가 중복되지 않게 입력해주세요!");
                break;
            }
            else {
                numbers.add(userInput.charAt(i) - '0');
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
