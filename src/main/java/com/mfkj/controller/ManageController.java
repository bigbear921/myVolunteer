package com.mfkj.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mfkj.entity.Manage;
import com.mfkj.service.ManageService;
import com.mfkj.utils.JSONResult;
import com.mfkj.utils.PageRequest;
import com.mfkj.utils.PageResult;
import com.mfkj.utils.PageUtil;

@Controller
@RequestMapping("manage")
public class ManageController {
	@Autowired
	private ManageService manageService;
	
	/** 登录  */
	@RequestMapping("/login")
	@ResponseBody
	public Object login(String username, String password, HttpSession session) {
		Manage manage = manageService.findByUAndP(username, password);
		session.setAttribute("manage", manage);
		return JSONResult.ok(null);
	}
	
	/** 创建管理员  */
	@RequestMapping("/create")
	@ResponseBody
	public Object create(Manage manage) {
		manageService.create(manage);
		
		return JSONResult.ok(null);
	}

	/** 获取当前用户所在地区类型以下的管理员列表(省级管理员获取市, 区/县, 乡/镇, 村/街道的管理员列表)  */
	@RequestMapping("/list")
	public Object list(HttpSession session, PageRequest pageRequest, ModelMap map) {
		Manage manage = (Manage)session.getAttribute("manage");
		
		PageResult result = manageService.getList(manage.getRegionType(), pageRequest);
		
		PageUtil.getModelMap(map, result, "manages");
//		return JSONResult.ok(result);
		return "manage/list";
	}
}
