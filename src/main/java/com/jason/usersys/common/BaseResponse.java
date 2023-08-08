package com.jason.usersys.common;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Jason Black
 * @version The past cannot be redeemed, the future can be changed.
 * @CreateTime 2023/8/7 09:56:07
 **/
@SuppressWarnings({"all"})
@Data
public class BaseReponse<T> implements Serializable {

    private int code;
    private T data;
    private String message;

    public BaseReponse(int code, T data, String message) {
        this.code = code;
        this.data = data;
        this.message = message;
    }

    public BaseReponse(int code, T data ) {
        this.code = code;
        this.data = data;
        this.message = "";
    }
}
