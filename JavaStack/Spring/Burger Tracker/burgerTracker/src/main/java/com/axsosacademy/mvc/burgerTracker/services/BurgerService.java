package com.axsosacademy.mvc.burgerTracker.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axsosacademy.mvc.burgerTracker.models.Burger;
import com.axsosacademy.mvc.burgerTracker.repositories.BurgerRepository;

@Service
public class BurgerService {
	@Autowired
	BurgerRepository burgerRepository;

	
	public List<Burger> allBurgers() {
        return burgerRepository.findAll();
    }
	public Burger createBurger(Burger b) {
        return burgerRepository.save(b);
    }
}
