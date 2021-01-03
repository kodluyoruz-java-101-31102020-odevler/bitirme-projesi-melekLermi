package com.integration.app.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;

@Configurable
@ComponentScan(basePackages = {
		"com.integration.app.dao.impl",
		"com.integration.app.service.impl"
})
public class AppConfig {

}
