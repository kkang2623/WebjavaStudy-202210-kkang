package j07_반복;

public class BreakAndContinue {
    public static void main(String[] args) {
        int i = 0;

        while(true) {
            if(i >10){
                break;
            }
            System.out.println(i);
            i++;
        }
        for(int j = 0; j<10; j++) {
            if(j == 7){
                System.out.println("7을 만났습니다.");
                break;
            }
            System.out.println(j);
        }
        System.out.println("<<<<<<<<<<<<<<<<<< Continue>>>>>>>>>>>>>>>>>>");

        for (int j=0;j<100; j++) {   // 100이하로 5로 나누었을 때 0이 아닌 숫자이거나 0은 빼기
            if(j % 5 !=0 || j == 0){
                continue;
            }
            System.out.println(j);
        }
    }
}
