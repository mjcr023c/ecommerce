package com.between.ecommerce.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api")
public class RestController {

	@GetMapping("/checkrest")
	public ResponseEntity<String> checkRest() {
		return new ResponseEntity<String>("Ok!", HttpStatus.OK);
	}

}
