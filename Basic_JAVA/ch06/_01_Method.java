package Ch_06;

public class _01_Method {
    // 메소드 정의
    public static void sayHello() {
        System.out.println("안녕하세요 메소드 입니다.");
    }


    public static void main(String[] args) {
        // 메소드 - 어떤 기능들을 하는 코드들의 묶음
        // 메소드 호출
        System.out.println("메소드 호출 전");
        sayHello(); // == System.out.println("안녕하세요 메소드 입니다.");
        sayHello();
        sayHello();
        sayHello();
        System.out.println("메소드 호출 후");

    }
}
