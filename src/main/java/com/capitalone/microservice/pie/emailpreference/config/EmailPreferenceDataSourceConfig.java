/**
 * 
 */
package com.capitalone.microservice.pie.emailpreference.config;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author Suman
 *
 */
@Configuration
@EnableTransactionManagement
public class EmailPreferenceDataSourceConfig {

	@Bean
	@Primary
	@ConfigurationProperties (prefix = "spring.datasource")
	public DataSource piecofDataSource() {
		
		return DataSourceBuilder.create().build();
	}
	
	/*public JdbcTemplate jdbcTemplate(DataSource dataSource)
    {
        return new JdbcTemplate(this.piecofDataSource());
    }*/
	
	@Bean
	public LocalSessionFactoryBean sessionFactory() {
		
		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
		sessionFactory.setDataSource(this.piecofDataSource());
		sessionFactory.setPackagesToScan("com.capitalone.microservice.pie.emailpreference");
		return sessionFactory;
	}
	
	@Bean
	public HibernateTransactionManager transactionManager() {
		HibernateTransactionManager transactionManager = new HibernateTransactionManager();
		transactionManager.setSessionFactory(this.sessionFactory().getObject());
		return transactionManager;
	}
}
