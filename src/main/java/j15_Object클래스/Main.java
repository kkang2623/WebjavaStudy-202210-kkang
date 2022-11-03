package j15_Object클래스;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ObjectTest objectTest = new ObjectTest(); //클래스 생성

        int hashCode = objectTest.hashCode();

        System.out.println(hashCode); //해당 객체의 실제 주소
        System.out.println(Integer.toHexString(hashCode)); //해시코드란 정수를 16진수로 바꿔라

        System.out.println(objectTest);
    }
}
