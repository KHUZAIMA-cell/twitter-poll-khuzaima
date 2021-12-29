package com.twitter.twitterpoll.entities;

public class Twitterpoll {

	private long id;
	private String description;
	private String title;
	public Twitterpoll(long id, String description, String title) {
		super();
		this.id = id;
		this.description = description;
		this.title = title;
	}
	public Twitterpoll() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public String toString() {
		return "Twitterpoll [id=" + id + ", description=" + description + ", title=" + title + "]";
	}
	
}
