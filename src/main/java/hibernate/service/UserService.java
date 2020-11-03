package hibernate.service;

import hibernate.model.User;

import java.util.List;

public interface UserService {
    void add(User user);
    void update(User user);
    void remove(int id);
    User getUser(int id);
    List<User> listUsers();
}
