package j16_Bean;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@AllArgsConstructor
//@NoArgsConstructor
public class PersonRequired {
    private final String name;//멤버변수에 final을 선언하면 필수값이 된다.
    // @RequiredArgsConstructor = final // @AllArgsConstructor 는 위 아래 둘 다 생성자를 가짐
    private int age;
}
