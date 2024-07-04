package afternoon.lang.object;

public class ObjectMain {
    public static void main(String[] args) {
        Child child = new Child();

        child.childMethod();
        child.parentMethod();

        System.out.println(child.toString());
        System.out.println(child);

        //주소값 참조
        String ref1 = Integer.toHexString(child.hashCode()); //16진수로 변환
        String ref2 = Integer.toHexString(System.identityHashCode(child));

        System.out.println("ref1 = " + ref1);
        System.out.println("ref2 = " + ref2);

        Parent[] objects = {new Parent(), new Child()};
        Object[] object2 = {new Parent(), new Child(), new OtherClass()};


    }
}
