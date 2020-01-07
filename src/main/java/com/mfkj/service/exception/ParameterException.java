package com.mfkj.service.exception;

import com.mfkj.base.BaseException;

/**
 * 自定义参数异常
 * @author bigbear
 *
 */
public class ParameterException extends BaseException{
	private static final long serialVersionUID = 1L;

	public ParameterException() {
		super();
	}

	public ParameterException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public ParameterException(String message, Throwable cause) {
		super(message, cause);
	}

	public ParameterException(String message) {
		super(message);
	}

	public ParameterException(Throwable cause) {
		super(cause);
	}
	
	
}
