/**
 * 
 */
package com.capitalone.microservice.pie.emailpreference.database;

import org.springframework.stereotype.Component;

import com.capitalone.microservice.pie.emailpreference.database.model.EmailPreferences;

/**
 * @author SUSHREE
 *
 */
@Component
public interface EmailPreferenceDao {

	public int insertEmailPreference(EmailPreferences emailPrefObj);
	
	public int updateEmailPreference(EmailPreferences emailPrefObj);
	
	public int deleteEmailPreference(EmailPreferences emailPrefObj);
}
