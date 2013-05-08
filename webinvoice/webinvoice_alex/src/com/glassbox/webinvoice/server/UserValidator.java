package com.glassbox.webinvoice.server;

import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.glassbox.webinvoice.client.AccessDeniedException;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

@SuppressWarnings("serial")
@Service
@Aspect
public class UserValidator extends RemoteServiceServlet {

	@Autowired
	private HttpServletRequest request;
	
	private static final String POINTCUT = "execution(* com.glassbox.webinvoice.server..*.*(..))";

	@Before(POINTCUT)
	public void checkUser(JoinPoint joinPoint) throws AccessDeniedException {
		//if (request.getSession().getAttribute("currentUser") == null)
			//throw new AccessDeniedException();

	}
}
