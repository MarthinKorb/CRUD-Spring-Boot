/*
 * demo
 * CopyRight Rech Informática Ltda. Todos os direitos reservados.
 */
package com.exercicio.rech.demo.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Descrição da classe.
 */
@Entity
@Table(name = "person")
public class Person {

    @Id
    @GeneratedValue
    private UUID id;

    @Column
    private String name;

    @Column
    private int idade;

    @Column
    private char sexo;

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getIdade() {
        return idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setId(UUID id) {
        this.id = id;
    }


}
