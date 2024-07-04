package afternoon.nested.local.ex;

import jdk.jshell.SourceCodeAnalysis;

import java.util.Random;
import java.util.Scanner;

public class Ex6Main {
    public static void complicatedProgram(Fortune fortune) {
        System.out.println("복잡한 과정 시작");
        System.out.println("복잡한 과정 종료 후, 원하는 기능 실행");

        // 코드 덩어리 시작

        fortune.run();
        // 여기서 원하는 프로그램 실행
        // 코드 덩어리 종료

        System.out.println("복잡한 과정 다시 시작");
        System.out.println("복잡한 과정 종료 후, 프로그램 종료");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Fortune fortuneNumber  = new Fortune() {
            @Override
            public void run() {
                System.out.print("오늘의 행운 번호를 입력하세요:");
                int inputNum = scanner.nextInt();
                int randomNum1 = new Random().nextInt(99) + 1;
                int randomNum2 = new Random().nextInt(99) + 1;
                int randomNum3 = new Random().nextInt(99) + 1;
                if (inputNum == randomNum1 | inputNum == randomNum2 | inputNum == randomNum3) {
                    System.out.println("와우!! 완전한 행운의 날입니다. 맞춘 행운의 번호는 " + inputNum + "입니다.");
                } else {
                    System.out.println("입력하신 번호는 없습니다~ 행복한 하루 보내세요! :)");
                }
            }
        };
        complicatedProgram(fortuneNumber);
    }
}
