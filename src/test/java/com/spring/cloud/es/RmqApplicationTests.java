package com.spring.cloud.es;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.spring.cloud.es.component.Sender;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=RmqApplication.class)
public class RmqApplicationTests {
	@Autowired
	private Sender sender;
	
	@Test
	public void test(){
		sender.send();
	}
}
