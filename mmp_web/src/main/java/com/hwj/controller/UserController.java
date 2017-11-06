package com.hwj.controller;


import com.hwj.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 *
 */
@WebServlet(urlPatterns = "/user")
public class UserController extends HttpServlet {

    private UserService userService = new UserService();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userName= req.getParameter("userName");
        String pwd =req.getParameter("pwd");
        userService.saveUser(userName,pwd);
        System.out.println(userName+"用户保存--controller");
        resp.setContentType("text/html;charset=utf-8");
        resp.getWriter().write(userName+"用户已保存！");
    }

}
