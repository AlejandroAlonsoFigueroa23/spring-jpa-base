package alejandro.figueroa.configuracion;

import javax.transaction.TransactionManager;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaDialect;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import alejandro.figueroa.manejoTransaccional.TrxManagerImpl;

@Configuration
@EnableTransactionManagement
public class ConfiguracionBBDD {
	
	/*
	 * Conexión a BBDD
	 */
	@Bean
	DriverManagerDataSource getDataSource(){
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setUrl("jdbc:mysql://localhost:3306/curso_hibernate?serverTimezone=UTC&useSSL=false");
		ds.setUsername("root");
		ds.setPassword("Nala10demayo");
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		return ds;
	}
	
	@Bean
	LocalContainerEntityManagerFactoryBean emFactory() {
		LocalContainerEntityManagerFactoryBean emFactory = new LocalContainerEntityManagerFactoryBean();
		emFactory.setDataSource(getDataSource());
		emFactory.setPackagesToScan("alejandro.figueroa.entidades");
		emFactory.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
		//emFactory.setJpaDialect(new HibernateJpaDialect());
		emFactory.setPersistenceUnitName("unidadPersistencia");
		return emFactory;
	}

	@Bean
	PlatformTransactionManager trxManager() {
		JpaTransactionManager trxManager = new JpaTransactionManager();
		trxManager.setEntityManagerFactory(emFactory().getObject());
		
		return trxManager;
		//return new TrxManagerImpl();
	}
}
