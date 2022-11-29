package com.projetoadoteme.api.controllers;


import com.projetoadoteme.api.models.Pets;
import com.projetoadoteme.api.services.PetsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/adoteme")
public class PetsController {

    @Autowired
    PetsService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Pets> create(@RequestBody Pets pets) {
        Pets petsCreated = service.create(pets);

        return ResponseEntity.status(201).body(petsCreated);
    }

    @GetMapping("/pets")
    @ResponseStatus(HttpStatus.OK)
    public List<Pets> findAll() {
        return service.findAll();
    }

    @GetMapping("/petsById/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<Pets> findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @DeleteMapping("/petsdelete/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
