package com.jason.usersys.model.request;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Jason Black
 * @version The past cannot be redeemed, the future can be changed.
 * @CreateTime 2023/8/3 08:26:36
 **/
@SuppressWarnings({"all"})
@Data
public class UserRegisterRequest implements Serializable {

    private String userAccount;
    private String userPassword;
    private String checkPassword;
}
