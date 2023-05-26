package com.cheng.usercenter.mytest;

import org.apache.commons.lang3.StringUtils;

/**
 * @author : Aaron
 * @date : 2023/5/17 19:13
 */
public class Test02 {
    public static void main(String[] args) {
        System.out.println(StringUtils.isEmpty(" ")); // false
        System.out.println(StringUtils.isBlank(" ")); // true
        System.out.println(StringUtils.isBlank("\b")); // false
        System.out.println(StringUtils.isBlank("\n")); // true
    }
}
