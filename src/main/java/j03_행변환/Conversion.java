package j03_행변환;

public class Conversion {
    public static void main(String[] args) {
    //upcasting( 업캐스팅) 묵시적 형변
        char cast1 = 'a';
        System.out.println(cast1);
        System.out.println((int)cast1); //인트 자료형으로 바꿔준다.
        //int cast2 = (int)cast1;
        int cast2 = cast1;
        System.out.println(cast2);

        //downcasting(다운캐스팅)
        int cast3 = 98;
        //char cast4 = cast3; // 정수가 들어올 수 없다.
        char cast4 = (char)cast3;
        System.out.println(cast4);

        double cast5 = 3.14;
        int cast6 = (int)cast5;
        System.out.println(cast5);
        System.out.println(cast6);

        //더블이 더 크기 때문에 더블안에 인트가 들어갔을 때는 소수점 표시
        double cast7 = cast6;
        System.out.println(cast7);

        int b = 5%3;
        int c = 4%3;
        int d = 6%3;
        int e = 5%7;
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);












    }
}
