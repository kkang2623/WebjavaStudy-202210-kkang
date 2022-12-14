package j24_forEach;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;

public class CollectionForEach {
    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("남강석");
        list.add("김경민");
        list.add("김완준");
        list.add("이동빈");
        list.add("이종준");


        list.forEach(name -> {
            System.out.println(name);
        });

        Set<Integer> numbers = new HashSet<Integer>();
        for (int i = 0; i < 100; i++) {
            numbers.add(i + 1);
        }

        AtomicInteger result = new AtomicInteger();

        numbers.forEach(num -> {
            result.addAndGet(num);
        });
        System.out.println(result.get());

        Map<String ,Integer> students = new TreeMap<String ,Integer>();
        for(int i = 0; i < 10; i++) {
        students.put( "남강석"+(i+1),20220001+i );
        }
        students.forEach((key,value)->{
            System.out.println("학번 : " + key + ", 이름: " + value);
        });

//        Consumer<String> c = new Consumer<String>() {
//            @Override
//            public void accept(String name){
//                System.out.println(name);
//            }
//        };
//        int a = 0;
//
//        Consumer<String> consumer = (name -> {System.out.println(name);});
//        //매개변수가 하나일 때만 () 생략 가능.
//        for (String name : Objects.requireNonNull(list)) {
//            consumer.accept(name);



        /**
         Consumer<String> consumer = name -> {
         System.out.println(name);
         };
         for (String name : list) {
         consumer.accept("남강석");
         */
//}
    }
}
