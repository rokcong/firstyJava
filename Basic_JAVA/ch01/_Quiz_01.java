package Ch_01;

/*
퀴즈)
* 버스 도착 정보를 출력하는 프로그램을 작성하시오.
* 각 정보는 적절한 자료형의 변수에 정의합니다
*
* 정보)
* 버스 번호는 "1234", "상암 08"과 같은 형태
* 남은 시간은 분 단위 (예: 3분, 5분)
* 남은 거리는 Km 단위 (예: 1.5Km, 0.8Km)
* */

public class _Quiz_01 {
    public static void main(String[] args) {
        String Bus_Number = "상암 08";
        int left_Time = 3;
        double left_Km = 1.5;

        System.out.println(Bus_Number + "번 버스");
        System.out.println("약 " + left_Time +  "분 후 도착");
        System.out.println("남은 거리 " + left_Km + "Km");
    }
}
