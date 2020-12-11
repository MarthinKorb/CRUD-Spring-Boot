/*
 * demo
 * CopyRight Rech Informática Ltda. Todos os direitos reservados.
 */
package com.exercicio.rech.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Captura o parâmetro vindo na url e imprime
 */
@RestController
public class HelloWorld {

    @GetMapping("/{name}")
    public String getHelloWorld(@PathVariable String name) {
        return ("Olá, "+ name);
    }

}
