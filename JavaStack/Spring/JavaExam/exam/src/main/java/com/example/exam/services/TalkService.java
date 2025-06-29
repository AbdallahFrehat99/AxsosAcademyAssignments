package com.example.exam.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.exam.models.Talk;
import com.example.exam.models.User;
import com.example.exam.repositories.TalkRepository;

@Service
public class TalkService {

	
	@Autowired
	TalkRepository talkRepository;
	
	public List<Talk> allTalks() {
        return talkRepository.findAll();
    }
	public Talk createTalk(Talk t) {
        return talkRepository.save(t);
    }
	
	public Talk findTalk(Long id) {
        return talkRepository.findById(id).orElse(null);
    }
	public List<Talk> findAllByUser(User user){
		return talkRepository.findAllByUser(user);
	}
	
	public void deleteTalk(Long id) {
		talkRepository.deleteById(id);
	}
	
	public Talk updateTalk(Talk t) {
		return talkRepository.save(t);
	}
}
