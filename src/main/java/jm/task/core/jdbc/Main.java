package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserService us = new UserServiceImpl();

        us.createUsersTable();

        us.saveUser("Ivan", "Ivanov", (byte) 10);
        us.saveUser("Titan", "Titanov", (byte) 40);
        us.saveUser("Opal", "Opalov", (byte) 20);
        us.saveUser("Chumak", "Chumakov", (byte) 35);
        System.out.println("Пользователи успешно созданы");

        System.out.println(us.getAllUsers());
        System.out.println("Список всех пользователей");

        us.cleanUsersTable();

        us.dropUsersTable();
    }
}
