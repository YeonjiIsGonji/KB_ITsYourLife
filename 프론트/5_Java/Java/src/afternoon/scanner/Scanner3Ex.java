package afternoon.scanner;

import java.util.Scanner;

public class Scanner3Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫번째 정수를 입력하세요 : ");
        int num1 = scanner.nextInt();

        System.out.print("첫번째 정수를 입력하세요 : ");
        int num2 = scanner.nextInt();

        System.out.println("두 수의 차는 : " + (num1 - num2));

        System.out.println("두 수의 곱은 : " + (num1 * num2));
    }
}
