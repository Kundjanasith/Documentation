package com.websystique.springmvc.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesViewResolver;


@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.websystique.springmvc")
public class AppConfig extends WebMvcConfigurerAdapter{

	@Bean
	public TilesConfigurer tilesConfigurer(){
	    TilesConfigurer tilesConfigurer = new TilesConfigurer();
	    tilesConfigurer.setDefinitions(new String[] {"/WEB-INF/views/**/tiles.xml"});
	    tilesConfigurer.setCheckRefresh(true);
	    return tilesConfigurer;
	}

	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		TilesViewResolver viewResolver = new TilesViewResolver();
		registry.viewResolver(viewResolver);
	}
	
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("/static/");
    }
    
 	@Bean
 	public DataSource getDataSource() {
 		DriverManagerDataSource dataSource = new DriverManagerDataSource();
 		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
 		dataSource.setUrl("jdbc:mysql://localhost:3306/assignment3?useUnicode=yes&characterEncoding=UTF-8");
 		dataSource.setUsername("root");
 		dataSource.setPassword("");
 		
 		return dataSource;
 	}
 	
 	@Bean
 	public StudentJDBCTemplate getStudentJDBCTemplate() {
 		StudentJDBCTemplate studentJDBCTemplate = new StudentJDBCTemplate();
 		studentJDBCTemplate.setDataSource(getDataSource());
 		return studentJDBCTemplate;
 	}
    
}

