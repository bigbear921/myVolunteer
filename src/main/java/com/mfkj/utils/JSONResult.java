package com.mfkj.utils;

/**
 * 返回前端映射对象, 
 * status:状态码, 200成功, 400错误, 500异常
 * @author bigbear
 *
 */
public class JSONResult {
	private int status;	//状态码
	private Object data;	//返回数据
	private String msg;		//描述信息
	
	public JSONResult() {
		
	}

	/** 返回成功的构造方法  */
	private JSONResult(Object data) {
		this(200, data, "ok");
	}
	
	/**
	 * 内部创建对象
	 */
	private JSONResult(int stateCode, Object data, String msg) {
		super();
		this.status = stateCode;
		this.data = data;
		this.msg = msg;
	}
	
	/** 处理正常  */
	public static JSONResult ok(Object data) {
		return new JSONResult(data);
	}
	
	/**  处理错误 */
	public static JSONResult errorMsg(String msg) {
		return new JSONResult(400, null, msg);
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String toString() {
		return "MapResult [status=" + status + ", data=" + data + ", msg=" + msg + "]";
	}
	
}
