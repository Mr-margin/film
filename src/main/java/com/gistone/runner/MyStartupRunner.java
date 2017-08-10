package com.gistone.runner;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.gistone.MyBatis.config.GetBySqlMapper;

/**
 * 服务启动执行
 *
 * @author   
 * @myblog  
 * @create   
 */
@Component
@Order(value=1)
public class MyStartupRunner implements CommandLineRunner{
	
	@Autowired
	private GetBySqlMapper getBySqlMapper;
	

	
	@Override
    public void run(String... args) throws Exception {}
	
}
