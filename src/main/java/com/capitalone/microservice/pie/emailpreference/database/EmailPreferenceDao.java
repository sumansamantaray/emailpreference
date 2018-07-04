/**
 * 
 */
package com.capitalone.microservice.pie.emailpreference.database;

import com.capitalone.microservice.pie.emailpreference.database.model.EmailPreferenceObject;

/**
 * @author SUSHREE
 *
 */
public interface EmailPreferenceDao {

	public int insertEmailPreference(EmailPreferenceObject emailPrefObj);
	
	public int updateEmailPreference(EmailPreferenceObject emailPrefObj);
	
	public int deleteEmailPreference(EmailPreferenceObject emailPrefObj);
}
