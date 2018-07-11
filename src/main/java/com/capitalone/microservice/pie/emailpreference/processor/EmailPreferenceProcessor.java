/**
 * 
 */
package com.capitalone.microservice.pie.emailpreference.processor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.capitalone.microservice.pie.emailpreference.database.EmailPreferenceDao;
import com.capitalone.microservice.pie.emailpreference.database.model.EmailPreferences;
import com.capitalone.microservice.pie.emailpreference.util.EmailPreferenceUtil;

/**
 * @author SUSHREE
 *
 */
@Component
public class EmailPreferenceProcessor {
	
	@Autowired
	EmailPreferenceUtil emailPrefUtil;
	
	@Autowired
	@Qualifier ("hibernateImpl")
	EmailPreferenceDao emailPrefHibernateDaoImpl;

	public void processEmailPreference() {
		
		List<EmailPreferences> emailPrefObjList = emailPrefUtil.readFromXlsxFile();
		for (EmailPreferences emailPrefObj : emailPrefObjList) {
			System.out.println("Account number: "+emailPrefObj.getAccountNumber());
			if ("D".equals(emailPrefObj.getStatus())) {
				// Delete email preference will be called.....
				emailPrefHibernateDaoImpl.deleteEmailPreference(emailPrefObj);
			}
			else if ("A".equals(emailPrefObj.getStatus())) {
				emailPrefHibernateDaoImpl.insertEmailPreference(emailPrefObj);
			}
			else {
				emailPrefHibernateDaoImpl.updateEmailPreference(emailPrefObj);
				// Update Email preference will be called....
			}
		}
	}
}
