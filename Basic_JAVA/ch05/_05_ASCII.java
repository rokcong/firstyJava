package Ch_05;

public class _05_ASCII {
    public static void main(String[] args) {
        // 아스키 코드 (ANSI) : 미국 표준 코드
        char c ='a';    // 알파벳 대문자 A= 65부터 / 소문자 a =  97부터 / 숫자는 0 = 48부터
        System.out.println(c);
        System.out.println((int)c);

        c = 'b';
        System.out.println(c);
        System.out.println((int)c);

        c++;
        System.out.println(c);
        System.out.println((int)c);

        // 세로 크기 10 x 가로 크기 15에 해당하는 영화관 좌석
        String[][] seats3 = new String[10][15];
        char ch = 'A';

        for (int i = 0; i < seats3.length; i++) {    // 세로 기준
            for (int j = 0; j < seats3[i].length; j++) {
                seats3[i][j] = String.valueOf(ch) + (j + 1);
            }
            ch++;
        }

        // 영화관 좌석 번호 확인
        for (int i = 0; i < seats3.length; i++) { // i < 세로 크기
            for (int j = 0; j < seats3[i].length; j++) { // j < 가로 크기
                System.out.print(seats3[i][j] + " ");      // A1 A2..
            }
            System.out.println();
        }
    }
}
