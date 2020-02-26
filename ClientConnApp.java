package org.techamol;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class ClientConnApp {

	public static void main(String[] args) {

		DriverManagerDataSource d=new DriverManagerDataSource();
		d.setDriverClassName("com.mysql.jdbc.Driver");
		d.setUsername("root");
		d.setPassword("Amol@2121");
		d.setUrl("jdbc:mysql://localhost:3306/SpringJDBC");
		if(d!=null)
		{
			System.out.println("Database Connected..........");
			JdbcTemplate template=new JdbcTemplate();
		}
		else
		{
			System.out.println("Database Not Connected..........");

		}
		
	}

}
