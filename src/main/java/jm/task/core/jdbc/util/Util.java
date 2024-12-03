package jm.task.core.jdbc.util;

import com.mysql.cj.Session;
import org.hibernate.SessionFactory;

import java.lang.module.Configuration;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static final String URL = "jdbc:mysql://localhost:3306/userdb";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "Alaev001";
    private static SessionFactory sessionFactory;

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }

//    public static SessionFactory getSessionFactory() {
//        if (sessionFactory == null) {
//            try {
//                Configuration configuration = new Configuration();
//            }
//        }
//    }
}
