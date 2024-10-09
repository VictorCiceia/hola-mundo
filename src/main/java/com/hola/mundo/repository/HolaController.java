package com.hola.mundo.repository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaController {

    @GetMapping("/hola/{nombre}")
    public String sayHello(@PathVariable String nombre) {
        return "Hola, " + nombre + " Bienvenido!!!";
    }

}
