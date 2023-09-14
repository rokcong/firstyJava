package Ch_03;

public class _03_StringCompar {
    public static void main(String[] args) {
        // 문자열 비교
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1.equals("Java"));  // 문자열 내용이 같으면 true, 다르면 false
        System.out.println(s2.equals("python"));    // 대소문자 구분
        System.out.println(s2.equalsIgnoreCase("python"));  // 대소문자 구분 없이 문자열 내용이 같은지 여부 체크

        // 문자열 비교 심화
        s1 = "1234";    // 벽에 붙은 메모지의 비밀번호 정보 (참조)
        s2 = "1234";    // 같은 곳(하나 만)참조
        System.out.println(s1.equals(s2));  // true     (내용)
        System.out.println(s1 == s2);       // true     (참조)

        s1 = new String("1234");    // 서로 참조하는 곳이 다름
        s2 = new String("1234");    // 서로 참조하는 곳이 다름
        System.out.println(s1.equals(s2));      // true
        System.out.println(s1 == s2);           // false

        // 문자열 비교에서는 등호(==) 대신 equals를 사용하는 것을 권장

    }
}
