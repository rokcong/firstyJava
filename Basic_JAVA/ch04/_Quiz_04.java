package Ch_04;

/*
* 조건문을 활용하여 주차 요금 정산 프로그램을 작성하시오
*
* 조건)
* 주차 요금은 시간당 4000원 (일일 최대 요금은 30000원)
* 경차 또는 장애인 차량은 최종 요금에서 50% 할인
*
* 주차요금 예시
* 일반 차량 5시간 주차시 20000원
* 경차 5시간 주차 시 10000원
* 장애인 차량 10시간 주차 시 15000원
*
* */

public class _Quiz_04 {
    public static void main(String[] args) {
        int hour = 7;
        int fee = 4000*hour;
        boolean SmallCar = false;   // 경차 여부
        boolean DisableCar = false; // 장애인 차량 여부

        if (fee > 30000){
            fee = 30000;    // 최대 요금 적용
        }

        if (SmallCar || DisableCar){
            fee/=2;         // 50% 할인률 적용
        }
        System.out.println("주차 요금은 "+ fee + "입니다");
    }
}
