package com.example.dojoNinja.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.dojoNinja.models.Ninja;

@Repository
public interface NinjaRepository extends CrudRepository<Ninja,Long>{

    List<Ninja> findAll();

}
