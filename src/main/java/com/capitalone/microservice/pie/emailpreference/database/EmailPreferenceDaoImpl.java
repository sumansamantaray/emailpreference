/**
 * 
 */
package com.capitalone.microservice.pie.emailpreference.database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.capitalone.microservice.pie.emailpreference.database.model.EmailPreferenceObject;

/**
 * @author Suman
 *
 */
@Component
public class EmailPreferenceDaoImpl implements EmailPreferenceDao {

	@Autowired
	JdbcTemplate piecofJdbcTemplate;
	
	@Override
	@Bean
	public int insertEmailPreference(EmailPreferenceObject emailPrefObj) {
		piecofJdbcTemplate.update("insert into email_preferences (account_number, email_address, domesticInb, domesticOut, internationalInb, internationalOut, bookInb, bookOut, email_format, status) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", emailPrefObj);
		return 0;
	}

	@Override
	@Bean
	public int updateEmailPreference(EmailPreferenceObject emailPrefObj) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	@Bean
	public int deleteEmailPreference(EmailPreferenceObject emailPrefObj) {
		// TODO Auto-generated method stub
		return 0;
	}

}
