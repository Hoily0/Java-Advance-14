package com.work.controller;

import com.work.entity.User;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

import java.util.Date;


/**
 * @author 30391
 */
public class UserController {

    public static void main(String[] args) throws Exception {

        String userStr = "10001:张三:男:1990-01-01#10002:李四:女:1989-01-09#10003:王五" +
                ":男:1999-09-09#10004:刘备:男:1899-01-01#10005:孙悟空:" +
                "男:1900-01-01#10006:张三:女:1999-01-01#10007:刘备:女:" +
                "1999-01-01#10008:张三:女:2003-07-01#10009:猪八戒:男:1900-01-01";

        regularMatcher(userStr);

    }

    private static void regularMatcher(String s) throws Exception {

//        String regex = "\\d{5}, (?!男|女)[\\u4e00-\\u9fa5], (男|女) , ([0-9]{3}[1-9]|[0-9]{2}[1-9][0-9]" +
//                "{1}|[0-9]{1}[1-9][0-9]{2}|[1-9][0-9]{3})-(((0[13578]|1[02])-(0[1-9]|[12][0-9]|3[01]))" +
//                "|((0[469]|11)-(0[1-9]|[12][0-9]|30))|(02-(0[1-9]|[1][0-9]|2[0-8])))";
//        String regexId = "\\d{5}";
//        String regexName = "(?!男|女)[\\u4e00-\\u9fa5]";
//        String regexSex = "(男|女)";
//        String regexBirthday = "([0-9]{3}[1-9]|[0-9]{2}[1-9][0-9]\" +\n" +
//                "                \"{1}|[0-9]{1}[1-9][0-9]{2}|[1-9][0-9]{3})-(((0[13578]|1[02])-(0[1-9]|[12][0-9]|3[01]))\" +\n" +
//                "                \"|((0[469]|11)-(0[1-9]|[12][0-9]|30))|(02-(0[1-9]|[1][0-9]|2[0-8])))";


        ArrayList<User> userList = new ArrayList<>();
        String[] split = s.split("#");

        for (String string : split) {
            String[] userInfoArray = string.split(":");

            if (userInfoArray.length == 4) {
                Long id = Long.parseLong(userInfoArray[0]);
                String name = userInfoArray[1];
                String gender = userInfoArray[2];
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
                Date birthday = simpleDateFormat.parse(userInfoArray[3]);

                User user = new User(id, name, gender, birthday);
                userList.add(user);

            }
        }
        System.out.println(userList);


    }


}
