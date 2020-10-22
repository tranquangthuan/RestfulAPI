package com.thuan.springboot.tutorials.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//@Controller need return page orelse TemplateInputException
@RestController
public class PathVariableAndRequestParamController {

	@GetMapping(value = "request-param")
	public void requestParam(@RequestParam(value = "user") String user,
			@RequestParam(value = "age", required = false) String age) {
		System.out.println("User = " + user);
		System.out.println("Age = " + age);
	}

	@GetMapping(value = "/PathVariable/{id}/{name}")
	public void pathVarianle(@PathVariable(value = "id") String idParam, @PathVariable String name) {
		System.out.println("Id = " + idParam);
		System.out.println("Name = " + name);
	}
}
