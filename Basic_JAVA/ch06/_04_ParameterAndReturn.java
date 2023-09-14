package Ch_06;

public class _04_ParameterAndReturn {
    public static int getPower(int number) {
        int result = number * number;
        return result;
        // return number * number ;
    }

    public static int getPowerByExp(int number, int exponent) {
        int result = 1;
        for (int up = 0; up < exponent; up++) {
            result *= number;
        }
        return result;
    }



    public static void main(String[] args) {
        int retVal = getPower(2);
        System.out.println(retVal); // 2 * 2 = 4

        retVal = getPower(3);
        System.out.println(retVal);

        retVal = getPowerByExp(3,3);
        System.out.println(retVal); // 3 * 3 * 3 = 27

        System.out.println(getPowerByExp(2,4)); // 2 * 2 * 2 * 2 = 16
    }
}
