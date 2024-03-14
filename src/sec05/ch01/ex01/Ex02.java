package sec05.ch01.ex01;

public class Ex02 {
    public static void main(String[] args) {
        YalcoChicken yc1 = new YalcoChicken(3, "판교");
        YalcoChicken yc2 = new YalcoChicken(17, "강남");

        yc1.place();
        yc2.place();
    }

    public static class YalcoChicken {
        int no;
        String name;

        YalcoChicken(int no, String name) {
            this.no = no;
            this.name = name;
        }

        void place() {
            System.out.printf("안녕하세요, %d호 %s점입니다.%n", no, name);
        }
    }
}
