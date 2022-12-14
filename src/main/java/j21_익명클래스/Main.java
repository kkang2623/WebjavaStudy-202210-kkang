package j21_익명클래스;

public class Main {
    public static void main(String[] args) {

        Interface1 interface1 = new Class1();
        Interface1 interface2 = new Class1();
        Interface1 interface3 = new Class1();
        Interface1 interface4 = new Class1();
        Interface1 interface5 = new Class1();

        interface1.methoodName();
        interface2.methoodName();
        interface3.methoodName();
        interface4.methoodName();
        interface5.methoodName();

        Interface1 interface6 = new Interface1() {
            @Override
            public void methoodName() {
                System.out.println("익명클래스로 정의한 메소드");
            }
        };


        interface6.methoodName();
        Interface1 interface7 = new Interface1() {
            @Override
            public void methoodName() {
                System.out.println("익명클래스로 정의한 메소드");
            }
        };
    }
}
