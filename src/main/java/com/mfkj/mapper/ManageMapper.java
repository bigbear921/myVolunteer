package com.mfkj.mapper;

import java.util.List;

import com.mfkj.entity.Manage;

/**
 * 管理员mapper
 * @author bigbear
 *
 */
public interface ManageMapper {
	/** 创建管理员  */
	Integer addNew(Manage manage);
	
	/** 根据用户名和密码查询管理员 */
	Manage findByUAndP(String username, String password);
	
	/** 查询管理员列表  */
	List<Manage> findList(Integer regionType);
}
