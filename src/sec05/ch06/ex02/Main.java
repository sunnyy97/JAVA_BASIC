package sec05.ch06.ex02;


public class Main {
    public static void main(String[] args) {
        System.out.println("\n - - - \n");

        YalcoChicken ycStores [] = {
                new YalcoChicken(3, "판교"),
                new YalcoChicken(17, "포항"),
                new YalcoChickenDT(108, "제주")
        };
        for (YalcoChicken store : ycStores) {
            if(store instanceof YalcoChickenDT) {
                // 자식 클래스의 기능을 사용하려면 명시적 타입 변환!
                ((YalcoChickenDT) store).takeDTOrder();
            }
            else {
                store.takeHallOrder();
            }
        }
    }
}
