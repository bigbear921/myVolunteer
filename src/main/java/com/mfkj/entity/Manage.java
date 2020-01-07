package com.mfkj.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 管理员实体类
 * @author bigbear
 *
 */
public class Manage {
	private Integer manageId;
	private String username;		//用户名
	private String password;		//密码
	@JsonFormat(pattern="yyyy-MM-dd hh:mm:ss a", locale="zh", timezone="GMT+8")
	private Date createTime;		//创建时间
	private Integer state;			//状态
	private String remarks;			//备注
	private Integer regionId;		//地区id
	private Integer regionType;	//所属地区类型
	private Integer createId;		//创建当前管理员的id
	
	public Manage() {
	}

	public Manage(String username, String password, Date createTime, Integer state, 
			String remarks, Integer regionId, Integer regionType, Integer createId) {
		this.username = username;
		this.password = password;
		this.createTime = createTime;
		this.state = state;
		this.remarks = remarks;
		this.regionId = regionId;
		this.regionType = regionType;
		this.createId = createId;
	}

	public Integer getManageId() {
		return manageId;
	}

	public void setManageId(Integer manageId) {
		this.manageId = manageId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Integer getRegionId() {
		return regionId;
	}

	public void setRegionId(Integer regionId) {
		this.regionId = regionId;
	}

	public Integer getRegionType() {
		return regionType;
	}

	public void setRegionType(Integer regionType) {
		this.regionType = regionType;
	}

	public Integer getCreateId() {
		return createId;
	}

	public void setCreateId(Integer createId) {
		this.createId = createId;
	}

	public String toString() {
		return JSONObject.toJSONString(this);
	}
	
}
