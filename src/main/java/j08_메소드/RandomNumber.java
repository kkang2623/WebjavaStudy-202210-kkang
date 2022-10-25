package j08_메소드;

import java.util.Random;

public class RandomNumber {
public static int calcRandom(int m){ //변수 m // 여러개 선언 가능,안 써도 됨
    //반환 자료형
    Random random = new Random();

    int result = random.nextInt(10)*1000 +m;    //넥스트 인트 안에 리졀트를 담았고

    return result; //돌려줌
}


    public static void main(String[] args) {


//        Random random = new Random();

         /* for(int i = 0 ; i<10; i++) {
            int randNum = random.nextInt(100);
            System.out.println(randNum);
        }*/

        int money =5000;

       /* int a = random.nextInt(10)*1000 + money;
        System.out.println(a);
        int b = random.nextInt(10)*1000 + money;
        System.out.println(b);
        int c = random.nextInt(10)*1000 + money;
        System.out.println(c);
        int d = random.nextInt(10)*1000 + money;
        System.out.println(d);*/


      /*  System.out.println(a+b+c+d);
        //x+y =z 정의 디파인드라고 한다*/

        //함수 정의 (메소드 정의)
        System.out.println(calcRandom(money));
        System.out.println(calcRandom(money));
        System.out.println(calcRandom(money));
        System.out.println(calcRandom(money));
        System.out.println(calcRandom(money));

        int r = calcRandom(money);
        System.out.println(r+100);
        System.out.println(r+1000);
        System.out.println(r+10000);
        System.out.println(r+100000);
    }
}
