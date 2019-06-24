package com.shf.tomcat;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

import javax.servlet.ServletException;

/**
 * 描述：
 *
 * @Author shf
 * @Date 2019/5/26 14:24
 * @Version V1.0
 **/
public class SpringApplication {
	public static void run(){
		Tomcat tomcat = new Tomcat();
		tomcat.setPort(8000);
		try {
			tomcat.addWebapp("/", "D:\\");
			tomcat.start();
			tomcat.getServer().await();
		} catch (LifecycleException e) {
			e.printStackTrace();
		} catch (ServletException e) {
			e.printStackTrace();
		}

	}
}
