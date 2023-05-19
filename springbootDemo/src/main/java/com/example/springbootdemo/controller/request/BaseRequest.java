package com.example.springbootdemo.controller.request;

import lombok.Data;

/**
 * ClassName: BaseRequest
 * Package: com.example.springbootdemo.controller.request
 * Description:
 *
 * @Author 樊辰昊
 * @Create 17/05/2023 3:47 PM
 * @Version 1.0
 */
@Data
public class BaseRequest {
    private Integer pageNum = 1;
    private Integer pageSize = 10;

}
