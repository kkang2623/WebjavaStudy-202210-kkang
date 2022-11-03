package j15_Object클래스;

public class StringEquals {

    public static void main(String[] args) {

        int i1 = 10; //리터럴 상수
        int i2 = 10;

        String name1 = "남강석";
        String name2 = "남강석"; //문자열로 넣었지만 같은 배열의 주소를 써서 true 가 나옴.
        String name3 = new String("남강석"); //new = 메로리를 새로 할당받음 새로생성한 공간에 주소가 name3
        String name4 = new String("남강석");

        System.out.println(name1 + ","+ name2+ "," + name3);

        System.out.println(name1 == name2);
        System.out.println(name1 == name3);
        System.out.println(name4 == name3);// 주소가 달라서 false
        System.out.println(name1.equals(name3)); //equals 는 주소비교가 아닌 문자열의 값을 비교해줌

        System.out.println("----------------------");
        System.out.println(i1 == i2);

    }


}
