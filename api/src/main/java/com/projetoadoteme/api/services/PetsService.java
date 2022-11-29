package com.projetoadoteme.api.services;


import com.projetoadoteme.api.models.Pets;
import com.projetoadoteme.api.repositories.PetsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PetsService {

    @Autowired
    PetsRepository repository;

    public Pets create(Pets pets) {

        return repository.save(pets);
    }

    public List<Pets> findAll() {
        return repository.findAll();
    }

    public Optional<Pets> findById(Long id) {
        return repository.findById(id);
    }

    public void delete(Long id) {
        repository.deleteById(id);

    }

}
