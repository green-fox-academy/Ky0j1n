package com.greenfox.fakereddit.controller;

import com.greenfox.fakereddit.model.Post;
import com.greenfox.fakereddit.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RequestMapping("/fake-reddit")
@Controller
public class PostController {
   private PostService postService;

    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/")
    public String loadMainPage(Model model,@RequestParam (required = false) Integer page) {
        if(page == null) {
            page = 1;
        }
        model.addAttribute("postList", postService.getAllPostSortedByRating(page));
        model.addAttribute("pagesList",postService.getPagesNumbers());
        return "index";
    }










    @GetMapping("/submit")
    public String getSubmitPage() {
        return "submit";
    }

    @PostMapping("/submit")
    public String addNewPost(String title, String content) {
        postService.addNewPost(title,content);
        return "redirect:/fake-reddit/";
    }

    @GetMapping("/change-rating/{id}/+")
    public String ratingIncreaseBy1(@PathVariable Long id){
        postService.upvote(id);
        return "redirect:/fake-reddit/";
    }

    @GetMapping("/change-rating/{id}/-")
    public String ratingDecrement(@PathVariable Long id){
        postService.downvote(id);
        return "redirect:/fake-reddit/";
    }






}
