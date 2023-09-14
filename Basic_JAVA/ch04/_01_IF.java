package Ch_04;

public class _01_IF {
    public static void main(String[] args) {
        // 조건문 IF
        int hour = 15;  // 오전 10시
        /*
        * if ( 조건 )
        *     ... 수행할 명령 ...
        *
        * */

        // 한 문장일때는 {}(중괄호) 생략 가능
        if (hour < 14)
            System.out.println("아이스 아메리카노 +1");

        // 여러 문장일때는 {}(중괄호) 생략 불가능

        if (hour < 14) {
            System.out.println("아이스 아메리카노 +1");
            System.out.println("샷 추가");
        }
        System.out.println("커피 주문 완료 #1");

        // 오후 2시 이전, 모닝 커피를 마시지 않을 경우?
        hour = 10;
        boolean morning_Coffee = false; // 모닝 커피
        // if (hour < 14 && morning_Coffee == false){
        if (hour < 14 && !morning_Coffee){
            System.out.println("아이스 아메리카노 +1");
        }
        System.out.println("커피 주문 완료 #2");

        // 오후 2시 이후이거나 모닝 커피를 마신 경우?
        hour = 15;
        morning_Coffee = true;

        // if (hour < 14 || morning_Coffee == true ){
        if (hour < 14 || morning_Coffee){
            System.out.println("아이스 아메리카노 (디카페인) +1");
        }
        System.out.println("커피 주문 완료 #3");
    }
}
