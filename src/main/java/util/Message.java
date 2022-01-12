package util;

public class Message {
    public static void printInputMessage(){
        System.out.print("숫자를 입력해주세요 : ");
    }
    public static void printLengthErrorMessage(){
        System.out.println("ERROR: 숫자 세개를 입력해주세요!");
    }
    public static void printDuplicateErrorMessage(){
        System.out.println("ERROR: 각 자리가 중복되지 않게 입력해주세요!");
    }
    public static void printGameStartMessage(){
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
    }
    public static void printGameEndMessage(){
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }
    public static void printGameExitMessage(){
        System.out.println("게임 끝");
    }
}
