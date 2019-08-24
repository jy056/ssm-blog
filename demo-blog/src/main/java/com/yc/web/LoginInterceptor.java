package com.yc.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;

import com.google.gson.Gson;
import com.yc.vo.Result;
//拦截器	只有登陆的博主可以发表博文、评论等
public class LoginInterceptor implements HandlerInterceptor{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		if(request.getSession().getAttribute("loginedUser")==null){
			//判断是否是ajax请求
			if(request.getHeader("X-Requested-With")==null){
				System.out.println("===不是ajax===");
				response.sendRedirect("index?login");
			}else{
				System.out.println("===是ajax===");
				Gson gson=new Gson();
				String json=gson.toJson(new Result(0,"请先登陆系统！"));
				//让jquery将json字符转换成json对象
				response.setContentType("application/json;charset=UTF-8");
				response.getWriter().append(json);
			}
			return false;
		}else{
			return true;
		}
		//return HandlerInterceptor.super.preHandle(request, response, handler);
	}

}
