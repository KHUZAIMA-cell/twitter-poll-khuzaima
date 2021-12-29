package com.twitter.twitterpoll.service;

import java.util.List;

import com.twitter.twitterpoll.entities.Twitterpoll;

public interface pollservice {

	public List<Twitterpoll> getTwitterpoll();
	
	public Twitterpoll getPoll(long pollId);
	
	public Twitterpoll addpoll(Twitterpoll poll);
	
	public void deletepoll(long parseLong);
	
}
