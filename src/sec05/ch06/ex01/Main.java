package sec05.ch06.ex01;

public class Main {
    public static void main(String[] args) {
        Button button = new Button("버튼");
        ToggleButton toggleButton = new ToggleButton("토글", true);
        ShutDownButton shutDownButton = new ShutDownButton();

        // true
        boolean typeCheck1 = button instanceof Button;
        boolean typeCheck2 = toggleButton instanceof Button;
        boolean typeCheck3 = shutDownButton instanceof Button;

        // false
        boolean typeCheck4 = button instanceof ShutDownButton;
        boolean typeCheck5 = button instanceof ToggleButton;

        Button[] buttons = {
                new Button("Space"),
                new ToggleButton("NumLock", false),
                new ShutDownButton()
        };

        for (Button btn : buttons) {
            if(btn instanceof ShutDownButton) continue;
            btn.func();
        }

    }
}
