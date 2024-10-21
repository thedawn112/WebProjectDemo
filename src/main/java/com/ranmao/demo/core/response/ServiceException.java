package com.ranmao.demo.core.response;

/**
 * @author ran.mao
 * @version 1.0.0.1
 * @description：TODO
 * @date 2024/10/21 17:12
 */
public class ServiceException extends RuntimeException {
    private int code;
    private String message;

    public ServiceException(Result result) {
        this.code = result.getCode();
        this.message = result.getMessage();
    }

    public ServiceException(ResultEnum resultEnum) {
        this.code = resultEnum.getCode();
        this.message = resultEnum.getMessage();
    }

    public ServiceException(String message) {
        this.code = 1;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
