package com.dbbyte.wildfly.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

	@RequestMapping(value = { "/", "" })
	public String hello() {

		return "Hello from WildFly  JavaEEContainer!";

	}

}