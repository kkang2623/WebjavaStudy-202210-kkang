package j06_조건;

import java.util.Scanner;

public class Condition6 {
    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);

       String selected = null;

        System.out.println("메뉴 1");
        System.out.println("메뉴 2");
        System.out.println("메뉴 3");
        System.out.println("메뉴 4");
        System.out.println("메뉴 5");
        System.out.println("실행할 명령을 선택하세요");
        selected = scanner.nextLine();

        switch (selected) {
            case "a":
                System.out.println("메뉴 1을 선택");
                break;
            case "b":
                System.out.println("메뉴 2을 선택");
                break;
            case "c":
                System.out.println("메뉴 3을 선택");
                break;
            case "d":
                System.out.println("메뉴 4을 선택");
                break;
            case "e":
                System.out.println("메뉴 5을 선택");
                break;
            default:
                System.out.println("해당 번호는 선택할 수 없습니다.");

        }


    }
}
