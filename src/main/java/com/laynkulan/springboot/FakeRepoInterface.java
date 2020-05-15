package com.laynkulan.springboot;

public interface FakeRepoInterface {
    void insertUser(long id,String name, String surname);

    User findUserById(long id);

    void deleteUser(long id);
}
