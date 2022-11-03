package j14_참조자료형캐스팅.동물;

public class AnimalMain {
    public static void main(String[] args) {
        Human human = new Human();
        Tiger tiger = new Tiger();
        Animal animal1 = null;
        Animal animal2 = null;


        System.out.println("[캐스팅 전]");
        human.move();
        human.readBooks();
        tiger.move();
        tiger.hunting();

        System.out.println("[캐스팅]");

        System.out.println("<업 캐스팅>");
        animal1 = human;
        animal2 = tiger;
        animal1.move();
        animal2.move();

        System.out.println("<다운 캐스팅>");
        Human d_human = (Human) animal1;
        Tiger d_tiger = (Tiger) animal2;
        d_human.move();
        d_tiger.hunting();

        System.out.println("------------------------------");
        System.out.println();

        //잘못된 다운캐스팅 //참조자료형에서는 업캐스팅이 된 적이 있어야 다운캐스팅이 가능
//        Animal a = new Animal();
//        Human h = (Human) a;
//        h.readBooks();

    }
}
