package com.slashCode.springboot.testController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
//@Controller
public class TestController {

	@RequestMapping("/hi")
	public String test() {
		System.out.println("controlller is hitted ");
		return "hello";
	}

	@GetMapping("/go")
	public String test3() {
		System.out.println("controlller is hitted jsp go is hitted  ");
		return "home";
	}

	@RequestMapping("/hii")
	public String test2() {
		System.out.println("controlller is hitted jsp ");
		return "home";
	}

}
