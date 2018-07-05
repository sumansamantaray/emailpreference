/**
 * 
 */
package com.capitalone.microservice.pie.emailpreference.database;

import org.springframework.stereotype.Component;

import com.capitalone.microservice.pie.emailpreference.database.model.EmailPreferenceObject;

/**
 * @author SUSHREE
 *
 */
@Component
public interface EmailPreferenceDao {

	public int insertEmailPreference(EmailPreferenceObject emailPrefObj);
	
	public int updateEmailPreference(EmailPreferenceObject emailPrefObj);
	
	public int deleteEmailPreference(EmailPreferenceObject emailPrefObj);
}
