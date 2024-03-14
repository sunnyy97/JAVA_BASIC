package sec05.ch02.ex02;

public class IntArrayInfo {
    int count, max, min, sum;
    double average;

//    public IntArrayInfo(int count, int max, int min, int sum, double average) {
//        this.count = count;
//        this.max = max;
//        this.min = min;
//        this.sum = sum;
//        this.average = average;
//    }
    IntArrayInfo(int[] nums) {
        count = nums.length;
        max = nums[0];
        min = nums[0];

        for(int num : nums) {
            max = max > num ? max : num;
            min = min < max ? min : num;
            sum += num;
        }
        // 소수부를 잃지 않도록 먼저 1.0을 곱하여 double로 만듦
        average = 1.0 * sum / nums.length;
    }


}
