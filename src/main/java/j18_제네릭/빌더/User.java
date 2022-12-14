package j18_제네릭.빌더;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class User {// 멤버변수
    private String username;
    private String password;
    private String email;
    private String name;


    //User 클래스 안에 class 클래스 생성.
    //먼저 있어야 가능 //이건 소괄호 없음.
    public static class UserBuilder {
        private String username;
        private String password;
        private String email;
        private String name;


        public UserBuilder username(String username) {
            this.username = username;
            return this;
        }

        public UserBuilder password(String password) {
            this.password = password;
            return this;
        }

        public UserBuilder email(String email) {
            this.email = email;
            return this;
        }

        public UserBuilder name(String name) {
            this.name = name;
            return this;
        }

        public User build(){
            return new User(username, password, email, name);
        }
    }

    public static UserBuilder builder(){
        return new UserBuilder();

    }




}
