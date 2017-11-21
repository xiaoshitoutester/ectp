package com.workec.ectp.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class ResultWithData<T>  extends Result<T>{


    /* 具体内容 */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public int getCode() {
        return super.getCode();
    }

    @Override
    public void setCode(int code) {
        super.setCode(code);
    }

    @Override
    public String getMsg() {
        return super.getMsg();
    }

    @Override
    public void setMsg(String msg) {
        super.setMsg(msg);
    }

    @Override
    public String toString() {
        return "{" +
                "\"code\":" + super.getCode() +
                ", \"msg\":\"" + super.getMsg() + '\"' +
                ", \"data\":" + data +
                '}';
    }
}
