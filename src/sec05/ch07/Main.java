package sec05.ch07;

public class Main {
    public static void main(String[] args) {
        String ycCreed = YalcoChicken.CREED;
       // YalcoChicken.CREED = "우리의 튀김옷은 바삭하다"; //⚠️ 불가!

        final YalcoChicken store1 = new YalcoChicken(3, "판교");

        // ⚠️ 불가!
        // store1 = new YalcoChicken(17, "강남");
        // 💡 요소 변경은 가능 ( 인스턴스값을 새롭게 넣는 건 불가능하지만 수정은 가능..?)
        store1.name = "포항";
    }
}
