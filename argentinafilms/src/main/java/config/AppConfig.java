package config;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate3.annotation.AnnotationSessionFactoryBean;

import service.ServiceUsuario;
import service.impl.ServiceUsuarioImpl;
import dao.DAOUsuario;
import dao.impl.DAOUsuarioImpl;
import model.*;
@SuppressWarnings("rawtypes")

@Configuration
public class AppConfig {
	
	@Bean
	public DataSource dataSource(){
		DriverManagerDataSource ret = new DriverManagerDataSource("jdbc:mysql://localhost:3306/argentinafilms?createDatabaseIfNotExist=true",
																  "root", "root");
		ret.setDriverClassName("com.mysql.jdbc.Driver");
		return ret;
	}
	
	
	@Bean
	public AnnotationSessionFactoryBean sessionFactoryBean(){
		AnnotationSessionFactoryBean ret = new AnnotationSessionFactoryBean();
		
		Class[] annotatedClasses = { Actores.class, Comentarios.class, Directores.class, Generos.class, Peliculas.class, Puntajes.class, Resenias.class, Sesiones.class, Usuarios.class };
		ret.setAnnotatedClasses(annotatedClasses);
		
		Properties hibernateProperties = new Properties();
		hibernateProperties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5InnoDBDialect");
		hibernateProperties.setProperty("hibernate.show_sql", "false");
		hibernateProperties.setProperty("hibernate.hbm2ddl.auto", "update");
		ret.setHibernateProperties(hibernateProperties);
		
		ret.setDataSource(dataSource());
		return ret; 
	}
	
	
	@Bean
	public ServiceUsuario serviceUsuario(){
		return new ServiceUsuarioImpl();
	}
	
	
	@Bean
	public DAOUsuario daoUsuario(){
		return new DAOUsuarioImpl();
	}
	

}
