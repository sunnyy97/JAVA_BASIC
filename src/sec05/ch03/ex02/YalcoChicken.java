package sec05.ch03.ex02;

public class YalcoChicken {
    static String brand = "얄코치킨";
    static String contact() {
        return "%s입니다. 무엇을 도와드릴까요?".formatted(brand);
    }

    static int lastNo = 0;

    int no;
    String name;

    // 인자로 받아오는 것이 아니라 정적 필드로 ( static int lastNo = 0;)
    // 필요할 때 그때그때 가져옴(1씩 증가하면서)
    public YalcoChicken( String name) {
        no = ++lastNo;
        this.name = name;
    }

    String intro() {
        return "안녕하세요, %s점 %d호 %s호점입니다.".formatted(brand, no, name);
    }

}
