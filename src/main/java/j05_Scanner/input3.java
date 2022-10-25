package j05_Scanner;

import java.util.Scanner;

public class input3 {
    public static void main(String[] args) {

       /*
       이름 : 남강석             name
       나이 : 29                age
       주소 : 부산시 해운대구     address
       연락처: 010 0000 0000     phone


       사용자의 이름은 김준일이고 나이는 29입니다.
       주소는 부산 해운대구이며 연락처는 010 0000 0000입니다.

        */
        Scanner scanner = new Scanner(System.in);

       /*
        String name = "남강석";

        int age = 29;
        String address = "부산시 해운대구";
        String  phone = "010 2474 6352";

        String a = "사용자의 이름은 ";
        String b = "이고 나이는 ";
        String c = "입니다. ";
        String d = "주소는 ";
        String e = "이며 연락처는 ";

        String f = scanner.next();

        System.out.println("사용자의 이름은 "+name+"이고 나이는 "+age + "입니다." +"\n" +"주소는 "+address+"이며 연락처는 "+phone+"입니다.");
        System.out.println(a+name+b+age+c+"\n"+d+address+e+phone+c);
        System.out.println(a+name+b+age+c+f+"\n"+d+address+e+phone+c);
*/

        String name = null;
        int age = 0;
        String address = null;
        String phone = null;

        System.out.println("이름: ");
        name = scanner. nextLine();

        System.out.println("나이: ");
        age = scanner. nextInt();
        scanner.nextLine();

        System.out.println("주소: ");
        address = scanner.nextLine();

        System.out.println("연락처: ");
        phone = scanner.nextLine();

        System.out.println("사용자의 이름은 "+name + "이고 나이는 "+age+"입니다.");
        System.out.println("주소는" +address + "이며 연락처는 "+phone+ "입니다.");





    }
}
