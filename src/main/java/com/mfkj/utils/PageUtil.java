package com.mfkj.utils;

import org.springframework.ui.ModelMap;

import com.github.pagehelper.PageInfo;

/**
 * 页面封装工具类
 * @author bigbear
 *
 */
public class PageUtil {
	/**
	 * 数据库分页查询数据封装存入PageResult返回
	 * @see PageResult
	 * @param pageInfo	数据库分页查询返回的数据
	 * @return 封装的数据
	 */
	public static PageResult getPageResult(PageInfo<?> pageInfo) {
		PageResult result = new PageResult();
		result.setPageNum(pageInfo.getPageNum());
		result.setPageSize(pageInfo.getPageSize());
		result.setTotleSize(pageInfo.getTotal());
		result.setTotlePages(pageInfo.getPages());
		result.setData(pageInfo.getList());
		return result;
	}
	
	/**
	 * 数据库分页查询数据封装存入resultMap返回, 配合thymeleaf使用
	 * @param resultMap	返回的模板对象
	 * @param pageInfo	需要返回的数据
	 * @param dataName	返回前端数据列表的名字
	 */
	public static void getModelMap(ModelMap resultMap, PageResult pageResult, String dataName) {
		resultMap.addAttribute("pageNum", pageResult.getPageNum());
		resultMap.addAttribute("pageSize", pageResult.getPageSize());
		resultMap.addAttribute("totleSize", pageResult.getTotleSize());
		resultMap.addAttribute("totlePages", pageResult.getTotlePages());
		resultMap.addAttribute(dataName, pageResult.getData());
	}
}
