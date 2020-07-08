package com.evan.wj.result;

public class Result {
    //响应码
    private int code;

    public Result(int code) {
        this.code = code;
    }

    //注：这里和vue前段文件的 < if (successResponse.data.code === 200) >是绑定的，下一行改成getCode222是不行的
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

}

