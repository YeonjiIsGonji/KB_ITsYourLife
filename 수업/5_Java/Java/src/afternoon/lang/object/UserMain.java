package afternoon.lang.object;

public class UserMain {
    public static void main(String[] args) {
        User user1 = new User("스폰지밥", "spongeBob");
        User user2 = new User("스폰지밥", "spongeBob");

        System.out.println(user1 == user2);
        System.out.println(user1.equals(user2));
    }
}
