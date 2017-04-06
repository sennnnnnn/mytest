package com.hs.dubbo.serviceimpl;

import com.hs.dubbo.service.TestRegistryService;

public class TestRegistryServiceImpl implements TestRegistryService {

	public String hello(String name) {
		
		return   "hello"+name;  
	}

	public String nice(){
		
		return "nice";
	}
}
