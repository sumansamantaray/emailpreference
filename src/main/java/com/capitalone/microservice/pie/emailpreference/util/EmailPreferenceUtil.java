/**
 * 
 */
package com.capitalone.microservice.pie.emailpreference.util;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.capitalone.microservice.pie.emailpreference.database.model.EmailPreferenceObject;

/**
 * @author Suman
 *
 */
@Component
public class EmailPreferenceUtil {

	// 1234567890|suman.samantaray@email.com|N|N|N|N|N|N|HTML
	
	@Bean
	public List<EmailPreferenceObject> readEmailPreferenceFile() {
		
		List<EmailPreferenceObject> emailPreferenceList = new ArrayList<>();
		try {
			Scanner sc = new Scanner(new FileInputStream(new File("./src/main/resources/emailpreference.txt")));
			
			while (sc.hasNext()) {
				String emailPreferenceRecord = sc.nextLine();
				String[] splitRecord = emailPreferenceRecord.split("\\|");
				EmailPreferenceObject emailPrefObj = new EmailPreferenceObject();
				emailPrefObj.setAccountNumber(splitRecord[0]);
				emailPrefObj.setEmailAddress(splitRecord[1]);
				emailPrefObj.setDomesticInb(splitRecord[2]);
				emailPrefObj.setDomesticOut(splitRecord[3]);
				emailPrefObj.setInternationalInb(splitRecord[4]);
				emailPrefObj.setInternationalOut(splitRecord[5]);
				emailPrefObj.setBookInd(splitRecord[6]);
				emailPrefObj.setBookOut(splitRecord[7]);
				emailPrefObj.setEmailFormat(splitRecord[8]);
				emailPrefObj.setStatus(splitRecord[9]);
				emailPreferenceList.add(emailPrefObj);
			}
			
			sc.close();
		} catch (Exception exp) {
			exp.printStackTrace();
		}
		
		
		return emailPreferenceList;
	}
}
