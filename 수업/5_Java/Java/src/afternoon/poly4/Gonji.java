package afternoon.poly4;

public class Gonji implements Animal, Human {
    @Override
    public void eat() {
        System.out.println("곤지는 아아를 마십니다.");
    }

    @Override
    public void sleep() {
        System.out.println("곤지는 꾸벅꾸벅 좁니다.");
    }

    @Override
    public void think() {
        System.out.println("곤지는 멍을 때립니다.");
    }
}
