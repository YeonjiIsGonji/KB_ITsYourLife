package am.ch06.sec08.exam03;

public class Car {
    //필드 선언
    int gas;
    String model;
    boolean full;

    public boolean isFull() {
        return full;
    }

    public void setFull(boolean full) {
        this.full = full;
    }

    public int getGas() {
        return gas;
    }

    public void setGas(int gas) {
        this.gas = gas;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    //    //리턴값이 없는 메소드로 매개값을 받아서 gas 필드값을 변경
//    void setGas(int gas) {
//        this.gas = gas;
//    }
//
//    boolean isLeftGas() {
//        if (gas == 0) {
//            System.out.println("gas가 없습니다.");
//            return false;
//        }
//        System.out.println("gas가 있습니다.");
//        return true;
//    }
}
