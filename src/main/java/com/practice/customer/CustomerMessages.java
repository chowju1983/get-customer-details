package com.practice.customer;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="messages.customer")
public class CustomerMessages {
	/**
	 * @return the welcome
	 */
	public String getWelcome() {
		return welcome;
	}

	/**
	 * @param welcome the welcome to set
	 */
	public void setWelcome(String welcome) {
		this.welcome = welcome;
	}

	private String welcome;
}
