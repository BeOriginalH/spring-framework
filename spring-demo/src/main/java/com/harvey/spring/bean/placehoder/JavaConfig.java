package com.harvey.spring.bean.placehoder;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * @author harvey
 * @version 1.0.0
 * @date 2021-01-13
 */
@Configuration
@ComponentScan(basePackages = "com.harvey.spring")
@PropertySource(value = {"classpath:/placeholder/db.properties"})
public class JavaConfig {

	@Bean
	public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}
}
