package afternoon.nested.inner;

public class Outer {
    private static String outerStatic = "outerStatic";
    private String outerInstance = "outerInstance";

    class Inner {
        private static String innerStatic = "innerStatic";
        private String innerInstance = "innerInstance";
        public void print() {
            // 클래스 내부의 static에 접근
            System.out.println("innerStatic = " + innerStatic);
            System.out.println("outerStatic = " + outerStatic);

            // 클래스 내부의 non-static(인스턴스) 에 접근
            System.out.println("nestedInstance = " + innerInstance);
            System.out.println("outerInstance = " + outerInstance);
        }



    }
}
