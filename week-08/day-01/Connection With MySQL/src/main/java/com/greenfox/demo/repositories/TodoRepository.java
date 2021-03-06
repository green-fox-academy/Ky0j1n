package com.greenfox.demo.repositories;

import com.greenfox.demo.models.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TodoRepository  extends CrudRepository<Todo, Long> {

}
