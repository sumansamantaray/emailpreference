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

/**
 * @author Suman
 *
 */
@Configuration
public class EmailPreferenceDataSourceConfig {

	@Bean
	@Primary
	@ConfigurationProperties (prefix = "spring.datasource")
	public DataSource piecofDataSource() {
		
		return DataSourceBuilder.create().build();
	}
	
	public JdbcTemplate jdbcTemplate(DataSource dataSource)
    {
        return new JdbcTemplate(this.piecofDataSource());
    }
}
