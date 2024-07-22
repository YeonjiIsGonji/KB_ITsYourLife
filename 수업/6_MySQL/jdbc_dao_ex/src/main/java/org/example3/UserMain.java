package org.example3;

public class UserMain {
    public static void main(String[] args) {
        UserDao userDao = new UserDao();
        // 회원 추가
        //userDao.create("tetz2", "1234");
        // 회원 조회
        //userDao.getAllUsers();

        // 회원 수정
        //userDao.updateUser(4, "lhs", "abcd");
        // 회원 조회
        //userDao.getAllUsers();

        // 회원 삭제
        //userDao.deleteUser(4);
        // 회원 조회
        //userDao.getAllUsers();

        //userDao.getAllUsers();
        userDao.getAllUsersWithName();
    }
}
