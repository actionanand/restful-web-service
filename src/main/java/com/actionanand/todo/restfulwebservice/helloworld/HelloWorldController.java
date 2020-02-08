package com.actionanand.todo.restfulwebservice.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

//controller
@RestController
public class HelloWorldController {
	
//	@RequestMapping(method=RequestMethod.GET, path="hello-world")
	@GetMapping(path="/hello-world")
	public String helloWorld() {
		return "Hello World";
	}
	
	@GetMapping(path="/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello World");
	}
	
	@GetMapping(path="/hello-world/{id}")
	public HelloWorldBean helloWorldPathVar(@PathVariable String id) {
		return new HelloWorldBean(String.format("Hello World, %s", id));
	}
	
}
