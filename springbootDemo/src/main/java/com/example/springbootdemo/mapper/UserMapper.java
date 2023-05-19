package com.example.springbootdemo.mapper;

import com.example.springbootdemo.controller.request.UserPageRequest;
import com.example.springbootdemo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * ClassName: UserMapper
 * Package: com.example.springbootdemo.mapper
 * Description:
 *
 * @Author 樊辰昊
 * @Create 17/05/2023 10:08 AM
 * @Version 1.0
 */
@Mapper
public interface UserMapper {
    //@Select("select * from user")
    List<User> list();

    List<User> listByCondition(UserPageRequest userPageRequest);

    void save(User user);

    User getById(Integer id);

    User update(Integer id);

    void updateById(User user);

    void deleteById(Integer id);
}
