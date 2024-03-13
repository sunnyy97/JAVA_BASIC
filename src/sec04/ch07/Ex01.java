package sec04.ch07;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
          next : 스페이스를 비롯한 공백 단위로 끊어서 *(토큰으로)* 문자열을 받음
          nextLine : 줄바꿈 단위로 끊어서 문자열을 받음
         */
        String str1 = sc.next();
        String str2 = sc.next();
        String str3 = sc.nextLine();

        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
        System.out.println("str3: " + str3);
    }
}
