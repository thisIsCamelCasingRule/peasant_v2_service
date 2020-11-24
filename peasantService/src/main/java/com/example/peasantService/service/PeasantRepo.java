package com.example.peasantService.service;

import com.example.peasantService.model.Peasant;
import org.springframework.data.repository.CrudRepository;

public interface PeasantRepo extends CrudRepository<Peasant, Integer> {
    Peasant getPeasantByName(String name);
}
