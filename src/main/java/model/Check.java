package model;

import java.util.ArrayList;

public class Check {

    public int checkStrikeCount(ArrayList<Integer> computerNumber, ArrayList<Integer> userNumber) {
        int strikeCount = 0;
        for (int i = 0; i < computerNumber.size(); i++) {
            if (computerNumber.get(i) == userNumber.get(i)) {
                strikeCount++;
            }
        }
        return strikeCount;
    }

    public int checkBallCount(ArrayList<Integer> computerNumber, ArrayList<Integer> userNumber) {
        int ballCount = 0;
        for (int i = 0; i < computerNumber.size(); i++) {
            int checkIndex = userNumber.indexOf(computerNumber.get(i));
            if (checkIndex > -1 && checkIndex != i) {
                ballCount++;
            }
        }
        return ballCount;
    }
}
