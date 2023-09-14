package Ch_04;

public class _03_Elseif {
    public static void main(String[] args) {
        // 조건문 ElseIF

        // 한라봉 에이드가 있으면 +1
        // 또는 망고 주스가 있으면 +1
        // 또는 아이스 아메리카노 +1

        boolean HallabongAde = true;    //한라봉 에이드
        boolean MangoJuice = true;      // 망고 주스

        if (HallabongAde){
            System.out.println("한라봉 에이드 +1");
        } else if (MangoJuice) {
            System.out.println("망고 주스 +1");
        } else {
            System.out.println("아이스 아메리카노 +1");
        }
        System.out.println("커피 주문 완료 #1");

        // else if는 여러번 사용 가능
        HallabongAde = false;
        MangoJuice = false;
        boolean Orangejuice = true;

        if (HallabongAde){
            System.out.println("한라봉 에이드 +1");
        } else if (MangoJuice) {
            System.out.println("망고 주스 +1");
        } else if (Orangejuice) {
            System.out.println("오렌지 주스 +1");
        } else {
            System.out.println("아이스 아메리카노 +1");
        }
        System.out.println("커피 주문 완료 #2");

        // else 는 없이도 가능
        HallabongAde = false;
        MangoJuice = false;
        Orangejuice = false;

        if (HallabongAde){
            System.out.println("한라봉 에이드 +1");
        } else if (MangoJuice) {
            System.out.println("망고 주스 +1");
        } else if (Orangejuice) {
            System.out.println("오렌지 주스 +1");
        }
        System.out.println("커피 주문 완료 #3");
    }
}
