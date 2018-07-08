/**
 * 
 */
package com.capitalone.microservice.pie.emailpreference.database.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

/**
 * @author Suman
 *
 */
@Entity
@Component
public class EmailPreferences implements Serializable{

	// 1234567890|suman.samantaray@email.com|N|N|N|N|N|N|HTML
	
	@Id
//	@Column (name = "email_preference_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int emailPreferenceId;
	
	@Column (name = "account_number")
	private String accountNumber;
	
	@Column (name = "email_address")
	private String emailAddress;
	
	@Column (name = "domestic_Inb")
	private String domesticInb;
	
	@Column (name = "domestic_Out")
	private String domesticOut;
	
	@Column (name = "international_Inb")
	private String internationalInb;
	
	@Column (name = "international_Out")
	private String internationalOut;
	
	@Column (name = "book_Inb")
	private String bookInd;
	
	@Column (name = "book_Out")
	private String bookOut;
	
	@Column (name = "email_format")
	private String emailFormat;
	
	@Column (name = "status")
	private String status;
	
	
	/**
	 * @return the emailPreferenceId
	 */
	public int getEmailPreferenceId() {
		return emailPreferenceId;
	}

	/**
	 * @param emailPreferenceId the emailPreferenceId to set
	 */
	public void setEmailPreferenceId(int emailPreferenceId) {
		this.emailPreferenceId = emailPreferenceId;
	}

	/**
	 * @return the accountNumber
	 */
	public String getAccountNumber() {
		return accountNumber;
	}

	/**
	 * @param accountNumber the accountNumber to set
	 */
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	/**
	 * @return the emailAddress
	 */
	public String getEmailAddress() {
		return emailAddress;
	}

	/**
	 * @param emailAddress the emailAddress to set
	 */
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	/**
	 * @return the domesticInb
	 */
	public String getDomesticInb() {
		return domesticInb;
	}

	/**
	 * @param domesticInb the domesticInb to set
	 */
	public void setDomesticInb(String domesticInb) {
		this.domesticInb = domesticInb;
	}

	/**
	 * @return the domesticOut
	 */
	public String getDomesticOut() {
		return domesticOut;
	}

	/**
	 * @param domesticOut the domesticOut to set
	 */
	public void setDomesticOut(String domesticOut) {
		this.domesticOut = domesticOut;
	}

	/**
	 * @return the internationalInb
	 */
	public String getInternationalInb() {
		return internationalInb;
	}

	/**
	 * @param internationalInb the internationalInb to set
	 */
	public void setInternationalInb(String internationalInb) {
		this.internationalInb = internationalInb;
	}

	/**
	 * @return the internationalOut
	 */
	public String getInternationalOut() {
		return internationalOut;
	}

	/**
	 * @param internationalOut the internationalOut to set
	 */
	public void setInternationalOut(String internationalOut) {
		this.internationalOut = internationalOut;
	}

	/**
	 * @return the bookInd
	 */
	public String getBookInd() {
		return bookInd;
	}

	/**
	 * @param bookInd the bookInd to set
	 */
	public void setBookInd(String bookInd) {
		this.bookInd = bookInd;
	}

	/**
	 * @return the bookOut
	 */
	public String getBookOut() {
		return bookOut;
	}

	/**
	 * @param bookOut the bookOut to set
	 */
	public void setBookOut(String bookOut) {
		this.bookOut = bookOut;
	}

	/**
	 * @return the emailFormat
	 */
	public String getEmailFormat() {
		return emailFormat;
	}

	/**
	 * @param emailFormat the emailFormat to set
	 */
	public void setEmailFormat(String emailFormat) {
		this.emailFormat = emailFormat;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	
}
