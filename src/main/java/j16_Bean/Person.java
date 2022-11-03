package j16_Bean;

public class Person { //상수.
    private final String name; // 멤벼변수에 final을 선언하면 필수값이 된다.
    private int age;

//    public Person(){} // 생성 불가. // NoArgsConstructor// 는 RequiredArgsConstructor와 함께 쓸 수 없다

    public Person(String name) { // <- RequiredArgsConstructor
        this.name = name;
    }

    //상수로 선언을 하면 초기화가 일어나야 한다 컨스트럭터 // 값이 꼭 주입이 되어야 한다.
    public Person(String name, int age) { // AllArgsConstructor //리콰이어드 필수 아규먼트 생성자
        this.name = name;
        this.age = age;
    }



    //
}