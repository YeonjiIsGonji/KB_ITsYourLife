package afternoon.lang.immutable;

public class ImmutableMain {
    public static void main(String[] args) {
        ImmutableUser user1 = new ImmutableUser("짱아");
        ImmutableUser user2 = user1;

        System.out.println("user1 = " + user1);
        System.out.println("user2 = " + user2);

        user2 = user2.setName("짱구");
        System.out.println("user2의 이름을 '짱구'로 변경");
        System.out.println("user1 = " + user1);
        System.out.println("user2 = " + user2);
    }

}
