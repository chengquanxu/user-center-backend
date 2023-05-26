package com.cheng.usercenter.mytest;


import org.apache.commons.lang3.StringUtils;

/**
 * @author : Aaron
 * @date : 2023/5/17 18:35
 */
public class StringUtilsTest {
    public static void main(String[] args) {

//        System.out.println(StringUtils.isBlank(""));
//        System.out.println(StringUtils.isAnyBlank("s","fsfljks","world"));
        // isNotBlank() 表示参数为空结果为false 输入有空格也算空 所以返回false
        System.out.println(StringUtils.isNotBlank(" ")); //false
        // isBlank() 表示参数为空结果为true 并且包括输入的空格也算空
        System.out.println(StringUtils.isBlank("")); // true
        // isAllBlank() 表示所有参数为空则结果为true 并且包括输入的空格也算空
        System.out.println(StringUtils.isAllBlank(" ","")); // true
        // isAnyBlank() 表示任意一个参数为空则结果为true 并且包括输入的空格也算空
        System.out.println(StringUtils.isAnyBlank("","a")); // true
    }
}
