package com.mfkj.utils;

import com.alibaba.fastjson.JSONObject;

/**
 * 请求分页数据
 * @author bigbear
 *
 */
public class PageRequest {
	private int start;	//当前页数
	private int length;	//每页条数
	
	public int getStart() {
		return start;
	}
	
	public void setStart(int start) {
		this.start = start;
	}
	
	public int getLength() {
		return length;
	}
	
	public void setLength(int length) {
		this.length = length;
	}

	public String toString() {
		return JSONObject.toJSONString(this);
	}
	
}
