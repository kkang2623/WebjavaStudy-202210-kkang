package j06_조건;

import java.util.Scanner;

public class Condition4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String selected =null;

        System.out.println("[선택 프로그램]");
        System.out.println("a. 짜장");
        System.out.println("b. 짬뽕");
        System.out.println("c. 탕수육");
        System.out.println("d. 깐풍기");
        System.out.println("e. 팔보채");
        System.out.println("실행할 명령을 선택하세요 : ");
        selected = scanner.nextLine();

        switch (selected) { //자료형이 같아야 한다.
            case "a":
                System.out.println("짜장을 선택하셨습니다.");
                break;
            case "b":
                System.out.println("짬뽕 선택하셨습니다.");
                break;
            case "c":
                System.out.println("탕수육 선택하셨습니다.");
                break;
            case "d":
                System.out.println("깐풍기 선택하셨습니다.");
                break;
            case "e":
                System.out.println("팔보채 선택하셨습니다.");
        }

    }
}
