package org.techamol;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class ClientAppConstr {

	public static void main(String[] args) {
		
		Resource r=new ClassPathResource("Springtest.xml");
		BeanFactory bf=new XmlBeanFactory(r);
		Test t=(Test)bf.getBean("a");

	}

}
