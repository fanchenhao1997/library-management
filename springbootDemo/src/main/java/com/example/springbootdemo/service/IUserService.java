package com.example.springbootdemo.service;

import com.example.springbootdemo.controller.request.UserPageRequest;
import com.example.springbootdemo.entity.User;

import java.util.List;

/**
 * ClassName: IUserService
 * Package: com.example.springbootdemo.service
 * Description:
 *
 * @Author 樊辰昊
 * @Create 17/05/2023 10:13 AM
 * @Version 1.0
 */
public interface IUserService {

    List<User> list();

    Object page(UserPageRequest userPageRequest);

    void save(User user);

    User getById(Integer id);

    void update(User user);

    void deleteById(Integer id);
}
