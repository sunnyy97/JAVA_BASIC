package sec05.ch06.ex01;

public class ShutDownButton  extends Button {
    public ShutDownButton() {
        super("ShutDown"); // 💡 부모의 생성자 호출
    }

    @Override
    /*
    `@Override` 어노테이션
        - 어노테이션 : 이후 배울 것
        - 부모의 특정 메소드를 오버라이드함을 명시
        - 없어도 오류가 나지는 않음
        - 붙였는데 메소드명이 다를 시 오류 (실수 방지)
     */
    public void func() {
        System.out.printf("프로그램 종료");
    }
}
