package Ch_05;
/*
* 배열을 활용하여 쇼핑물에서 구매 가능한 신발 사이즈 옵션을 출력하는 프로그램을 작성
*
* 조건)
* 신발 사이즈는 250부터 295 까지 5 단위로 증가
* 신발 사이즈 수는 총 10가지
*
* */
public class _Quiz_05 {
    public static void main(String[] args) {
        int [] shose_size = new int[10];
        for (int i = 0; i < shose_size.length; i++) {
            shose_size[i] = 250 + (5 * i);
        }

        for (int size : shose_size) {
            System.out.println("사이즈" + size + "(재고 있음)");
        }
    }
}
