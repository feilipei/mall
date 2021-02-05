package com.macro.mall.common.api;

/**
 * 枚举了一些常用API操作码
 * 为了让编译器能自动检查某个值在枚举的集合内，
 * 并且不同用途的枚举需要不同的类型来标记，不能混用
 * Created by macro on 2019/4/19.
 */
public enum ResultCode implements IErrorCode {

    //定义的每个实例都是引用类型的唯一实例；每个枚举的值都是class实例
    //（code, message)为构造函数。
    SUCCESS(200, "操作成功"),
    FAILED(500, "操作失败"),
    VALIDATE_FAILED(404, "参数检验失败"),
    UNAUTHORIZED(401, "暂未登录或token已经过期"),
    FORBIDDEN(403, "没有相关权限");

    private long code;
    private String message;

    private ResultCode(long code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public long getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
