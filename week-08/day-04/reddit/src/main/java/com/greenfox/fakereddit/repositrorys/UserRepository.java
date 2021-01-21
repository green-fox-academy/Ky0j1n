package com.greenfox.fakereddit.repositrorys;


import com.greenfox.fakereddit.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User,Long> {
}
