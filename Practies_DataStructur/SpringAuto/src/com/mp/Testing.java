package com.mp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Manoj
 *
 */
public class Testing {

	public static void main(String[] args) {
		/*Resource rs=new ClassPathResource("resource/resource.xml");
		BeanFactory fac=new XmlBeanFactory(rs);	*/
		ApplicationContext fac=new ClassPathXmlApplicationContext("resource/resource.xml");
		Engine ea=(Engine)fac.getBean("ea");
		Car c=(Car)fac.getBean("ca");
		
		System.out.println(c);
	}

}
