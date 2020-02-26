package org.techamol;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import java.util.*;
public class XmlConnection {

	public static void main(String[] args) {

		Resource r=new ClassPathResource("Connection.xml");
		BeanFactory bf=new XmlBeanFactory(r);
		JdbcTemplate template=(JdbcTemplate)bf.getBean("template");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Name");
		String name=sc.nextLine();
		System.out.println("Enter Email");
		String email=sc.nextLine();
		System.out.println("Enter Contact");
		String contact=sc.nextLine();
		template.execute("insert into register values('"+name+"','"+email+"','"+contact+"')");
		System.out.print("Success...................");
				
		 
	}

}
  