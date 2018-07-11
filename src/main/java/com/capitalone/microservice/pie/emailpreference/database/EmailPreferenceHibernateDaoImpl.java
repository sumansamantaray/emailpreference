/**
 * 
 */
package com.capitalone.microservice.pie.emailpreference.database;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.capitalone.microservice.pie.emailpreference.database.model.EmailPreferences;

/**
 * @author Suman
 *
 */
@Repository
@Component (value = "hibernateImpl")
@Transactional
public class EmailPreferenceHibernateDaoImpl implements EmailPreferenceDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	private Session session;
	
	private Session getSession() {
		if (session != null) {
			return session;
		}
		return sessionFactory.getCurrentSession();
	}

	/* (non-Javadoc)
	 * @see com.capitalone.microservice.pie.emailpreference.database.EmailPreferenceDao#insertEmailPreference(com.capitalone.microservice.pie.emailpreference.database.model.EmailPreferences)
	 */
	@Override
	public int insertEmailPreference(EmailPreferences emailPrefObj) {
		this.getSession().save(emailPrefObj);
		this.getSession().flush();
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.capitalone.microservice.pie.emailpreference.database.EmailPreferenceDao#updateEmailPreference(com.capitalone.microservice.pie.emailpreference.database.model.EmailPreferences)
	 */
	@Override
	public int updateEmailPreference(EmailPreferences emailPrefObj) {
		this.getSession().update(emailPrefObj);
		this.getSession().flush();
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.capitalone.microservice.pie.emailpreference.database.EmailPreferenceDao#deleteEmailPreference(com.capitalone.microservice.pie.emailpreference.database.model.EmailPreferences)
	 */
	@Override
	public int deleteEmailPreference(EmailPreferences emailPrefObj) {
		this.getSession().delete(emailPrefObj);
		this.getSession().flush();
		return 0;
	}

}
