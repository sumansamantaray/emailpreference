/**
 * 
 */
package com.capitalone.microservice.pie.emailpreference.database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.capitalone.microservice.pie.emailpreference.database.model.EmailPreferences;

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
	public int insertEmailPreference(EmailPreferences emailPrefObj) {
		/*piecofJdbcTemplate.update("insert into email_preferences (account_number, email_address, domestic_Inb, domestic_Out, international_Inb, international_Out, book_Inb, book_Out, email_format, status) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", 
				new Object[] {emailPrefObj.getAccountNumber(), emailPrefObj.getEmailAddress(), emailPrefObj.getDomesticInb(),
						emailPrefObj.getDomesticOut(), emailPrefObj.getInternationalInb(), emailPrefObj.getInternationalOut(),
						emailPrefObj.getBookInd(), emailPrefObj.getBookOut(), emailPrefObj.getEmailFormat(), emailPrefObj.getStatus()});*/
		return 0;
	}

	@Override
	@Bean
	public int updateEmailPreference(EmailPreferences emailPrefObj) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	@Bean
	public int deleteEmailPreference(EmailPreferences emailPrefObj) {
		// TODO Auto-generated method stub
		return 0;
	}

}
