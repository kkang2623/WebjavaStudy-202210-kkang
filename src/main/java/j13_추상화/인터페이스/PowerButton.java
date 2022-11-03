package j13_추상화.인터페이스;

public class PowerButton extends Button {

    private boolean status; //true or false

    @Override
    public void onPressed() {
        if (status) {// true or false로 작동한다. 아무것도 넣지 않으면 false로 작동함.
            status = false;
            System.out.println("전원을 끕니다.");
        } else {
            status = true;
            System.out.println("전원을 켭니다.");

        }
    }
}
