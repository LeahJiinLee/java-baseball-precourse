package view;

public class OutputView {

    public void printThreeStrike() {
        System.out.println("3스트라이크");
    }

    public void printResult(int strikeCount, int ballCount) {
        if (strikeCount > 0) {
            System.out.print(strikeCount + "스트라이크 ");
        }
        if (ballCount > 0) {
            System.out.print(ballCount + "볼");
        }
        if (ballCount == 0 && strikeCount == 0) {
            System.out.print("낫싱");
        }
        System.out.println();
    }
}
