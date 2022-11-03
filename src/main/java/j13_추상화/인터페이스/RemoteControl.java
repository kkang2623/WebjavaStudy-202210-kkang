package j13_추상화.인터페이스;

public class RemoteControl {
//    객체 선언
    private PowerButton powerButton;
    private VolumeUpButton volumeUpButton;
    private VolumeDownButton volumeDownButton;

    public RemoteControl(PowerButton powerButton, VolumeUpButton volumeUpButton, VolumeDownButton volumeDownButton) {
        this.powerButton = powerButton;
        this.volumeUpButton = volumeUpButton;
        this.volumeDownButton = volumeDownButton;
    }

    public void onPressedPowerButton(){
        powerButton.onPressed();
    }
    public void onPressedVolumeUpButton(){
        volumeUpButton.onPressed();
    }
    public void onPressedVolumeDownButton(){
        volumeDownButton.onPressed();
}
    public void onUpVolumeUpButton(){
        volumeUpButton.onDown();
    }
    public void onDownVolumeUpButton(){
        volumeUpButton.onDown();

    }


}
