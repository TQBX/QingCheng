package com.qingcheng.entity;

import lombok.Data;

/**
 * 返回前端封装信息
 *
 * @author Summerday
 */
@Data
public class Result {

    private int code;
    private String message;

    public Result() {
        this.code = 0;
        this.message = "";
    }

    public Result(String message) {
        this.code = 0;
        this.message = message;
    }

    public Result(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
