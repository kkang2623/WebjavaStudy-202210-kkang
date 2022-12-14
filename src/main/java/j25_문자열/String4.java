package j25_문자열;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class String4 {
    public static void main(String[] args) {

        String roleString = "ROLE_USER,ROLE_MANAGER,ROLE_ADMIN,TESTER";
        String[] roleArray = roleString.split(",");

        List<String> roleList = new ArrayList<String>();
        List<String> roleList2 = Arrays.asList(roleArray); //반복문을 쓰지않고 반복을 돌려줌.
        List<String> validRoleList = new ArrayList<String>();
        List<String> validRoleList2 = new ArrayList<String>();

        roleList2.forEach(role -> {
            if(role.startsWith("ROLE")){
                validRoleList.add(role);
            }
        });
        System.out.println(validRoleList);


        roleList2.forEach(role -> {
            if(role.endsWith("MANAGER") || role.endsWith("ADMIN")){
                validRoleList2.add(role);
            }
        });
        System.out.println(validRoleList2);



//        for (String role : roleArray) {
//         roleList.add(role);
//        }
//        System.out.println(roleList);
//
//        System.out.println(roleList2);
//
//        roleList.forEach(role ->{
//            System.out.println(role);
//        });
    }
}
