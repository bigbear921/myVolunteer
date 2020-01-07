package com.mfkj.utils;

import java.util.List;

import com.alibaba.fastjson.JSONObject;

/**
 * 返回分页数据
 * @author bigbear
 *
 */
public class PageResult {
	private int pageNum;	//当前页数
	private int pageSize;	//每页数量
	private long totleSize;	//总数量
	private int totlePages;	//总页数
	private List<?> data;
	
	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public long getTotleSize() {
		return totleSize;
	}

	public void setTotleSize(long totleSize) {
		this.totleSize = totleSize;
	}

	public int getTotlePages() {
		return totlePages;
	}

	public void setTotlePages(int totlePages) {
		this.totlePages = totlePages;
	}

	public List<?> getData() {
		return data;
	}

	public void setData(List<?> data) {
		this.data = data;
	}

	public String toString() {
		return JSONObject.toJSONString(this);
	}
	
}
