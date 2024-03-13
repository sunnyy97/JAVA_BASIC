package sec03.ch08;

public class Ex01 {
    public static void main(String[] args) {

        char[] yutnori = {'도', '개', '걸', '윳', '모'};
        int length = yutnori.length;

        char first = yutnori[0];
        char last = yutnori[yutnori.length - 1];

        //  💡 초기화하지 않고 일단 선언하기
        //  ⭐ 어떤 값으로 초기화되는지 확인
        boolean[] boolAry = new boolean[3];
        int[] intAry = new int[3];
        double[] dblAry = new double[3];
        char[] chAry = new char[3];
        String[] strAry = new String[3];
        //  아스키 코드의 0번 글자. 문자열의 끝을 표시하는데 사용
        char NUL = chAry[0];


    }
}
