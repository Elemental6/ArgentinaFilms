package config;

import java.util.Properties;
import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate3.annotation.AnnotationSessionFactoryBean;
import org.springframework.orm.jpa.JpaTransactionManager;

@Configuration
public class AppConfig {
	
	@Bean
	public DataSource dataSource(){
		DriverManagerDataSource ret = new DriverManagerDataSource("jdbc:mysql://localhost:3306/prueba", "root", "root");
		ret.setDriverClassName("com.mysql.jdbc.Driver");
		return ret;
	}
	
	@Bean
	public AnnotationSessionFactoryBean sessionFactoryBean(){
		AnnotationSessionFactoryBean ret = new AnnotationSessionFactoryBean();
		
		Properties hibernateProperties = new Properties();
		hibernateProperties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5InnoDBDialect");
		hibernateProperties.setProperty("hibernate.show_sql", "true");
		hibernateProperties.setProperty("hibernate.hbm2ddl.auto", "update");
		ret.setHibernateProperties(hibernateProperties);
		
		ret.setDataSource(dataSource());
		return ret; 
	}
	
}
