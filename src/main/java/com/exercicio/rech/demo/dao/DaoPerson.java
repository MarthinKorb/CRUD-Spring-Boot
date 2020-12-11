/*
 * demo
 * CopyRight Rech Informática Ltda. Todos os direitos reservados.
 */
package com.exercicio.rech.demo.dao;

import com.exercicio.rech.demo.models.Person;
import java.util.UUID;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Marthin
 */
@Repository
public interface DaoPerson extends CrudRepository<Person, UUID>{

//    int updatePersonById(UUID id, Person person);

}
