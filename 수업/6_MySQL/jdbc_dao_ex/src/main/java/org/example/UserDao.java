package org.example;

import java.sql.*;
import java.util.ArrayList;

public class UserDao {
    static Connection conn = null;
    // static 블럭 -> 실행되는 순간 가장 먼저 실행됨
    static {
        try {
            String driver = "com.mysql.cj.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/user_ex";
            String id = "root";
            String password = "";

            Class.forName(driver);
            conn = DriverManager.getConnection(url,id,password);

            if(conn != null) {
                System.out.println("DB 접속에 성공!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //다른 누군가에게 conn 값 전달해줄 때 사용. 하지만 CRUD 까지 넘어가는게 아님. 그냥 데이터베이스에 연결할 수 있게만 루트를 공유하는 것.
    public static Connection getConnection() {
        return conn;
    }

    // 내 데이터를 누가 보면 위험할 수 있어서 null 값으로 바꿔줘서 연결 해제
    public static void close() {
        try {
            if (conn != null) {
                conn.close();
                conn = null;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void create(String email, String password) {
        String sql = "INSERT INTO users (email, password) VALUES (?, ?)";

        try(PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, email);
            pstmt.setString(2, password);

            int affectedRows = pstmt.executeUpdate();

            if (affectedRows > 0) {
                System.out.println("회원 추가 성공!");
            } else {
                System.out.println("회원 추가 실패");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void getAllUsers() {
        String sql = "SELECT * FROM users";
        // ArrayList 는 try 구문에 표현하지 않는다.
        ArrayList<UserVo> userList = new ArrayList<>();

        // 쿼리문 변경이 필요 없기 때문에 Statement 사용
        try(Statement pstmt = conn.createStatement();
            ResultSet rs = pstmt.executeQuery(sql)) {

            while (rs.next()) {
                UserVo userVo = new UserVo(
                        rs.getInt("id"),
                        rs.getString("email"),
                        rs.getString("password")
                );
                userList.add(userVo);
            }
            userList.forEach((userVo) -> System.out.println(userVo));
        }  catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // 회원 정보를 수정하는 메서드
    public void updateUser(int id, String newEmail, String newPassword) {
        String sql = "UPDATE users SET email = ?, password = ? WHERE id = ?";

        try(PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, newEmail);
            pstmt.setString(2, newPassword);
            pstmt.setInt(3, id);

            int affectedRows = pstmt.executeUpdate();

            if (affectedRows > 0) {
                System.out.println("회원 정보 수정 성공!");
            } else {
                System.out.println("회원 정보 수정 실패");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteUser(int id) {
        String sql = "DELETE FROM users WHERE id = ?";

        try(PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            int affectedRows = pstmt.executeUpdate();

            if (affectedRows > 0 ) {
                System.out.println("회원 삭제 성공!");
            } else {
                System.out.println("해당하는 회원이 없습니다.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // 테이블을 합친 뒤, 회원의 이름 정보까지 전부 출력하는 메서드
    public void getAllUsersWithName() {
        String sql = "SELECT users.id, users.email, users.password, user_info.name " +
                "From users " +
                "JOIN user_info ON users.id = user_info.id";
        try (Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                int id = rs.getInt("id");
                String email = rs.getString("email");
                String password = rs.getString("password");
                String name = rs.getString("name");

                System.out.printf("ID: %d, Email: %s, Password: %s, Name: %s%n", id, email, password, name);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
