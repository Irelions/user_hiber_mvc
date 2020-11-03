package hibernate.dao;

import hibernate.model.User;

import java.util.List;

public interface UserDao {
    void add(User user);
    void update(User user);
    void remove(int id);
    User getUser(int id);
    List<User> listUsers();
}
