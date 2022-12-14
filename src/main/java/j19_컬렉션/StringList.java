package j19_컬렉션;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class StringList {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();
        printCollection(list);

        //값 추가
        list.add("문자열1");
        list.add("문자열2");
        list.add("문자열3");
        list.add("문자열4");
        printCollection(list);

        list.add(1,"문자열5");
        printCollection(list);


        ArrayList<String> addAllList = new ArrayList<String>();
        addAllList.addAll(list);
        addAllList.addAll(2,list);
        printCollection(addAllList);

        //값 조회
        String  str1 = list.get(0);
        System.out.println("str1 = " + str1);

        //반복을 사용한 값 조회
        for (int i = 1; i<list.size(); i++){
            System.out.println("일반 for문 str: " + list.get(i));
        }
        System.out.println();

        for(String str:list){
            System.out.println("forEach문 str: " + str);
        }
        System.out.println();

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println("iterator str: " + iterator.next());
        }
        System.out.println();


    }

    public static void printCollection(Collection collection){
        System.out.println(collection);
        System.out.println();
    }
}
