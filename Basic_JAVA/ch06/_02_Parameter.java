package Ch_06;

public class _02_Parameter {
    // 전달값이 있는 메소드
    public static void power(int number){   // Parameter, 매개변수
        int result = number * number;
        System.out.println(number + "의 2 승은 " + result);
    }

    public static void powerByExp(int number, double exponent){
        double result = 1;
        for (int up = 0; up < exponent; up++) {
            result *= number;
        }
        System.out.println(number + " 의 " + exponent + " 승은 " + result );
    }

    public static void main(String[] args) {
        // 전달값, Parameter
        // 2 -> 2 * 2 = 4
        // 3 -> 3 * 3 = 9

        // Argument, 인수
        power(2);   // 2 * 2 = 4
        power(3);   // 3 * 3 = 9

        powerByExp(3,3);    // 3 * 3 * 3 = 27\
        powerByExp(2, 25);
        powerByExp(4,156);

    }
}
