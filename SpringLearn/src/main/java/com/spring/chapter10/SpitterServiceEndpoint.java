package com.spring.chapter10;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import com.spring.chapter7.Spittle;

@WebService(serviceName="SpitterService")
public class SpitterServiceEndpoint extends SpringBeanAutowiringSupport{

	@Autowired
	SpitterService spitterService;
	
	@WebMethod
	public void addSpittle(Spittle spittle) {
		spitterService.saveSpittle(spittle);
	}
}
