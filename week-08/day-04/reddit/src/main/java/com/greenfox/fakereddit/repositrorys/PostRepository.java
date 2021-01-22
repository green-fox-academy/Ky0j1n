package com.greenfox.fakereddit.repositrorys;

import com.greenfox.fakereddit.model.Post;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface PostRepository extends CrudRepository<Post,Long> {

    @Query( value = "SELECT * FROM post ORDER BY rating DESC LIMIT :pagenumber,10", nativeQuery = true)
    List<Post> allPostByRating(@Param("pagenumber") Integer pageNumber);




}
