package com.nissan.automobile.system.response;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@Component
@JsonInclude(JsonInclude.Include. NON_NULL)
public class CommonResponse {
	@JsonProperty("message")
	private String message;

	public CommonResponse(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public CommonResponse() {
		super();
	}
	
	
}
