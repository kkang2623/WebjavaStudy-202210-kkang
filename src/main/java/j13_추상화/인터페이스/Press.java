package j13_추상화.인터페이스;

/*
Interface(인터페이스)
1. 기본적으로 모든 메소드가 추상메소드로 정의된다.
2. 일반 메소드를 정의하기 위해서는 default 키워드를 사용하여야 한다.
3. 생성자 정의는 불가능
4. 일반 변수 선언 불가능
5. 상수는 선언할 수 있다.(접근지정자 public 사용)
 */
//    public abstract void push();  //추상이라면 abstract를 붙여야 하지만 인터페이스는 안 넣어도 된다.
    public interface Press {

    public void onPressed();  //1번 예시
    // 2번 예시   // public default void pop(){ [일반 메소드] }
    // 3번 예시   // public Switch(){ [생성자] }
    // 4번 예시   // private String name;  [변수 선언]
    // 5번예시    // public final String NAME = "switch"; // [상수 선언, 초기화]

    }






