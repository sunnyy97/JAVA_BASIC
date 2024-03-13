package sec03.ch08;

public class Ex02 {
    public static void main(String[] args) {
        char[] dirAry1 = {'동', '서', '남', '북'};
        char[] dirAry2 = new char[] {'동', '서', '남', '북'};

        char[] dirAry3;
        dirAry3 = new char[] {'동', '서', '남', '북'};

        int [] intAry = {1, 2, 3, 4, 5};

        //  ⚠️ 런다임 에러: ArrayIndexOutOfBoundsException
        int outOfAry = intAry[intAry.length]; // intAry.length은 5인데 intAry[] 값은 4개까지만 가능하니까
    }
}
