package com.greenfox.fakereddit.service;

import com.greenfox.fakereddit.model.Post;
import com.greenfox.fakereddit.repositrorys.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {
    private PostRepository postRepository;

    @Autowired
    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public List<Post> getAllPostSortedByRating(){
           return  postRepository.allPostByRating();
    }

    public void addNewPost(String title, String content) {
        postRepository.save(new Post(title,content));
    }

    public void upvote(Long id) {
        if(postRepository.findById(id).isPresent()){
            Post post = postRepository.findById(id).get();
            incrementRating(post);
            postRepository.save(post);
        }
    }

    public void downvote(Long id) {
        if(postRepository.findById(id).isPresent()){
            Post post = postRepository.findById(id).get();
            decrementRating(post);
            postRepository.save(post);
        }
    }

   private void incrementRating(Post post) {
        Long rating = post.getRating();
        rating++;
        post.setRating(rating);
    }
    private void decrementRating(Post post) {
        Long rating = post.getRating();
        rating--;
        post.setRating(rating);
    }

}
