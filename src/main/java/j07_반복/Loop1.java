package j07_반복;

public class Loop1 {
    public static void main(String[] args) {


        int n = 0;
        /*
        반복을 해라.
        i가 0부터 100이 되기 전까지 i를 1씩 증가시키면서 반복해라.
         */

        for(int i = 0; i < 100; i++) { // i라는 변수를 선언하고; i가 참이면 {}괄호 안에것을 실행해라.// 그 다음++가 먹힘.
            n += i +1;
        }

        System.out.println("1~100까지 더한 값 :"+n);





    }
}
