package com.hwj.service;

import com.hwj.dao.UserDao;

public class UserService {

    private UserDao userDao = new UserDao();

    public void saveUser(String userName,String pwd){
        userDao.saveUser(userName,pwd);
        System.out.println(userName+"用户保存--service");
    }
}
