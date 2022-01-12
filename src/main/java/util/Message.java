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

}
