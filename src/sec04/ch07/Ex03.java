package sec04.ch07;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("불리언을 입력해주세요");

        while (sc.hasNextBoolean()) {
            System.out.println("입력값 : " + sc.nextBoolean());
        }
        // sc.close();

        System.out.println("정수를 입력해주세요.");

        while (sc.hasNextInt()) {
            System.out.println("입력값: " + sc.nextInt());
        }


        System.out.println("단어를 입력해주세요.");

        while (sc.hasNext()) {
            String nextWord = sc.next();
            if (nextWord.equalsIgnoreCase("quit")) break;
            System.out.println("입력값: " + nextWord);
        }

        System.out.println("문장을 입력해주세요.");

        while (sc.hasNextLine()) {
            String nextSentence = sc.nextLine();
            if (nextSentence.equalsIgnoreCase("quit")) break;
            System.out.println("입력값: " + nextSentence);
        }

        sc.close();
    }
}
