package afternoon.nested.local.ex;

import afternoon.nested.local.ex1.Dice;

import java.util.Random;

public class Ex5Main {
    public static void complicatedProgram(afternoon.nested.local.ex.Fortune fortune) {
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
        Fortune fortuneDay = new Fortune() {
            @Override
            public void run() {
                System.out.println("*** 오늘은 행운의 날입니다. 행복 하세요!");
            }
        };
        Fortune fortuneNumber  = new Fortune() {
            @Override
            public void run() {
                int num = new Random().nextInt(99) + 1;
                System.out.println("*** 오늘의 행운의 번호는 " + num + "입니다~!");
            }
        };
        complicatedProgram(fortuneDay);
        complicatedProgram(fortuneNumber);
    }
}
