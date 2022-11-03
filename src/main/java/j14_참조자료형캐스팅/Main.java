package j14_참조자료형캐스팅;

public class Main {
    public static void main(String[] args) {


        Computer computer1 = new Computer();
        Computer computer2 = new Computer();
        Computer computer3 = new Computer();
        LED led = new LED();
        Speaker speaker = new Speaker();

//        CentralControl centralControl = new CentralControl((Power) computer,(Power) led,(Power) speaker);
        //업캐스팅일 때 (Power)을 안 적어줘도 된다.
        CentralControl centralControl = new CentralControl(new Power[5]);

        centralControl.addDevice(computer1);
        centralControl.addDevice(speaker);
        centralControl.addDevice(computer1);
        centralControl.addDevice(led);
        centralControl.addDevice(led);
        centralControl.addDevice(led);


        centralControl.powerOn(); //파워 온 시키면 3개가 따따땅 나오게 만들기
        System.out.println("----------------------");
        centralControl.powerOff();


    }
}
