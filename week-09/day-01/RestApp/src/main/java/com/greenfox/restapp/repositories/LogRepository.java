package com.greenfox.restapp.repositories;

import com.greenfox.restapp.model.Log;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogRepository extends CrudRepository <Log, Long> {

//    @Query( value = "SELECT * FROM log where  nativeQuery = true)
}
