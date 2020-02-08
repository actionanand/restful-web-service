package com.actionanand.todo.restfulwebservice.todo;

import java.util.Date;

public class Todo {

	private int id;
	private String username;
	private String description;
	private boolean isCompleted;
	private Date targetDate;

	public Todo(int id, String username, String description, boolean isCompleted, Date targetDate) {
		super();
		this.id = id;
		this.username = username;
		this.description = description;
		this.isCompleted = isCompleted;
		this.targetDate = targetDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isCompleted() {
		return isCompleted;
	}

	public void setCompleted(boolean isCompleted) {
		this.isCompleted = isCompleted;
	}

	public Date getTargetDate() {
		return targetDate;
	}

	public void setTargetDate(Date targetDate) {
		this.targetDate = targetDate;
	}

}