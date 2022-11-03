package j10_접근지정자;

public class StudentAccessModifier {

    private int code;
    private String name;

    public StudentAccessModifier(int code, String name) { //생성자를 만든다
        this.code = code;
        this.name = name;
        //일정 코드에 코드를 넣고 일정 네임에 네임을 넣는다
        //외부로부터 위에 있는 int code가 값을 받아 프리베이트 int code에게 전달한다.
        //public이 없으면 default로 인식한다.다른 패키지에 있으면 생성할 수 없으므로 public 를 붙여준다

    }

/*
    public void setCode(int code) {//set+변수명(카멜표기법)
        this.code = code;
    }
    public int getCode() { //안에 있는 녀석을 바깥으로 가지고 나간다
        return code;
        //private code를 리턴해서 바깥으로 뱉어줌
    }*/


    //위에 것을 자동으로 입력하려면 alt + insert

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //----------------------------------------------

    public void showInfo() {
        System.out.println("학번 : " + this.code);
        System.out.println("이름 : " + name);
    }

}
