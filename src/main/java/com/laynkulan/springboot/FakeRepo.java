package com.laynkulan.springboot;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class FakeRepo implements FakeRepoInterface {
    ArrayList<User> users = new ArrayList<>();

    //adding user
    @Override
    public void insertUser(long id, String name, String surname) {
        users.add(new User(id, name, surname));

    }
    //finding user by ID


    @Override
    public User findUserById(long id) {
        for (User user : users
        ) {
            if (user.getId() == id) {
                return user;
            }

        }
        return null;
    }
    //removing user by ID
    @Override
    public void deleteUser(long id) {
        users.removeIf(user -> user.getId() == id);
    }

}
