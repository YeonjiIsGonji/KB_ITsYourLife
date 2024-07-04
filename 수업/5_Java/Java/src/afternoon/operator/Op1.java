package afternoon.operator;

public class Op1 {
    public static void main(String[] args) {
        // 문자 연산의 특이점 1
        String str = "a + b = ";
        int c = 10;
        System.out.println(str + 10);

        // 문자 연산의 특이점 2
        int d = 10;
        char e = 'e'; //char는 아스키코드 값. e = 101
        System.out.println(d + e); //string과 더할 땐, 숫자가 문자열로 변환되지만 char와 더할 땐, 아스키코드 값과 더해진다.
    }
}
