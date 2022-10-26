package j09_클래스;

public class Constructor {
    int num;  // (멤버)전역변수
    String name;

    Constructor(){ // 아무것도 안 함 // 노 옵션 깡통
        System.out.println("NoArgsConstructor(기본생성자)");

    }
    Constructor(int num) { // 출하 될 때부터 옵션을 부여 // 값을 미리 부여함
        System.out.println("RequiredArgsConstructor(int 매개변수를 필수로하는 생성자)"); //Required : 필수
        //num = num; // 지역변수 // num이 전역변수를 쓰는건지 지역변수를 쓰는건지 알 수 없다. // num에다 매개변수로 받은 num을 주입 //전역변수보다 지역변수의 우선순위가 높다
        this.num=num; //this는 이 지역의 변수를 호출할 때 쓴다.

    }
    Constructor(String name) {
        System.out.println("RequiredArgsConstructor(String 매개변수를 필수로하는 생성자)"); //Required : 필수
        this.name = name;
    }
    Constructor(int num, String name) {
        System.out.println(("AllArgsConstructor"));
        this.num = num;
        this.name = name;
    }

    void showInfo(){
        System.out.println("num: " + num);
        System.out.println("name: " + name);
    }
}
