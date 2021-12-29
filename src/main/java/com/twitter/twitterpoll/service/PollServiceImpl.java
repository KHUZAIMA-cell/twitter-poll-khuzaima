package com.twitter.twitterpoll.service;

import java.util.ArrayList;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.twitter.twitterpoll.entities.Twitterpoll;
@Service
public class PollServiceImpl implements pollservice {

	List<Twitterpoll> list;
	public PollServiceImpl() {
		list = new ArrayList<>();
		list.add(new Twitterpoll(1,"whats your favourite country","Pakistan"));
		list.add(new Twitterpoll(2,"whats your favourite country","India"));
	}
	@Override
	public List<Twitterpoll> getTwitterpoll() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public Twitterpoll getPoll(long pollId) {
		Twitterpoll p =null;
		for (Twitterpoll poll:list) {
			if(poll.getId()==pollId) {
				p = poll;
				break;
			}
		}
		return p;
	}
	@Override
	public Twitterpoll addpoll(Twitterpoll poll) {
		list.add(poll);
		return poll;
	}
	@Override
	public void deletepoll(long parseLong) {
		list=this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
		
	}
	
	

}
