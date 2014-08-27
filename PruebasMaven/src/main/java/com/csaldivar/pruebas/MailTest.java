package com.csaldivar.pruebas;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.csaldivar.pruebas.service.MailService;
import com.magnabyte.api.sina.mail.config.SinaMailConfig;
import com.magnabyte.api.sina.mail.service.SinaMailService;


public class MailTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		
		MailService mailService = context.getBean(MailService.class);
		
		mailService.enviaPincheMail();
	}
}
