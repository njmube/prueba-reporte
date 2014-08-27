package com.csaldivar.pruebas.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.magnabyte.api.sina.mail.service.SinaMailService;

@Service
public class MailServiceImpl implements MailService {

	private static final Logger LOGGER = Logger.getLogger(MailServiceImpl.class);
	
	@Autowired
	private SinaMailService mailService;
	
	public void enviaPincheMail() {
		LOGGER.info("en enviaPincheMail");
		mailService.sendMail("prueba", "asdfjbgjk", "csaldivar@magnabyte.com.mx");
	}

}
