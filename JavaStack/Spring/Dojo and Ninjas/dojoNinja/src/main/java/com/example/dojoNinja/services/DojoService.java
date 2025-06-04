package com.example.dojoNinja.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dojoNinja.models.Dojo;
import com.example.dojoNinja.repositories.DojoRepository;

@Service
public class DojoService {

	@Autowired
	DojoRepository dojoRepository;

	
	public List<Dojo> allDojos() {
        return dojoRepository.findAll();
    }
	public Dojo createDojo(Dojo d) {
        return dojoRepository.save(d);
    }
	
	public Dojo findDojo(Long id) {
        return dojoRepository.findById(id).orElse(null);
    }
}
