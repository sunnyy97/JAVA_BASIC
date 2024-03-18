package sec05.ch03.ex03;

public class Button {
    static String mode = "LIGTH";
    static void swithMode() {
        mode = mode.equals("LIGTH") ? "DARK" : "LIGTH";
    }
    char print;
    int space;

    public Button(char print, int space) {
        this.print = print;
        this.space = space;
    }

    void place() {
        System.out.printf("표시 : %c, 공간 : %d, 모드 :%s%n" , print, space, mode);
    }
}
