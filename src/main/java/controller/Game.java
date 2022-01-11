package controller;

import model.Check;
import model.Computer;
import model.Player;
import java.util.ArrayList;

public class Game {
    public void play(){
        //게임 시작시

        ArrayList<Integer> computerNumber;
        ArrayList<Integer> userNumber;
        int strikeCount;
        int startOrEndFlag;
        Computer computer= new Computer();
        Player player = new Player();
        Check check = new Check();
        computerNumber= computer.computerNumberGenerator();  //컴퓨터 수 생성 -> 처음 생성되고 끝날 때까지 바뀌지 않음

        while (true){
            startOrEndFlag=0;
            userNumber=player.playerNumber(); //사용자수 입력받기
            if (userNumber.size()<3) continue;
            strikeCount=check.checkNumber(computerNumber,userNumber);
            if(strikeCount==3){
                startOrEndFlag=player.startOrEnd();
            }
            if (startOrEndFlag==1) {
                computerNumber= computer.computerNumberGenerator();
                continue;
            }
            if (startOrEndFlag==2) {
                System.out.println("게임 끝");
                break;
            }
        }

    }
}
