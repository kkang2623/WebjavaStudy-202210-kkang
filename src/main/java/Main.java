import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int H = in.nextInt(); // 시
        int M = in.nextInt(); // 분
        int C = in.nextInt(); // 요리하는 시간
        int min = H * 60 + M; // 시간 * 60 + 분






        if (M < 60) {
            H++;
            M = 60 + (M + C);
            if ((M + C) > 120) {
                H++;
                if (H < 0) {
                    H = 23;
                }
                System.out.println(H + " " + (M + C));
            } else {
                System.out.println(H + " " + (M + C));
            }
        }
    }

}

