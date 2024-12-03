package jm.task.core.jdbc.util;

import jm.task.core.jdbc.model.User;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

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

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
                Configuration configuration = new Configuration();
                configuration.setProperty("hibernate.connection.driver_class", "com.mysql.cj.jdbc.Driver");
                configuration.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/userdb");
                configuration.setProperty("hibernate.connection.username", "root");
                configuration.setProperty("hibernate.connection.password", "Alaev001");
                configuration.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL57Dialect");
                configuration.setProperty("hibernate.show_sql", "true");
                configuration.setProperty("hibernate.hbm2ddl.auto", "none");
                configuration.addAnnotatedClass(User.class);

                sessionFactory = configuration.buildSessionFactory();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return sessionFactory;
    }
}
