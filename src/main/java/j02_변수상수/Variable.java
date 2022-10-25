package j02_변수상수;

public class Variable {
    public static void main(String[] args) {

        //논리자료형 변수
        boolean checkFlag = false;
        System.out.println(checkFlag);
        checkFlag = true;
        System.out.println(checkFlag);

        //문자자료형 변수  // char 자료형은 한 글자만 사용 가능
        char name1 = '남';
        char name2 = '강';
        char name3 = '석';
        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);
        System.out.println(name1+ name2 + name3);
        //글자로 보고싶으면 앞에 "" 큰 따옴표 두 개
        System.out.println(""+name1+name2+name3);
        System.out.println('가' + 0);

        //문자열 자료형 변수
        String name ="남강석짱짱";
        String name4 ="굳굳";
        String name5 = name + name4;
        System.out.println(name5);
        System.out.println(name+name4);


        //정수자료형 변수 // int는 정수만 표기 가능
        int width = 100;
        int width2 = 200;
        String width3 = "300";
        String width4 = "400";

        int widthResult = width+width2;
        String widthResult2 =width3+width4;

        System.out.println(widthResult); // 숫자는 연산이 된다.
        System.out.println(widthResult2); //문자열로 이루어진 숫자는 연산이 되지 않고 이어서 써진다

        //System.out.println(); 은 문자열을 넣기 위한 선언문 // 문자열이 최상위 포식자

        //현재 시간 보는 법. //1666178931685 20221019 20:29분인데 왜 이런지 모름.
        long time = System.currentTimeMillis();
        System.out.println(time);

        //int time2=1666178931685; 인트는 21억까지라 에러 뜸
        long time2=1666178931685L;
        System.out.println(time2);

        //실수자료형 변수
        double pi = 3.14159265359;
        double pi2 = 3.1415926535999999999;
        double pi3 = 3.0000000000014159265;

        System.out.println(pi);
        System.out.println(pi2); // 3.1415926536 반올림이 된다
        System.out.println(pi3); // 어렵누................................................................

        // 상수 //fanal이 붙으면 변하지 않음
        // 값을 넣는 상수는 대문자로 쓰고 스네이크 표기법을 씀
        // 스네이크 표기법이란 asdf_adsf 처럼 _를 넣음
        final String FILE_FATH = "C:/Users/KangSeok";
        //FILE_FATH = "D:/Users/aaa";  // 구동이 되지 않음
        System.out.println(FILE_FATH);






    }
}
