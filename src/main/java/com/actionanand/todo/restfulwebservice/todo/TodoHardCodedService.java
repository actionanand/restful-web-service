package com.actionanand.todo.restfulwebservice.todo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoHardCodedService {
	private static List<Todo> todos = new ArrayList<Todo>(); 
	private static int idCounter = 0;
	
	static {
		todos.add(new Todo(++idCounter, "Anand", "Java REST api is created", true, new Date()));
		todos.add(new Todo(++idCounter, "Anand", "Angular 9 is out", true, new Date()));
		todos.add(new Todo(++idCounter, "Anand", "Spring boot is completed", false, new Date()));
		todos.add(new Todo(++idCounter, "Anand", "Cleaning the room", false, new Date()));
		todos.add(new Todo(++idCounter, "Anand", "Open source JDK is installed", true, new Date()));
	}
	
	
	public List<Todo> findAll() {
		return todos;
	}
}
