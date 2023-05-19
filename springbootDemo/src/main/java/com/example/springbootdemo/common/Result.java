package com.example.springbootdemo.common;

import lombok.Data;

/**
 * ClassName: Result
 * Package: com.example.springbootdemo.common
 * Description:
 *
 * @Author 樊辰昊
 * @Create 17/05/2023 1:38 PM
 * @Version 1.0
 */
@Data
public class Result {
    private static final String SUCCESS_CODE = "200";
    private static final String ERROR_CODE = "-1";

    private String code;
    private Object data;
    private String msg;

    public static Result success(){
        Result result = new Result();
        result.setCode(SUCCESS_CODE);
        return result;
    }

    public static Result success(Object data){
        Result result = new Result();
        result.setCode(SUCCESS_CODE);
        result.setData(data);
        return result;
    }

    public static Result error(String msg){
        Result result = new Result();
        result.setCode(ERROR_CODE);
        result.setMsg(msg);
        return result;
    }

}
