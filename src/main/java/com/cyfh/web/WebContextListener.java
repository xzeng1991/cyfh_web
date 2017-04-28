package com.cyfh.web;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WebContextListener implements ServletContextListener {
	private final Logger log = LoggerFactory.getLogger(WebContextListener.class);
	
	public void contextDestroyed(ServletContextEvent arg0) {
		log.info(arg0.toString());
	}

	public void contextInitialized(ServletContextEvent event) {
		String ctxPath = event.getServletContext().getContextPath();
		log.info("=============================");
		log.info("| app manage webapp startup ");
		log.info("| ctxPath : " + ctxPath);
		log.info("=============================");
	}

}
