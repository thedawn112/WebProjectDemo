package com.ranmao.demo.core.response;

public enum ResultEnum implements IResult {
    /**
     * 通用错误，接口参数不全
     */
    ERROR_10010001("参数不全或类型错误！"),
    ERROR_10010002("您还未登录，请先登录！"),
    ERROR_10010003("数据不存在！"),
    ERROR_10010012("图形验证码错误！"),
    ERROR_10010013("短信验证码错误！"),
    ERROR_10010014("不允许重复评论！"),

    /**
     * 专用错误，根据实际情况添加修改
     */
    ERROR_20010001("试题被删除，无法继续考试！"),
    ERROR_20010002("您有正在进行的考试！"),


    ERROR_90010001("账号不存在，请确认！"),
    ERROR_90010002("账号或密码错误！"),
    ERROR_90010003("至少要包含一个角色！"),
    ERROR_90010004("管理员账号无法修改！"),
    ERROR_90010005("账号被禁用，请联系管理员！"),
    ERROR_90010006("活动用户不足，无法开启竞拍！"),
    ERROR_90010007("旧密码不正确，请确认！"),


    ERROR_60000001("数据不存在！");
    private String message;

    ResultEnum(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public Integer getCode() {
        return Integer.parseInt(this.name().replace("ERROR_", ""));
    }
}
