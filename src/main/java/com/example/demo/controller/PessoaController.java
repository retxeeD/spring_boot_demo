package com.example.demo.controller;

import com.example.demo.entity.Pessoa;
import com.example.demo.repository.PessoaRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
public class PessoaController {

    PessoaRepository repository;

    @GetMapping("/pessoa")
    public List<Pessoa> getAll(){
        return repository.findAll();
    }

    @GetMapping("/pessoa/{id}")
    public Optional<Pessoa> getAll(@PathVariable Long id){
        return repository.findById(id);
    }

    @PostMapping("/pessoa")
    public Pessoa register(@RequestBody Pessoa pessoa){
        return repository.save(pessoa);
    }

    @DeleteMapping("/pessoa/{id}")
    public void delete(@PathVariable Long id){
        repository.deleteById(id);
    }
}
