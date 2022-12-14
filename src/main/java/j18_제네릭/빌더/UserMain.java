package j18_제네릭.빌더;

public class UserMain {
    public static void main(String[] args) {
        User user =User.builder()
                .email("kkang2623@naver.com")
                .username("KangSeok")
                .name("남강석")
                .password("00000000")
                .build();
        System.out.println(user);


        User2 user2 = User2.builder()
                .name("KangSeok")
                .build();

        System.out.println(user2);

        User u = user2.to();
        System.out.println(u);

    }
}
