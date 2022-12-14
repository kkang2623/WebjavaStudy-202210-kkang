package j25_문자열;

import java.util.UUID;

public class UUIDString {
    public static void main(String[] args) {

        String uuid = UUID.randomUUID().toString();
        System.out.println(uuid);
        System.out.println(uuid.replaceAll("-",""));

        String repalceUUID = uuid.replaceAll("-" ,"");


        int uuidLength = repalceUUID.length();
        int uuidHalfIndex = uuidLength/2;
        String leftUuid = repalceUUID.substring(0 , uuidHalfIndex);
        String rightUuid = repalceUUID.substring(uuidHalfIndex);

        System.out.println(leftUuid);
        System.out.println(rightUuid);





    }

}
