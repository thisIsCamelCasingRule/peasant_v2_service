package com.example.peasantService.service;

import com.example.peasantService.model.Kingdom;
import org.springframework.data.repository.CrudRepository;

public interface KingdomRepo extends CrudRepository<Kingdom, Integer> {
    Kingdom getKingdomByName(String name);
}
