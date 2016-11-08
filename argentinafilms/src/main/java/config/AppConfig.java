package config;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate3.annotation.AnnotationSessionFactoryBean;

import service.*;
import service.impl.*;
import dao.*;
import dao.impl.*;
import model.*;

@SuppressWarnings("rawtypes")
@Configuration
public class AppConfig {
	
	@Bean
	public DataSource dataSource(){
		DriverManagerDataSource ret = new DriverManagerDataSource("jdbc:mysql://localhost:3306/argentinafilms?createDatabaseIfNotExist=true",
																  "root", "admin");
		ret.setDriverClassName("com.mysql.jdbc.Driver");
		return ret;
	}
	
	@Bean
	public DAOPuntajes puntajesDAO(){
		return new DAOPuntajesImpl();
	}
	
	@Bean
	public DAOSesiones sesionesDAO(){
		return new DAOSesionesImpl();
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
	public DAOUsuario usuariosDAO(){
		return new DAOUsuarioImpl();
	}
	
	
	@Bean
	public ServicePelicula servicePelicula(){
		return new ServicePeliculaImpl();
	}
	
	@Bean
	public DAOPeliculas peliculasDAO(){
		return new DAOPeliculasImpl();
	}
	
	
	@Bean
	public ServiceGenero serviceGenero(){
		return new ServiceGeneroImpl();
	}
	
	@Bean
	public DAOGeneros generosDAO(){
		return new DAOGenerosImpl();
	}
	
	
	@Bean
	public ServiceDirector serviceDirector(){
		return new ServiceDirectorImpl();
	}
	
	@Bean
	public DAODirectores directoresDAO(){
		return new DAODirectoresImpl();
	}
	
	
	@Bean
	public ServiceActor serviceActor(){
		return new ServiceActorImpl();
	}
	
	@Bean
	public DAOActores actoresDAO(){
		return new DAOActoresImpl();
	}
	
	
	@Bean
	public ServiceResenia serviceResenia(){
		return new ServiceReseniaImpl();
	}
	
	@Bean
	public DAOResenias reseniasDAO(){
		return new DAOReseniasImpl();
	}
	
	
	@Bean
	public ServiceComentario serviceComentario(){
		return new ServiceComentarioImpl();
	}
	
	@Bean
	public DAOComentarios comentariosDAO(){
		return new DAOComentariosImpl();
	}
}
