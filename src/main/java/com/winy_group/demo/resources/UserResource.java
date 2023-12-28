package com.winy_group.demo.resources;

import org.springframework.web.bind.annotation.RestController;

import com.winy_group.demo.entities.User;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/users")
public class UserResource {

    // procurar todos os usuarios

    // GetMapping faz uma procura geral no banco de dados e retorna o valor. Caso
    // não tenha nenhum apelido para o metodo escolhido, seu valor será retornado a
    // partir que o endpoint for chamado
    @GetMapping("all")
    public ResponseEntity<User> findAll() {
        User user = new User(null, "Winyc", "winyc@gmail.com", "99999999", "123");
        return ResponseEntity.ok().body(user);
    }

}
