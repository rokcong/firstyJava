package Ch_06;

public class _03_Return {
    // 호텔 전화번호
    public static String getPhoneNumber() { // void - 이 메소드는 반환 값이 없는 메소드를 의미
        String phoneNumber = "02-1234-5678";
        return phoneNumber;
    }
    // 호텔 주소
    public static String getHotelAddress() {
        String HotelAddress = "서울시 서울구 서울로 12길 ";
        return  HotelAddress;
    }

    // 호텔 액티비티
    public static String getActivities() {
        return "볼링장, 탁구장, 노래방, PC방";
    }

    public static void main(String[] args){
        // 반환값, Return
        String contactNumber =  getPhoneNumber();
        System.out.println("호텔 전화 번호 : " + contactNumber);
        String contactAddress = getHotelAddress();
        System.out.println("호텔 주소 : " + contactAddress);

        System.out.println("호텔 액티비티 : " + getActivities());
    }
}
