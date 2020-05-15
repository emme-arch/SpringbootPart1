package com.laynkulan.springboot;

import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService {
    FakeRepoInterface fakeRepo;

    @Autowired
    public UserServiceImpl(FakeRepoInterface fakeRepo) {
        this.fakeRepo = fakeRepo;
    }

    @Override
    public String addUser(long id, String name, String surname) {
        fakeRepo.insertUser(1, name, surname);
        return name;
    }


    @Override
    public void removeUser(long id) {
        fakeRepo.deleteUser(id);
    }

    @Override
    public long getUser(long id) {
        fakeRepo.findUserById(id);
        return id;
    }
}
