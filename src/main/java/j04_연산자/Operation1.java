package j04_연산자;

public class Operation1 {
    public static void main(String[] args) {
        int num = 10;
        num = num + 1;


        // ++가 앞에 있으면 추가 된 값이 출력되고
        // ++가 뒤에 있으면 다음에 추가된 값이 출력된다.
        System.out.println(num);
        System.out.println(++num);
        System.out.println(num++);
        System.out.println(num);

        System.out.println(--num);
        System.out.println(num--);
        System.out.println(num);







    }
}
