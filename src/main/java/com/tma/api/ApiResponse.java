package com.tma.api;

import java.io.Serializable;
import java.util.HashMap;

public class ApiResponse<T> implements Serializable{
	
	private T resource;
	
	private int status;

	private String message;
	
	public ApiResponse() {
		this.status = ResponseCode.EXCEPTION_OCCURRED;
		this.message = ResponseMessage.EXC_MSG;
	}
	
	public ApiResponse(T resource) {
		this.resource = resource;
		if (resource == null) {
			status = ResponseCode.BAD_REQUEST;
			message = ResponseMessage.NULL_OBJECT;
		} else if (resource instanceof HashMap) {
			@SuppressWarnings("unchecked")
			HashMap<String, Object> map = (HashMap<String, Object>) resource;
			if (map.get("error") != null) {
				status = ResponseCode.BAD_REQUEST;
				message = map.get("error").toString();
			} else {
				status = ResponseCode.SUCCESS;
				message = ResponseMessage.SUCCESS_MSG;
			}
		} else {
			status = ResponseCode.SUCCESS;
			message = ResponseMessage.SUCCESS_MSG;
		}
	}
	
	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getResource() {
		return resource;
	}

	public void setResource(T resource) {
		this.resource = resource;
	}
}
