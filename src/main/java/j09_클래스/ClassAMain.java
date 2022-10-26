package j09_클래스;

public class ClassAMain {
    public static void main(String[] args) {

       // new ClassA(); //새로운 클래스 A를 생성해라. // 변수는 동작x , 메소드로 동작 가능
        System.out.println(new ClassA()); //j09_클래스.ClassA@49e4cb85 //주소 생성(위치를 알려줌)
        System.out.println(new ClassA()); //j09_클래스.ClassA@2133c8f8

        ClassA a1 = new ClassA();
        ClassA a2 = new ClassA();
        //ClassA :  자료형 , a1 : 변수명

        a1.name = "남강석";
        System.out.println(a1.name);

        a2.name = "남강성";
        System.out.println(a1.name);
        System.out.println(a2.name);


        a1.callName();
        a2.callName();
        //System.out.println(a1.callName(); 생성자는 항상 주소가 반환이 되어 sout에 실행이 되지 않는다.






    }
}
