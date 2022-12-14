package j25_문자열;

import lombok.Getter;
import lombok.Setter;

import java.io.File;
@Getter
@Setter
public class String1 {

    public static void main(String[] args) {

        /*
        프로젝트명 파일명 확장자명을 추려내야한다.
        subString() -> 문자열을 잘라준다.
        indexOf() -> 내가 찾는 문자열의 위치 인덱스르 반환
         */
//        String projectName = filePath.substring(filePath.indexOf("/KangSeok" + "/"));
//        String fileName = filePath2.substring(filePath.lastIndexOf("/"));
//        String extension = filePath.substring(filePath.indexOf(".")+1);


        String filePath ="C:/Users/KangSeok/java-study/src/main/java/String.java";
        String filePath2 = "C:/Users/KangSeok/project/java-study2/src/main/java/Integer.java";

        int srcIndex = filePath.indexOf("/src");
        String projectPath = filePath.substring(0, srcIndex);

        String projectName = projectPath.substring(projectPath.lastIndexOf("/")+1);
        String fileName = filePath.substring(filePath.lastIndexOf("/")+1 , filePath.lastIndexOf("."));
        String  extension = filePath.substring(filePath.lastIndexOf(".")+1);

        System.out.println("프로젝트명 : " + projectName);
        System.out.println("파일명 : " + fileName);
        System.out.println("확장자명 : " + extension);
        System.out.println(projectPath);





    }

}
