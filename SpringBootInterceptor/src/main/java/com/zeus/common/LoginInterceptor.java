package com.zeus.common;

import java.lang.reflect.Method;

import org.jspecify.annotations.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class LoginInterceptor implements HandlerInterceptor{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		//경로설정
	    log.info("/login ~~ preHandle()"+request.getRequestURI());
	    HandlerMethod method = (HandlerMethod)handler;
	    Method methodObj = method.getMethod();
	    //객체주소
	    log.info("/login ~~ preHandle() bean ="+method.getBean());
	    //함수
	    log.info("/login ~~ preHandle() method ="+methodObj);
		
	    //세션의 존재유무 체크 : 세션(전역객체 MAP -> 키값 : VALUE객체)
	    HttpSession session = request.getSession();
	    if(session.getAttribute("userInfo") != null) {
	    	session.removeAttribute("user_info");
	    }
	    return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			@Nullable ModelAndView modelAndView) throws Exception {
		log.info("/login ~~ postHandle");
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler,
			@Nullable Exception ex) throws Exception {
		log.info("/login ~~ afterCompletion");
	}

}
