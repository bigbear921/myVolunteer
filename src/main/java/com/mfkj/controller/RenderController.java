package com.mfkj.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mfkj.entity.Manage;

@Controller
@RequestMapping("render")
public class RenderController {
	
	@RequestMapping("/renderLogin")
	public String renderLogin() {
		return "/login";
	}
	
	@RequestMapping("/manage/add")
	public String renderCreateManage() {
		return "/manage/add";
	}
	
//	@RequestMapping("/manage/list")
//	public String renderManageList(ModelMap map) {
//		return "manage/list";
//	}
}
