package com.example.dojoNinja.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dojoNinja.models.Ninja;
import com.example.dojoNinja.repositories.NinjaRepository;

@Service
public class NinjaService {
	@Autowired
	NinjaRepository ninjaRepository;

	
	public List<Ninja> allNinjas() {
        return ninjaRepository.findAll();
    }
	public Ninja createNinja(Ninja n) {
        return ninjaRepository.save(n);
    }
	
	public Ninja findNinja(Long id) {
        return ninjaRepository.findById(id).orElse(null);
    }
}
