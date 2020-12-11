/*
 * demo
 * CopyRight Rech Informática Ltda. Todos os direitos reservados.
 */
package com.exercicio.rech.demo.dao;

import com.exercicio.rech.demo.models.Person;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

/**
 *
 * @author Marthin
 */
public interface PersonDao {

    int insertPerson(UUID id, Person person);

    default int insertPerson(Person person) {
        UUID id = UUID.randomUUID();

        return insertPerson(id, person);
    }

    List<Person> selectAllPeople();

    Optional<Person> selectPersonById(UUID id);

    int updatePersonById(UUID id, Person person);

    int deletePersonById(UUID id);

}
