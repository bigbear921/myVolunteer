package com.mfkj.service.exception;

import com.mfkj.base.BaseException;

/**
 * 登录效验异常(登录时用户名或者密码错误, 登录过期等)
 * @author bigbear
 *
 */
public class LoginValidationException extends BaseException {
	private static final long serialVersionUID = 1L;

	public LoginValidationException() {
		super();
	}

	public LoginValidationException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public LoginValidationException(String message, Throwable cause) {
		super(message, cause);
	}

	public LoginValidationException(String message) {
		super(message);
	}

	public LoginValidationException(Throwable cause) {
		super(cause);
	}
}
