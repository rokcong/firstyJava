package Ch_03;
/*
* 주민등록번호에서 생년월일 및 성별까지만 출력하는 프로그램을 작성
*
* 참고)
* 주민등록번호는 13자리의 숫자로 구성
* 앞 6자리는 생년월일 정보, 뒷 자리 7자리 중 첫번째 숫자는 성별 정보
* 입력 데이터는 -을 포함한 14자리의 문자열 형태
*
* 예시)
* "901231-1234567"인 경우 901231-1 까지 출력
* "030708-4567890"인 경우 030708-4 까지 출력
*
* */
public class _Quiz_03 {
    public static void main(String[] args) {
        String J_num ;
        J_num = "901231-1234567";

        System.out.println("해당 번호의 생년 월은 " + J_num.substring(0,8));

        J_num = "030708-4567890";
        System.out.println("해당 번호의 생년 월은 " + J_num.substring(0, J_num.indexOf("-") + 2));
    }

}
