package com.practice.restful.user;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

@Service
public class UserDaoService {
    public static List<User> users = new ArrayList<>();
    private static int usersCount = 3;
    static {
        users.add(new User(1, "Jaebin", new Date(), "pass1", "701010-1111111"));
        users.add(new User(2, "Gildong", new Date(), "pass2", "701010-2222222"));
        users.add(new User(3, "Lime", new Date(), "pass3", "701010-3333333"));
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

    public User deleteUserById(int id) {
        Iterator<User> iterator = users.iterator();

        while(iterator.hasNext()) {
            User user = iterator.next();
            if(user.getId() == id) {
                iterator.remove();
                return user;
            }
        }
        return null;
    }

    public User updateUser(User updateUser) {
        for(User user : users) {
            if(user.getId() == updateUser.getId()) {
                user.setName(updateUser.getName());
                return user;
            }
        }
        return null;
    }
}
