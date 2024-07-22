package org.example;

public class UserMain {
    public static void main(String[] args) {
        UserDao userDao = new UserDao();
        // 회원 추가
        //userDao.create("tetz2", "1234");
        // 추가 회원 조회
        //userDao.getAllUsers();

        // 회원 수정 메서드 실행
        //userDao.updateUser(4, "lhs", "abcd");
        // 회원 수정이 성공적으로 되었는지 목록 확인
        //userDao.getAllUsers();

        // id가 4인 회원 삭제 메서드 실행
        //userDao.deleteUser(4);
        // 회원 수정이 성공적으로 되었는지 목록 확인
        //userDao.getAllUsers();

        // 이름이 출력 안되는 회원 조회 메서드
        userDao.getAllUsers();
        // 이름이 출력되는 회원 조회 메서드
        userDao.getAllUsersWithName();


    }
}
