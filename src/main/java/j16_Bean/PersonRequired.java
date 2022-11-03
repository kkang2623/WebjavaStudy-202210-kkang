package j16_Bean;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
@AllArgsConstructor
public class PersonRequired { //상수.
    private final String name; //@RequiredArgsConstructor 를 선언하면 final 상수를 초기화 해줌
    private int age;

}