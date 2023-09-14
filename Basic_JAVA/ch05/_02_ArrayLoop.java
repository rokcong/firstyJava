package Ch_05;

public class _02_ArrayLoop {
    public static void main(String[] args) {
        // 배열 순회
        String[] coffees = {"아메리카노", "카페모카", "라떼", "카푸치노"}; //<- 1차원 배열
        /*System.out.println(coffees[0]+" 하나");
        System.out.println(coffees[1]+" 하나");
        ....*/
        // for 반복문 순회
        // index를 이용해서 처리해야 한다 -> for (int i = 0; i < ; i++)
        for (int i = 0; i < 4; i++) {
            System.out.println(coffees[i] + " 하나");
        }
        System.out.println("주세요");

        System.out.println("----------------------------------------");

        // 배열의 길이를 이용한 순회
        for (int i = 0; i < coffees.length; i++) {
            System.out.println(coffees[i] + " 하나");
        }
        System.out.println("주세요");

        System.out.println("----------------------------------------");

        // enhanced for (for-each) 반복문
        // 배열의 모든 요소를 다 순회하면서 작업
        /*for (변수 :
             배열 변수) {
            .... 수행할 문장 ....
        }*/
        for (String coffee : coffees) {
            System.out.println(coffee + " 하나");
        }
        System.out.println("주세요");
    }
}
