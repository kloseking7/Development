package com.glassbox.webinvoice.server.service;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.glassbox.webinvoice.shared.AccessDeniedException;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;


@SuppressWarnings("serial")
@Service
@Aspect
public class SystemSupervisor extends RemoteServiceServlet {
	private static Logger logger = Logger.getLogger(SystemSupervisor.class);

	@Autowired(required=false)
	private HttpServletRequest request;

	private static final String POINTCUT = "execution(* com.glassbox.webinvoice.server..*.*(..))";

	@Before(POINTCUT)
	public void checkUser(JoinPoint joinPoint) throws AccessDeniedException {
		// if (request.getSession().getAttribute("currentUser") == null)
		// throw new AccessDeniedException();

	}

	@AfterThrowing(pointcut = POINTCUT, throwing = "ex")
	public void logAfterTrowing(JoinPoint jp, Exception ex) {
		String args = "parameter passed in are:\n";
		if (jp.getSignature() instanceof MethodSignature) {
			final MethodSignature ms = (MethodSignature) jp.getSignature();
			final Class<?>[] parameterTypes = ms.getParameterTypes();
			for (final Class<?> pt : parameterTypes) {
				args += pt;
			}
		}
		logger.error("Exception is " + ex + " happened in  "
				+ jp.getSignature() + "\n" + args);
	}

}
