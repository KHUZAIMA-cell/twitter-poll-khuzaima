package com.twitter.twitterpoll.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.twitter.twitterpoll.entities.Twitterpoll;
import com.twitter.twitterpoll.service.pollservice;

@RestController

public class MyController {
	@Autowired
	private pollservice Pollservice;

	//get the poll
	
	@GetMapping("/twitter")
	public List<Twitterpoll> getTwitterpoll()
	{
		return this.Pollservice.getTwitterpoll();
		
		
	}
	
	//get single poll
	
	@GetMapping("/twitter/{pollID}")
	public Twitterpoll getPoll(@PathVariable String pollId) {
		return this.Pollservice.getPoll(Long.parseLong(pollId));
		
	}
	
	@PostMapping("/twitter")
	public Twitterpoll addpoll(@RequestBody Twitterpoll poll) {
		return this.Pollservice.addpoll(poll);
		
	}
	
	public ResponseEntity<HttpStatus> deletepoll(@PathVariable String pollId){
		try {
			this.Pollservice.deletepoll(Long.parseLong(pollId));
			return new ResponseEntity<>(HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
}
