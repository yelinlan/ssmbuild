package com.yll.config;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 拦截器 SpringMVC独有，不拦截静态资源
 */
public class MyInterceptor implements HandlerInterceptor {
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws IOException, ServletException {
		System.out.println("=================执行前===================");
		if (request.getSession().getAttribute("token")!=null||request.getRequestURI().contains("login")){
			return true;
		}
		request.setAttribute("msg","请先注册，再登陆！");
		request.getRequestDispatcher("/index.jsp").forward(request,response);
		return false;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println("=================执行后===================");
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
		System.out.println("=================清理===================");
	}
}