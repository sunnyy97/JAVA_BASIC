package sec05.ch04.ex01;

public class Main {
    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone();

        String pb = phone.powerButton;
        String ss = phone.sdCardSlot;
       //  String cu = phone.cpu; // ⚠️ 불가 --> private 접근제어자가 붙어있으니까 에러 발생
    }
}
