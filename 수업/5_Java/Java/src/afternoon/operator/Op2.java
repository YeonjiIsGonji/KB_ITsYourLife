package afternoon.operator;

public class Op2 {
    public static void main(String[] args) {
        // 문자열 비교
        String str1 = "abc";
        String str2 = "def";

        boolean result1 = !str1.equals(str2);
        boolean result2 = !"abc".equals(str2);
        boolean result3 = !str1.equals("def");

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

        //문자 비교의 특이점
        System.out.println("abc" == "abc"); //"abc"라는 String 클래스가 생기면서 새로운 인스턴스 생성. 같은 "abc"이므로 같은 인스턴스 주소
        System.out.println("abc" == "def"); //"def"라는 String 클래스가 새로 생기기때문에 다른 주소를 가리킴 -> false
        System.out.println("abc" == new String("abc"));

        int score = 90;
        boolean result = score >= 80 && score <= 100;
        System.out.println(result);
    }
}
