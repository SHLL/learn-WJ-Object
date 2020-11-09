package com.example.springdemo.result;

public class Result {
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    //测试result 方式
    private int code;

    public Result(int code){
        this.code = code;
    }

}
