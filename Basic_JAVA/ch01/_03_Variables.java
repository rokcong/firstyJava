package Ch_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name = "나도 코딩";    // name 이라는 문자열 변수 생성, 초기 값 설정
        int hour = 15;              // 정수형 변수 선언 및 초기 값 설정


        System.out.println(name + "님, 배송이 시작됩니다." + hour + "시에 방문 예정입니다");
        System.out.println(name + "님, 배송이 완료 되었습니다.");

        double score = 90.5;        // 실수형 변수 선언 및 초기 값 설정
        char grade = 'A';           // 한 문자인 char는 ''으로 정의
        name = "강백호";             // name 이라는 값 업데이트
        System.out.println(name + "님의 평균 점수는 " + score + "점 입니다.");
        System.out.println("학점은 " + grade + " 입니다.");

        boolean pass = false;
        System.out.println("이번 시험에 합격했을까요? " + pass );

        double d = 3.14123456789;        // 정밀한 데이터(소수점) 넣을 수 있음
        float f = 3.14123456789F;        // 정밀한 데이터를 그냥 넣을 수 없음 , 소수점은 6자리 까지만 처리됨

        System.out.println(d);
        System.out.println(f);

//        int i =10000000000000;`       // int 형으로 처리하기에는 매우 큰 숫자 값이다(int 범위 초과)
        long l = 1000000000000L;        // long 형으로 처리
        l = 1_000_000_000_000L;
        System.out.println(l);

        /*
        * -21~21억을 초과 하지 않으면 int 형을
        * 21억을 초과 하면 long 형
        * 실수형을 정확하게 계산할려면 double형
        * 실수형을 계산할때 사용 할려면 float형 (단 float형은 소수점 6자리까지 밖에 인식 못함)
        * 하나의 문자를 표현하기 위한 char형
        * 여러 문자형을 표현하기 위한 String형
        * 참/거짓을 표현하는 boolean
        * */
    }
}

