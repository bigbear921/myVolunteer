package com.mfkj.service.exception;

import com.mfkj.base.BaseException;

/**
 * 数据库插入数据异常
 * @author bigbear
 *
 */
public class InsertException extends BaseException {
	private static final long serialVersionUID = 1L;

	public InsertException() {
		super();
	}

	public InsertException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public InsertException(String message, Throwable cause) {
		super(message, cause);
	}

	public InsertException(String message) {
		super(message);
	}

	public InsertException(Throwable cause) {
		super(cause);
	}
}
