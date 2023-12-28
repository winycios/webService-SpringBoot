package com.winy_group.demo.resources;

import org.springframework.web.bind.annotation.RestController;

import com.winy_group.demo.entities.User;
import com.winy_group.demo.services.UserServices;

import jakarta.annotation.Resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/users")

@Resource
public class UserResource {

    // GetMapping faz uma procura geral no banco de dados e retorna o valor. Caso
    // não tenha nenhum apelido para o metodo escolhido, seu valor será retornado a
    // partir que o endpoint for chamado

    @Autowired
    private UserServices services;

    // listar todos os usuarios
    @GetMapping("all")
    public ResponseEntity<List<User>> findAll() {
        List<User> result = services.findAll();
        return ResponseEntity.ok().body(result);
    }

     // procurar um usuario
    @GetMapping(value = "byId/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id) {
        User result = services.findbyId(id);
        return ResponseEntity.ok().body(result);
    }
}
