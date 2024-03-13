package sec03.ch05;

public class Ex02 {
    public static void main(String[] args) {
        String str_a1 = "안녕";

        boolean bool_a1 = str_a1.equals("안녕");

        //  💡 리터럴로 선언했어도 객체 인스턴스로 만들어짐
        //  때문에 객체의 기능인 메소드 사용 가능
        boolean bool_a2 = "안녕".equals("안녕");
        boolean bool_a3 = "안녕".equals(str_a1);

    }
}
