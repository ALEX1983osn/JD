package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;

import java.sql.SQLException;
import java.util.List;

public class UserServiceImpl  implements UserService {
    private final UserDao userDaoJDBC = new UserDaoJDBCImpl();

    @Override
    public void createUsersTable() throws SQLException {
        userDaoJDBC.createUsersTable();
    }

    @Override
    public void dropUsersTable() throws SQLException {
        userDaoJDBC.dropUsersTable();

    }

    @Override
    public void saveUser(String name, String lastName, byte age) throws SQLException {
        userDaoJDBC.saveUser(name, lastName, age);
        System.out.println("User с именем " + name + " добавлен в базу данных");
    }

    @Override
    public void removeUserById(long id) throws SQLException {
        userDaoJDBC.removeUserById(id);
    }

    @Override
    public List<User> getAllUsers() throws SQLException {
        userDaoJDBC.getAllUsers();
        return userDaoJDBC.getAllUsers();
    }

    @Override
    public void cleanUsersTable() throws SQLException {
        userDaoJDBC.cleanUsersTable();
    }


}