package sec05.ch04.ex03;

public class Main {
    public static void main(String[] args) {
        Product ballPen = new Product("볼펜", 1000);

        ballPen.setName("모나미");
        ballPen.setName(" ");

        int ballPenPrice = ballPen.getPrice();
        ballPen.setPrice(1500);

    }
}
