package sec05.ch06.ex02;

public class YalcoChicken {
    protected int no;
    protected String name;

    public YalcoChicken(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public void takeHallOrder() {
        System.out.printf("%d호 %s점 주문 받음%n", no, name);
    }
}
