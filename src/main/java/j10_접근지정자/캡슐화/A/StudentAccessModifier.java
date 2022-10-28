package j10_접근지정자.캡슐화.A;

public class StudentAccessModifier {

   private int code;
   private String name;

   public StudentAccessModifier(int code, String name) {//외부로부터 전달받아
       this.code = code;
       this.name = name;
   }

    public int getCode() {// 밖에 있는 코드를 받아들여 값을 설정
        return code;
    }

    public void setCode(int code) {// 주소생성만 되어있으면 호출가능 //set 뒤에 변수명이 붙고 카멜 표기법으로 표시
        //코드를 설정하여 밖에있는 코드로 보낸다 ?????
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void showInfo(){
        System.out.println("학번 : "+this.code);
        System.out.println("이름 : "+name);
    }
}
