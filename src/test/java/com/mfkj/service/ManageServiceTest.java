package com.mfkj.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.mfkj.entity.Manage;
import com.mfkj.service.exception.InsertException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ManageServiceTest {
	@Autowired
	ManageService manageService;
	
	@Test
	public void create() {
		Manage manage = new Manage();
		manage.setUsername("bigbear");
		manage.setPassword("123456");
		manage.setState(1);
		manage.setRegionId(0);
		manage.setRegionType(0);
		manage.setCreateId(0);
		
		try {
			boolean ok = manageService.create(manage);
			System.out.println("创建成功" + ok);
		} catch (InsertException e) {
			System.out.println("创建失败");
		}
	}
}
