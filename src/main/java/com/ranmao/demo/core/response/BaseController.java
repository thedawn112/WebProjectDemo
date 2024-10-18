package com.ranmao.demo.core.response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author ran.mao
 * @version 1.0.0.1
 * @description：TODO
 * @date 2024/10/16 11:16
 */
public class BaseController {
    private static final Logger LOGGER = LoggerFactory.getLogger(BaseController.class);
    //成功
    private static final int CODE_SUCCESS = 0;
    private static final String MSG_SUCCESS = "操作成功！";
    //失败
    private static final int CODE_FAILURE = 1;
    private static final String MSG_FAILURE = "操作失败！";

    public <T> Result<T> message(int code, String message, T data) {
        Result<T> result = new Result<>();
        result.setCode(code);
        result.setMessage(message);
        if (data != null) {
            result.setData(data);
        }
        return result;
    }
    public <T> Result<T> success() {
        return message(0,"请求成功！",null);
    }
    public <T> Result<T> success(String message,T data) {
        return message(CODE_SUCCESS,message,data);
    }
}
