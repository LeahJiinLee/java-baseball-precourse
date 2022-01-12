package controller;

import model.Check;
import model.Computer;
import model.Player;
import java.util.ArrayList;
import util.Message;
import view.OutputView;

public class Game {

    public void play() {
        //게임 시작시

        ArrayList<Integer> computerNumber;
        ArrayList<Integer> userNumber;
        int strikeCount;
        int ballCount;
        int startOrEndFlag;
        Computer computer = new Computer();
        Player player = new Player();
        Check check = new Check();
        OutputView outputView = new OutputView();
        computerNumber = computer.computerNumberGenerator();  //컴퓨터 수 생성 -> 처음 생성되고 끝날 때까지 바뀌지 않음

        while (true) {
            startOrEndFlag = 0;
            Message.printInputMessage();
            userNumber = player.playerNumber(); //사용자수 입력받기
            if (userNumber.size() < 3) {
                continue;
            }
            strikeCount = check.checkStrikeCount(computerNumber, userNumber); //스트라이크 판단
            ballCount = check.checkBallCount(computerNumber, userNumber); //볼 판단
            if (strikeCount == 3) {
                outputView.printThreeStrike();
                Message.printGameEndMessage();
                startOrEndFlag = player.startOrEnd();
            }
            if (strikeCount < 3) {
                outputView.printResult(strikeCount, ballCount);
            }
            if (startOrEndFlag == 1) {
                computerNumber = computer.computerNumberGenerator();
                continue;
            }
            if (startOrEndFlag == 2) {
                Message.printGameExitMessage();
                break;
            }
        }

    }
}
