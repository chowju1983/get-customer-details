package com.practice.customer.exception;

import org.springframework.stereotype.Component;

@Component
public class ExceptionVO {


	private String message;
	private String errorCode;
	private String description;
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	public ExceptionVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	/**
	 * @return the errorCode
	 */
	public String getErrorCode() {
		return errorCode;
	}
	/**
	 * @param errorCode the errorCode to set
	 */
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	public ExceptionVO(String message, String errorCode, String description) {
		super();
		this.message = message;
		this.errorCode = errorCode;
		this.description = description;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ExceptionVO [message=" + message + ", errorCode=" + errorCode + ", description=" + description + "]";
	}
	
}
