package afternoon.classs;

public class CustomerMain {
    public static void main(String[] args) {
        Customer customer1 = new Customer("김연지", 31, 3000, false);
        customer1.printCustomerInfo();

        Customer customer2 = new Customer();
        customer2.printCustomerInfo();
//        customer1.name = "김연지";
//        customer1.age = 31;
//        customer1.total = 3000;
//        customer1.isBlacklist = false;

//        System.out.println("고객명 : " + customer1.name);
//        System.out.println("고객 나이 : " + customer1.age);
//        System.out.println("총 사용한 금액 : " + customer1.total);
//        System.out.println("blacklist 여부 : " + customer1.isBlacklist);
    }

}
