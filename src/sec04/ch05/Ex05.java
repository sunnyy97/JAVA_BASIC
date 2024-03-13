package sec04.ch05;

public class Ex05 {
    public static void main(String[] args) {
        double avg = getAverage(3, 91, 14, 27, 4);
        //  💡 배열을 넣으면 자동으로 펼쳐져 인식됨
        int[] numberss = {3, 91, 14, 27, 4};
        double avgOfArr = getAverage(numberss);

        String class3Desc = descClass(3, "채성아", "짱구", "철수", "맹구", "유리", "훈발놈");
    }

    //  💡 ... 연산자 : 해당 위치 뒤로 오는 연산자들을 배열로 묶음
    //  int[] (배열 자체를 받음)과는 다름!
    static double getAverage(int... nums) { // int[] nums라고 하면 사용할 수 없다!
        double result = 0.0;
        for(int num : nums) {
            result += num;
        }
        return result / nums.length;
    }
    //  ⭐️ 다른(정해진) 인자들과 사용시 맨 마지막에 놓을 것
    static String descClass(int classNo, String teacher, String ...kids) {
        return "%d반의 담임은 %s선생님, 원생들은 %s명입니다."
                .formatted(classNo, teacher, String.join(",", kids));
    }

}
