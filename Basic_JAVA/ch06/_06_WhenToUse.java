package Ch_06;

public class _06_WhenToUse {

    public static int getPower(int number) {
        return  getPower(number, 2);
    }
    public static int getPower(int number, int expoent) {
        int result = 1;
        for (int up = 0; up < expoent; up++) {
            result *= number;
        }
        return result;
    }


    public static void main(String[] args) {
        // 메소드가 필요한 이유

        // 2의 2승을 구하기
        /*int result = 1;
        for (int up = 0; up < 2; up++) {
            result *= 2;
        }
        System.out.println(result); // 2 * 2 = 4*/

        System.out.println(getPower(2,2));

        // 3의 3승을 구하기
        /*result = 1;
        for (int up = 0; up < 3; up++) {
            result *= 3;
        }
        System.out.println(result); // 3 * 3 * 3 = 27*/
        System.out.println(getPower(3,3));

        // 4의 2승
        /*result = 1;
        for (int up = 0; up < 2; up++) {
            result *= 4;
        }
        System.out.println(result); // 4 * 4 = 16*/
        System.out.println(getPower(4,2));
    }
}
