package j09_클래스;

import java.util.Scanner;

public class ClassA {

//   클래스는 생성자이다
   /*ClassA(){}
   * 모든 클래스는 이게 숨겨져 있다.
   * 메소드,변수명은 소문자로 시작.
   * 생성자는 클래스명과 일치해야함.
   *
   * 생성자는 메소드처럼 쓸 수 있고,
   * 생성자는 오버로딩이 되면 기본 생성자는 작동하지 않는다. */

   //No argument constructor ???????????????????

   ClassA(){

   }

   ClassA(int a){
      System.out.println("a :" + a);
      System.out.println("ClassA를 생성합니다.");
   }


   int num;
   String name;
   double score;

   void callName(){
      System.out.println(name + "을(를) 부릅니다.");
   }


}
