package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();

    List<User> getUsersCount(int count);

    User getUserById(long id);

    void saveUser(User user);

    void updateUser(User updatedUser);

    void removeUserById(long id);

}