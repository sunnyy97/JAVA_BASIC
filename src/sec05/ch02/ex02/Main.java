package sec05.ch02.ex02;

public class Main {
    public static void main(String[] args) {
        int[] ary1 = {3, 5, 9, 2, 8, 1, 4};
        int[] ary2 = {382, 194, 27, 915, 138};

        IntArrayInfo arrayInfo1 = new IntArrayInfo(ary1);
        IntArrayInfo arrayInfo2 = new IntArrayInfo(ary2);

        int ary1Max = arrayInfo1.max;
        double ary2Avg = arrayInfo2.average;
        int ary1n2Sum = arrayInfo1.sum + arrayInfo2.sum;
    }
}
