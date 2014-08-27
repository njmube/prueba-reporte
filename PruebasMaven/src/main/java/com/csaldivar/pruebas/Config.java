package com.csaldivar.pruebas;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.magnabyte.api.sina.mail.config.SinaMailConfig;


@Configuration
@ComponentScan("com.csaldivar.pruebas")
@Import(SinaMailConfig.class)
public class Config {

}
