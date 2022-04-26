package rsa.day2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @Author xiaodi.gou
 * @Create 2022/4/17 15:52
 */
public class Demo01 {
    public static void main(String[] args) throws SQLException {

        String url = "jdbc:mysql://localhost:3306/gouxiaodi";
        String user = "root";
        String password = "123456";
        Connection con = DriverManager.getConnection(url, user, password);
        if (con != null) {
            System.out.println("mysql已连接");
        }
        con.close();
//        Connection con = DriverManager.getConnection(url);


    }
}
