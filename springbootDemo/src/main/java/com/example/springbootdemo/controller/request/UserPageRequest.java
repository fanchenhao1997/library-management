package com.example.springbootdemo.controller.request;

import lombok.Data;

import java.nio.channels.Pipe;

/**
 * ClassName: UserPageRequest
 * Package: com.example.springbootdemo.controller.request
 * Description:
 *
 * @Author 樊辰昊
 * @Create 17/05/2023 3:44 PM
 * @Version 1.0
 */
@Data
public class UserPageRequest extends BaseRequest{
    private String name;
    private String phone;
}
