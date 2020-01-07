package com.mfkj.mapper;

import java.util.Date;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.mfkj.entity.Manage;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ManageMapperTest {
	@Autowired
	ManageMapper manageMapper;
	
	@Test
	@Ignore
	public void addNew() {
		Date now = new Date();
		
		Manage manage = new Manage("admin", "123456", now, 1, "超级管理员", 0, 0, 0);
		Integer result = manageMapper.addNew(manage);
		System.out.println(result);
	}
	
	@Test
	public void findByUAndP(){
		String username = "username";
		String password = "1234561";
		Manage manage = manageMapper.findByUAndP(username, password);
		System.out.println(manage);
	}
	
	@Test
	public void findList() {
		int regionType = 0;
		
		List<Manage> manages = manageMapper.findList(regionType);
		System.out.println(manages);
	}
}
