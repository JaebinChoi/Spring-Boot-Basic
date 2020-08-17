package com.practice.restful.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserDaoService {
    public static List<User> users = new ArrayList<>();
    private static int usersCount = 3;
    static {
        users.add(new User(1, "Jaebin", new Date()));
        users.add(new User(2, "Gildong", new Date()));
        users.add(new User(3, "Lime", new Date()));
    }

    public List<User> findAll() {
        return users;
    }

    public User findOne(int id) {
        for(User user : users) {
            if(user.getId() == id) return user;
        }
        return null;
    }

    public User save(User user) {
        if(user.getId() == null)  user.setId(++usersCount);
        users.add(user);
        return user;
    }
}
