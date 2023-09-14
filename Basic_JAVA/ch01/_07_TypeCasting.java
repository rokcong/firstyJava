package Ch_01;

public class _07_TypeCasting {
    public static void main(String[] args) {
        // 형뱐환 TypeCasting
        // 정수형에서 실수형으로
        // 실수형에서 장수형으로

        // int to float, double
        int score = 93;
        System.out.println(score);  // 93
        System.out.println((float) score);  // int -> float으로 변환 = 93.0
        System.out.println((double) score); // 93.0

        // float, double to int
        float score_f = 93.3F;
        double score_d = 98.88;
        System.out.println((int) score_f);  // 93
        System.out.println((int) score_d);  // 98

        // 정수와 실수 연산
        score = 93 + (int)98.8;     // 93 + 98
        System.out.println(score);  // 191

        score_d = (double) 93+ 98.8;    // 결과가 실수로 되는 값은 int형이 자동으로 실수형으로 변환
        System.out.println(score_d);    // 191.8

        // 변수에 형변환된 데이터 집어넣기
        double convertedScoreDouble = score;        // 191 -> 191.0
        // int -> long -> float -> double (자동 형변환)

        int convertedScoreInt = (int)score_d;    // 191.8 -> 191
        // double -> float -> long -> int (수동 형변환)

        // 숫자를 문자열로 ->String.valueOf
        String s1 = String.valueOf(93);
        s1 = Integer.toString(93);      // toString = 문자열로 변환해주는 기능
        System.out.println(s1);

        String s2 = String.valueOf(98.8);
        s2 = Double.toString(98.8);
        System.out.println(s2);

        // 문자열을 숫자로
        int i = Integer.parseInt("93") ;    // parseInt
        System.out.println(i);
        double d = Double.parseDouble("98.8");
        System.out.println(d);

        // int error = Integer.parseInt("자바"); // "" 안에 있는 데이터 값이 올바른지 확인
    }
}
