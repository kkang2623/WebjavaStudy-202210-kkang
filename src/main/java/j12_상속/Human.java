package j12_상속;
//extends 확장
public class Human extends Animal { //휴먼에서 애니멀까지 확장 1+1 // 메모리만 붙어있다. //새로운클래스



    public Human(String name){
        super(name); //부모의 주소를 가르킴 // 부모가 가진 객체에 접금 //기본적으로는 생략한다 // 부모 생성자가 제일 위에 있어야 함
        System.out.println("Human 생성"); //휴먼이 생성되면 애니멀도 같이 생성이 됨
    }

    /*
    * 메소드 오버라이딩(오버라이드)
    * [재정의]
     @(어노테이션(Annotation == 주석)}
     * 단순 표식
     * 상위[Animal] 객체의 메소드를 하위[Human] 객체에서 다시 정의하는 행위
     */
    @Override //해당 메소드가 상위 객체로부터 재정의된 메소드입니다.
    public void move() {
        super.move();
        System.out.println("두 발로 걷습니다.");
    }

    public void runMove() {
        move(); //두 개의 클래스가 붙어있어서 애니멀의 메소드를 호출 가능
//        //상속을 받았더라도 프라이빗은 무조건 본인 클래스에서만 사용 가능.
//    }

    }
}
