package j18_제네릭.와일드카드;

public class Main {

    public AnimalData<?> getAnimal(int flag){ // ? =  어떤 형태가 올 지 모른다
//                 <? extends Animal>
        // 어떠한 제네릭타입을 상속받을 수 있지만 Animal 클래스만 가능하다.

        if(flag == 1){
            AnimalData<Human> animalData =  new AnimalData<Human>(new Human());
            return animalData;
        }else if(flag == 2){
            AnimalData<Tiger> animalData = new AnimalData<Tiger>(new Tiger());
            return animalData;
        }
        else if(flag == 3){
            AnimalData<Car> animalData = new AnimalData<Car>(new Car("k8"));
            return animalData;}
            else{
            return null;
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.getAnimal(2).printData();
        main.getAnimal(1).printData();
        System.out.println(main.getAnimal(3));
    }


}
