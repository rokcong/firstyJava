package Ch_05;

public class _01_Array {
    public static void main(String[] args) {
        // 배열 : 같은 자료형의 값 여러 개를 저장하는 연속된 공간
        String CoffeRoss = "아메리카노";
        String CoffeRachel = "카페모카";
        String CoffeChandler = "라떼";
        String CoffeMonica = "카푸치노";

        System.out.println(CoffeRoss + " 하나");       //아메리카노 하나
        System.out.println(CoffeRachel + " 하나");
        System.out.println(CoffeChandler + " 하나");
        System.out.println(CoffeMonica + " 하나");
        System.out.println("주세요");

        // 배열 선언 첫 번째 방법
        //String[] Coffees = new String[4];

        // 두 번쨰 방법
        // String coffees[] = new String[4]
        /*Coffees[0] = "아메리카노";        // 0 부터 시작
        Coffees[1] = "카페모카";
        Coffees[2] = "라떼";
        Coffees[3] = "카푸치노";*/

        // 세 번째 방법
        //String[] Coffees = new String[] {"아메리카노", "카페모카", "라떼", "카푸치노"};    // 해당 방식에는 [] 안에 숫자를 넣지 않는다

        // 네 번째 방법
        String[] Coffees = {"아메리카노", "카페모카", "라떼", "카푸치노"};

        System.out.println("-----------------------------------------------");

        // 커피 주문
        System.out.println(Coffees[0] + " 하나");     // 아메리카노 하나
        System.out.println(Coffees[1] + " 하나");
        Coffees[2] = "에스프레소";       // 값 변경
        System.out.println(Coffees[2] + " 하나");
        System.out.println(Coffees[3] + " 하나");
        System.out.println("주세요");


        // 다른 자료형
        int [] i = new int[3];
        i[0] = 1;
        i[1] = 2;
        i[2] = 3;
        double[] d = new double[]{10.0, 11.2, 13.1, 15.6};
        boolean[] b = {true, true, false};

    }
}
