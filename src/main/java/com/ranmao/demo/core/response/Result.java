package com.ranmao.demo.core.response;

/**
 * @author ran.mao
 * @version 1.0.0.1
 * @description：TODO
 * @date 2024/10/14 10:43
 */
public class Result<T> {
    private int code;
    private String message;
    private T data;

  public Result(Integer code, String message, T data) {
    this.code = code;
    this.message = message;
    this.data = data;
  }

  public Result() {

  }
  //成功
  public static <T> Result<T> success(T data) {
    return new Result<>(ResultEnum.SUCCESS.getCode(), ResultEnum.getMessage(), data);
  }

  public static <T> Result<T> success(String message, T data) {
    return new Result<>(ResultEnum.SUCCESS.getCode(), message, data);
  }

  public static Result<?> failed() {
    return new Result<>(ResultEnum.COMMON_FAILED.getCode(), ResultEnum.COMMON_FAILED.getMessage(), null);
  }

  public static Result<?> failed(String message) {
    return new Result<>(ResultEnum.COMMON_FAILED.getCode(), message, null);
  }

  public static Result<?> failed(IResult errorResult) {
    return new Result<>(errorResult.getCode(), errorResult.getMessage(), null);
  }

  public int getCode() {
    return code;
  }

  public void setCode(int code) {
    this.code = code;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public T getData() {
    return data;
  }

  public void setData(T data) {
    this.data = data;
  }
}
