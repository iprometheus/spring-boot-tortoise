package com.fangxing.pcgame.dao;


import com.fangxing.pcgame.entity.Person;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.persistence.Table;
import java.util.Optional;

@Repository
@Table(name="user")
@Qualifier("personRepository")
public interface PersonRepository extends CrudRepository<Person, Long > {

    @Override
    Optional<Person> findById(Long aLong);

    @Override
    <S extends Person> S save(S s);

    // public OptionalPerson findById(Long id);
//
//    public Person save(Person u);
//
//    @Query("select t from Person t where t.userName=:name")
//    public Person findUserByName(@Param("name") String name);
}