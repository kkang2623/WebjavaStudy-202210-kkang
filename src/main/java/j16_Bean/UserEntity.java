package j16_Bean;


import lombok.*;

import java.util.Objects;

/*
정보를 담는 객체를 Entity Class라 한다.
번호,주소 등등 정보 담기
[기본세팅]
멤버변수 선언
생성자 정의
Getters and Setters 정의
Equals and Hashcode 정의
toString 정의
----------------------------------
 */

@NoArgsConstructor
@AllArgsConstructor // 매개변수가 다 있다
//@Getter
//@Setter
//@EqualsAndHashCode
//@ToString
@Data // 위에 네개(Getter,Setter,EqualsAndHashCode,ToString) 가 포함된 것

public class UserEntity {
    private String username;
    private String password;
    private String email;
    private String name;




}
