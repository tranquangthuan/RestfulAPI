package com.thuan.springboot.tutorials.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.thuan.springboot.tutorials.model.Product;

@RestController
public class ProductController {

	private static Map<String, Product> productRepo = new HashMap<>();
	static {
		Product honey = new Product();
		honey.setId("1");
		honey.setFirstName("Honey");
		honey.setLastName("Tran");
		honey.setSalary("100000");
		honey.setGender("Male");
		productRepo.put(honey.getId(), honey);

		Product almond = new Product();
		almond.setId("2");
		almond.setFirstName("Almond");
		almond.setLastName("David");
		almond.setSalary("10001");
		almond.setGender("Male");
		productRepo.put(almond.getId(), almond);

		Product jonh = new Product();
		jonh.setId("3");
		jonh.setFirstName("Jonh");
		jonh.setLastName("Lee");
		jonh.setSalary("15000");
		jonh.setGender("Female");
		productRepo.put(jonh.getId(), jonh);

		Product David = new Product();
		David.setId("4");
		David.setFirstName("David");
		David.setLastName("Nguyen");
		David.setSalary("100000");
		David.setGender("Male");
		productRepo.put(David.getId(), David);
	}

	@RequestMapping(value = "/products", headers = "Accept=application/json", method = RequestMethod.GET)
	@CrossOrigin(origins = "*")
	public ResponseEntity<Object> getProducts() {
		return new ResponseEntity<>(productRepo, HttpStatus.OK);
	}

}
