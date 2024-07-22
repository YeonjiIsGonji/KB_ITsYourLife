package org.example2;

import java.sql.*;
import java.util.ArrayList;

public class UserDao {
    static Connection conn = null;

    static {
        try {
            String driver = "com.mysql.cj.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/user_ex1";
            String id = "root";
            String password = "";

            Class.forName(driver);
            conn = DriverManager.getConnection(url, id, password);

            if (conn != null) {
                System.out.println("DB 접속에 성공!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() {
        return conn;
    }

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
        String sql = "INSERT INTO users1 (email, password) VALUES (?, ?)";

        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
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
        String sql = "SELECT * FROM users1";
        ArrayList<UserVo> userList = new ArrayList<>();

        try (Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql)) {

            while(rs.next()) {
                UserVo user = new UserVo(
                        rs.getInt("id"),
                        rs.getString("email"),
                        rs.getString("password")
                );
                userList.add(user);
            }
            userList.forEach((user) -> System.out.println(user));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateUser(int id, String newEmail, String newPassword) {
        String sql = "UPDATE users1 SET email = ?, password = ? WHERE id = ?";

        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, newEmail);
            pstmt.setString(2, newPassword);
            pstmt.setInt(3, id);

            int affectedRows = pstmt.executeUpdate();

            if (affectedRows > 0) {
                System.out.println("회원 정보 수정 성공");
            } else {
                System.out.println("회원 정보 수정 실패");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteUser(int id) {
        String sql = "DELETE FROM users1 WHERE id = ?";

        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            int affectedRows = pstmt.executeUpdate();
            if (affectedRows > 0) {
                System.out.println("회원 삭제 성공");
            } else {
                System.out.println("회원 삭제 실패");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void getAllUsersWithName() {
        String sql = "SELECT users1.id, users1.email, users1.password, user_info.name " +
                "FROM users1 JOIN user_info ON users1.id = user_info.id";
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
