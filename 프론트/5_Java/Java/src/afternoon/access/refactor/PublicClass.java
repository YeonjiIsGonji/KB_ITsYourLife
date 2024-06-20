package afternoon.access.refactor;

public class PublicClass {
    public static void main(String[] args) {
        PublicClass pc = new PublicClass();
        DefaultClass1 dic1 = new DefaultClass1();
        DefaultClass2 dic2 = new DefaultClass2();
    }
}

class DefaultClass1 {}

class DefaultClass2 {}