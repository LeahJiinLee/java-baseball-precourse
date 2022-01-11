package baseball;
import java.util.ArrayList;
public class Check {
    public int checkNumber (ArrayList<Integer> computerNumber, ArrayList<Integer> userNumber){
        //스트라이크 판단
        //볼 판단
        //낫싱 판단
        int strikeCount=0;
        int ballCount=0;
        for (int i=0; i<computerNumber.size(); i++){
            if (computerNumber.get(i) == userNumber.get(i)){
                strikeCount++;
            }
        }
        if (strikeCount==3){
            System.out.println("3스트라이크");
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
            return strikeCount;
        }

        for (int i=0; i<computerNumber.size(); i++){
            int checkIndex= userNumber.indexOf(computerNumber.get(i));
            if (checkIndex>-1 && checkIndex!=i){
                ballCount++;
            }
        }

        if (ballCount>0 && strikeCount==0){
            System.out.println(ballCount + "볼");
        }
        if (ballCount>0 && strikeCount>0){
            System.out.println(ballCount +"볼 "+strikeCount + "스트라이크");
        }
        if (ballCount ==0 && strikeCount==0) {
            System.out.println("낫싱");
        }
        return strikeCount;
    }
}
