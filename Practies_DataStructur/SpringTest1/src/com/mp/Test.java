package com.mp;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * @author Manoj
 *
 */
public class Test {

	public static void main(String[] args) {
		Resource rs=new ClassPathResource("resource.xml");
		BeanFactory fac=new XmlBeanFactory(rs);
		System.out.println("hello");

	}

}
