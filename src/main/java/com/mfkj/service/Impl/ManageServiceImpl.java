													package com.mfkj.service.Impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mfkj.entity.Manage;
import com.mfkj.mapper.ManageMapper;
import com.mfkj.service.ManageService;
import com.mfkj.service.exception.InsertException;
import com.mfkj.service.exception.LoginValidationException;
import com.mfkj.service.exception.ParameterException;
import com.mfkj.utils.PageRequest;
import com.mfkj.utils.PageResult;
import com.mfkj.utils.PageUtil;

/**
 * 管理员业务层实现类
 * @author bigbear
 *
 */
@Service
public class ManageServiceImpl implements ManageService {
	@Autowired
	private ManageMapper mapper;
	
	public boolean create(Manage manage) {
		//String username = manage.getUsername();
		// TODO 待查询username是否已存在
		
		manage.setCreateTime(new Date());
		manage.setState(1);
		//TODO 设置所在地区
		manage.setRegionId(0);
		//TODO 设置地区类型
		manage.setRegionType(0);
		//TODO 设置创建者id
		manage.setCreateId(1);
		
		Integer row = mapper.addNew(manage);
		if(row != 1) {
			throw new InsertException("创建失败, 请重试");
		}
		return true;
	}

	
	
	public Manage findByUAndP(String username, String password){
		Manage manage = mapper.findByUAndP(username, password);
		if(manage == null) {
			throw new LoginValidationException("用户名或者密码错误");
		}
		return manage;
	}
	
	public PageResult getList(Integer regionType, PageRequest pageRequest) {
		if(regionType == null || regionType < 0 || regionType > 5) {
			throw new ParameterException("当前登录管理员类型异常, 请重试");
		}
		PageHelper.startPage(pageRequest.getStart(), pageRequest.getLength());
		
		List<Manage> list = mapper.findList(regionType);
		PageInfo<Manage> pageInfo = new PageInfo<Manage>(list);
		PageResult pageResult = PageUtil.getPageResult(pageInfo);
		
		return pageResult;
	}
}
