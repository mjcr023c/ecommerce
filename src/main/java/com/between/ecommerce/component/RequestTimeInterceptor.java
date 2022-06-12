package com.between.ecommerce.component;

import java.net.URL;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import com.between.ecommerce.repository.LogRepository;



/**
 * The Class RequestTimeInterceptor.
 */
@Component("requestTimeInterceptor")
public class RequestTimeInterceptor implements HandlerInterceptor {

	/**
	 *  The log repository.
	 */
	@Autowired
	@Qualifier("logRepository")
	private LogRepository logRepository;

	/** The Constant logger. */
	private static final Log logger = LogFactory.getLog(RequestTimeInterceptor.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.springframework.web.servlet.handler.HandlerInterceptorAdapter#preHandle(
	 * javax.servlet.http.HttpServletRequest,
	 * javax.servlet.http.HttpServletResponse, java.lang.Object)
	 */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		request.setAttribute("startTime", System.currentTimeMillis());
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.web.servlet.handler.HandlerInterceptorAdapter#
	 * afterCompletion(javax.servlet.http.HttpServletRequest,
	 * javax.servlet.http.HttpServletResponse, java.lang.Object,
	 * java.lang.Exception)
	 */
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		long starTime = (long) request.getAttribute("startTime");
		String url = request.getRequestURL().toString();
		String domain = new URL(request.getRequestURL().toString()).getHost(); 
		
		logRepository.save(new com.between.ecommerce.entity.Log(new Date(), (System.currentTimeMillis() - starTime) + "ms", domain, url));

		logger.info("Url to:'" + url + "' in:'" + (System.currentTimeMillis() - starTime) + "ms");
	}

}
