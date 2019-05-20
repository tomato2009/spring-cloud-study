package com.itmuch.cloud.study.vo;

import lombok.Data;

/**
 * @Desc:
 * @Author: YanQing
 * @Date: 2019/5/20 16:16
 * @Version 1.0
 */
@Data
public class ResponseResult {
    private int code;
    private String msg;

    public static ResponseResult fail(int code, String msg) {
        ResponseResult result = new ResponseResult();
        result.code = 1;
        result.msg = msg;

        return result;
    }
}
