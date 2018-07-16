/**
 * 
 */
package com.capitalone.microservice.pie.emailpreference.database;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.capitalone.microservice.pie.emailpreference.database.model.EmailPreferences;

/**
 * @author samasu5
 *
 */
@Repository
@Component  (value="hibernateImpl")
@Transactional
public class EmailPreferenceHibernateDaoImpl implements EmailPreferenceDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	/*@Autowired
	private Session session;*/
	
	@Override
	public int insertEmailPreference(EmailPreferences emailPrefObj) {
		System.out.println("Account number to be added "+emailPrefObj.getAccountNumber());
		this.getSession().save(emailPrefObj);
//		this.getSession().clear();
//		this.getSession().flush();
		System.out.println("Exiting insert method ....");
		return 0;
	}

	@Override
	public int updateEmailPreference(EmailPreferences emailPrefObj) {
		System.out.println("Account number to be updated "+emailPrefObj.getAccountNumber());
		Query findRecordsQuery = this.getSession().createQuery("select r from EmailPreferences r where account_number like :accNum and email_address = :emailAddrs");
		findRecordsQuery.setParameter("accNum", emailPrefObj.getAccountNumber());
		findRecordsQuery.setParameter("emailAddrs", emailPrefObj.getEmailAddress());
		List<EmailPreferences> findRecordsList = findRecordsQuery.getResultList();
		if (!findRecordsList.isEmpty()) {
			EmailPreferences searchedRecord = findRecordsList.get(0);
			findRecordsQuery = this.getSession().createQuery("update EmailPreferences as e set "
					+ " email_address = :emailAddrs,"
					+ " domestic_Inb = :domesticInb,"
					+ " domestic_Out = :domesticOut,"
					+ " international_Inb = :internationInb,"
					+ " international_Out = :internationalOut,"
					+ " book_Inb = :bookInb,"
					+ " book_Out = :bookOut,"
					+ " email_format = :emailFormat"
					+ " where email_preference_id = :emailPrefId");
			findRecordsQuery.setParameter("emailAddrs", emailPrefObj.getEmailAddress());
			findRecordsQuery.setParameter("domesticInb", emailPrefObj.getDomesticInb());
			findRecordsQuery.setParameter("domesticOut", emailPrefObj.getDomesticOut());
			findRecordsQuery.setParameter("internationInb", emailPrefObj.getInternationalInb());
			findRecordsQuery.setParameter("internationalOut", emailPrefObj.getInternationalOut());
			findRecordsQuery.setParameter("bookInb", emailPrefObj.getBookInd());
			findRecordsQuery.setParameter("bookOut", emailPrefObj.getBookOut());
			findRecordsQuery.setParameter("emailFormat", emailPrefObj.getEmailFormat());
			findRecordsQuery.setParameter("emailPrefId", searchedRecord.getEmailPreferenceId());
			
			findRecordsQuery.executeUpdate();
		}
		
		//this.getSession().clear();
//		this.getSession().flush();
		System.out.println("Exiting update method ....");
		return 0;
	}

	@Override
	public int deleteEmailPreference(EmailPreferences emailPrefObj) {
		System.out.println("Account number to be deleted "+emailPrefObj.getAccountNumber());
		this.getSession().delete(emailPrefObj);
//		this.getSession().clear();
//		this.getSession().flush();
		System.out.println("Exiting delete method ....");
		return 0;
	}
	
	public Session getSession() {
		Session session = sessionFactory.getCurrentSession();
		if (session != null) {
			return session;
		}
		session = sessionFactory.openSession();
        return session;
    }
}
