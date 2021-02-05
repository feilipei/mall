package com.macro.mall.common.api;

/**
 * 封装API的错误码
 * 接口定义的所有方法默认都是public abstract的
 * Created by macro on 2019/4/19.
 */
public interface IErrorCode {
    /**
     * 获取错误码
     * @return
     */
    long getCode();

    /**
     * 获取错误信息
     * @return
     */
    String getMessage();
}
