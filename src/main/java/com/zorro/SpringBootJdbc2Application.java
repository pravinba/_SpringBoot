package com.zorro;

import java.util.List;
import java.util.Map;

import org.h2.server.web.WebServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootJdbc2Application {

	@Autowired
	private JdbcTemplate template;
	
	@Bean
	public ServletRegistrationBean h2servletRegistration() {
	    ServletRegistrationBean registration = new ServletRegistrationBean(new WebServlet());
	    registration.addUrlMappings("/console/*");
	    registration.addInitParameter("webAllowOthers", "true");
	    return registration;
	}
	
	@RequestMapping("/stocks")
	public List<Map<String,Object>> stocks(){
		return template.queryForList("select * from stock");
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringBootJdbc2Application.class, args);
	}
}
