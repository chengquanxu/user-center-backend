package com.cheng.usercenter.model.request;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户登录请求体
 * @author : Aaron
 * @date : 2023/5/17 14:21
 */

@Data
public class UserLoginRequest implements Serializable {

    private static final long serialVersionUID = -9138492567899762999L;

    private String userAccount;

    private String userPassword;
}
