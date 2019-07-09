package com.haoliwan.propagation.result;

import com.haoliwan.propagation.ErrorItem;

public class Result {
    private boolean success;
    private Object data;
    private String code;
    private String message;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Result() {
    }

    public Result(Object data) {
        this.success = true;
        this.data = data;
    }

    public Result(String code,String message) {
        this.success(false);
        this.setCode(code);
        this.setMessage(message);
    }

    public Result(ErrorItem errorItem) {
        this.success(false);
        this.setCode(errorItem.getCode());
        this.setMessage(errorItem.getMessage());
    }

    public static Result success(){
        Result result = new Result();
        result.setSuccess(true);
        return  result;
    }

    public static Result success(Object data){
        return  new Result(data);
    }

    public static Result error(String code,String message){
        return  new Result(code,message);
    }

    public static Result error(ErrorItem errorItem){
        return  new Result(errorItem);
    }

}
