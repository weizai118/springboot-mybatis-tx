package com.gf;

import com.gf.service.IAccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SpringbootMybatisTxApplicationTests {

	@Autowired
	private IAccountService accountService;

	@Test
	public void test1(){
		accountService.transfer();
	}

	@Test
	public void contextLoads() {
	}

}
