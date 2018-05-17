package com.opensmart.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class LoginInterceptor implements HandlerInterceptor{

	/** 
     * Handler执行完成之后调用这个方法 
     */  
	@Override
	public void afterCompletion(HttpServletRequest req,HttpServletResponse res, Object obj, Exception e)throws Exception {
		//System.out.println("处理请求后");
	}

	/** 
     * Handler执行之后，ModelAndView返回之前调用这个方法 
     */
	@Override
	public void postHandle(HttpServletRequest req, HttpServletResponse res, Object obj, ModelAndView mav) throws Exception {
		//System.out.println("请求后渲染ModelAndView前");
	}

	/**
	 * Handler方法之前执行
	 */
	@Override
	public boolean preHandle(HttpServletRequest req, HttpServletResponse res,Object obj) throws Exception {
		String url=req.getRequestURI();
		if(url.indexOf("userController")>=0)return true;
		HttpSession session = req.getSession();  
        String userName = (String)session.getAttribute("userName");
        if(userName!=null)return true;
		return false;
	}

}
