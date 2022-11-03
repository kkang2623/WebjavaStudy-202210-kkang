package j12_상속;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("");
        Human human = new Human("남강석"); //휴먼은 애니멀과 붙어있어서 휴먼+애니멀
        Tiger tiger = new Tiger("ㅇㅇ");

        animal.move();
        human.move();
        tiger.move();

        System.out.println("사람의 이름: "  +human.getName());
        System.out.println("호랑이의 이름: "  +tiger.getName());


    }

















}
