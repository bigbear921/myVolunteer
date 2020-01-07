package com.mfkj.service;

import java.util.List;

import com.mfkj.entity.Manage;
import com.mfkj.service.exception.InsertException;
import com.mfkj.service.exception.LoginValidationException;
import com.mfkj.service.exception.ParameterException;
import com.mfkj.utils.PageRequest;
import com.mfkj.utils.PageResult;

/**
 * 管理员业务层接口
 * @author bigbear
 *
 */
public interface ManageService {
	/**
	 * 创建管理员
	 * @throws InsertException	数据库插入数据失败异常, 网络异常等
	 * @return true:创建成功
	 */
	boolean create(Manage manage) throws InsertException;
	
	/**
	 * 根据用户名和密码查询管理员
	 * @throws LoginValidationException 用户名或者密码错误时抛出此异常
	 */
	Manage findByUAndP(String username, String password) throws LoginValidationException;
	
	/**
	 * 获取当前用户所在地区类型以下的管理员列表(省级管理员获取市, 区/县, 乡/镇, 村/街道的管理员列表)
	 * @param regionType 当前所在地区的类型
	 * @throws ParameterException	管理员类型错误时, 抛出此异常
	 * @return	管理员分页列表
	 */
	PageResult getList(Integer regionType, PageRequest pageRequest) throws ParameterException;
}
