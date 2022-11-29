package com.projetoadoteme.api.controllers;


import com.projetoadoteme.api.models.Cliente;
import com.projetoadoteme.api.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    ClienteService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Cliente> create(@RequestBody Cliente cliente) {
        Cliente clienteCreated = service.create(cliente);

        return ResponseEntity.status(201).body(clienteCreated);
    }


    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    public List<Cliente> findAll() {
        return service.findAll();
    }

    @GetMapping("/clienteById/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<Cliente> findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @DeleteMapping("/clientedelete/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

}
