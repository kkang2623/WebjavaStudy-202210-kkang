package j16_Bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
//@AllArgsConstructor
//@Data
public class Person {
    private final String name;
    private int age;

//    이러한 형태는 나중에 문제가 생길 수 있음 강제로 정의하게 만들기 위해서 상수로 만들어줘야함 (final)
    //컨스트럭터가 꼭 있어야 함 값을 넣어주는 @RequiredConstructor 필수생성자
    //int가 final이 아니면 꼭 생성자를 만들어줘야함.
    //final이 들어가면 @NoArgsConstructor 는 사용불가.

//    public Person(){} -<@NoArgsConstructor
// 멤버변수에 final을 선언하면  -<@NoArgsConstructor는 @RequiredConstructor와 함께 쓸 수 없다.


//    public Person(String name) {<-@RequiredConstructor //  초기화(생성자 만들기)
//        this.name = name;
//    }


//    public Person(String name, int age) {  <-@AllArgsConstructor
//        this.name = name;
//        this.age = age;
//    }


}
