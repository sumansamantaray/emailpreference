package com.capitalone.microservice.pie.emailpreference;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.context.ApplicationContext;

import com.capitalone.microservice.pie.emailpreference.processor.EmailPreferenceProcessor;

@SpringBootApplication (exclude = {JpaRepositoriesAutoConfiguration.class})
public class PieCloudEmailpreferenceApplication {

	public static void main(String[] args) {
//		SpringApplication.run(PieCloudEmailpreferenceApplication.class, args);
		
		ApplicationContext context = SpringApplication.run(PieCloudEmailpreferenceApplication.class, args);
		EmailPreferenceProcessor emailPrefProcessor = context.getBean(EmailPreferenceProcessor.class);
		emailPrefProcessor.processEmailPreference();
	}
}
