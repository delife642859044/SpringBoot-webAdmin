package com.example.config;

import org.aopalliance.intercept.Interceptor;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//登录拦截器
public class LoginHandlerInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        /*检测是否登录*/
        Object loginUser = request.getSession().getAttribute("loginUser");
        if (loginUser == null){
            request.getRequestDispatcher("/login").forward(request,response);
            return false;
        }else{
            return true;
        }

    }
}
