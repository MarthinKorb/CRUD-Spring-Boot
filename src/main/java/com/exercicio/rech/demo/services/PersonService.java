/*
 * demo
 * CopyRight Rech Informática Ltda. Todos os direitos reservados.
 */
package com.exercicio.rech.demo.services;

import com.exercicio.rech.demo.dao.DaoPerson;
import com.exercicio.rech.demo.models.Person;
import com.exercicio.rech.demo.dao.PersonDao;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * Descrição da classe.
 */
@Service
public class PersonService {

    @Autowired
    private DaoPerson daoPerson;
//    private PersonDao personDao;

//    @Autowired
//    public PersonService(@Qualifier("fakeDao") PersonDao personDao) {
//        this.personDao = personDao;
//    }
    public void addPerson(Person person) {
//        return personDao.insertPerson(person);
        daoPerson.save(person);
    }

    public List<Person> getAllPeople() {
//        return personDao.selectAllPeople();
        return (List<Person>) daoPerson.findAll();
    }

    public Optional<Person> getPersonById(UUID id) {
//        return personDao.selectPersonById(id);
        return daoPerson.findById(id);
    }

    public void updatePerson(UUID id, Person newPerson){
//        return personDao.updatePersonById(id, newPerson);
        newPerson.setId(id);
        daoPerson.save( newPerson);
    }

    public void deletePerson(UUID id){
//        return personDao.deletePersonById(id);
        daoPerson.deleteById(id);
    }
}
