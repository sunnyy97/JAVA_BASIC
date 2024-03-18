package sec05.ch04;

import sec05.ch04.ex01.SmartPhone;

public class Main {
    public static void main(String[] args) {
        //  ⭐️ 다른 패키지에서 사용하면 상단에 임포트되어야 함 (IDE 안내)
        SmartPhone smartPhone = new SmartPhone();

       // String pb = smartPhone.powerButton; // ⚠️ 불가 --> public이 없어서 다른 패키지에서는 사용할 수 없다!
        String ss = smartPhone.sdCardSlot;
    }
}
