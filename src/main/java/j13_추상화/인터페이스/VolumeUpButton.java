package j13_추상화.인터페이스;

public class VolumeUpButton extends Button {

    @Override
    public void onPressed() {
        System.out.println("을량을 올립니다.");
    }
    @Override
    public void onDown() {
        System.out.println("을량을 계속 올립니다.");
    }




}
