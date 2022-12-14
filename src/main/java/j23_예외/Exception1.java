package j23_예외;

public class Exception1 {
    public static void main(String[] args) {
        int[] numbers = new int[]{1,2,3,4,5,6,7};

//        for (int i = 0; i < 8; i++) {
//            System.out.println(numbers[i])   //checked Exception 밑줄이 뜨고 무슨 오류인지 알 수 있다.
//        }

//        try{ // 예외가 일어날 수 있는 선언물으 넣어줌
//        for(int i = 0; i <8; i++){
//            System.out.println(numbers[i]);
//            //원래는 1~7은 8이 아닌 7이 마지막인데 예외를 벗어나야 함. 하지만 try문에서 잡아줌.
//        }
//        }catch(ArrayIndexOutOfBoundsException e) {
//            //NullPointerException 답이 null이 나올 때만 가능.
//            //ArrayIndexOutOfBoundsException 을 상속받은 녀석만 가능.
//            System.out.println("예외를 처리하였습니다.");
//        }

        try {//NullPointerException 답이 null이 나올 때만 가능.
            String  a = null;
            a.toLowerCase();

            for(int i = 0; i <8; i++){
                System.out.println(numbers[i]);}
        }catch(NullPointerException e){
            System.out.println("null pointer Exception.");
        }finally { //트라이로 성공을 하든 캐치로 예외로 하든 언제나 실행이 되는 선언.
            System.out.println("항상 실행되어야 하는 서비스");
        }
        System.out.println("프로그램 정상 종료");

    }
}
