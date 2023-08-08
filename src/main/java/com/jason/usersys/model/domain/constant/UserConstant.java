package com.jason.usersys.constant;

/**
 * 存储常量
 *
 * @author Jason Black
 * @version The past cannot be redeemed, the future can be changed.
 * @CreateTime 2023/8/3 10:00:40
 **/
public interface UserConstant {

    /**
     * 用户登录状态
     */
    String USER_LOGIN_STATE = "userLoginState";

    /**
     * 用户角色
     * <p>
     * ROOT_ROLE 管理员
     * <p>
     * NORMAL 普通用户
     */
    Integer ROOT_ROLE = 1;
    Integer NORMAL_ROLE = 0;

    /**
     * 混淆密码
     */
    String STAMP = "Jason";
}
