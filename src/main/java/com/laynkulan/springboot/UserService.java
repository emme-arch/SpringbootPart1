package com.laynkulan.springboot;

public interface UserService {


    void removeUser(long Id);

    long getUser(long Id);

    String addUser(long id, String name, String surname);
}
