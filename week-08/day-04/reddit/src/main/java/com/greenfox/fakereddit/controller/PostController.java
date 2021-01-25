package com.greenfox.fakereddit.controller;

import com.greenfox.fakereddit.model.Post;
import com.greenfox.fakereddit.service.PostService;
import com.greenfox.fakereddit.service.UserService;
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
    private UserService userService;

    @Autowired
    public PostController(PostService postService, UserService userService) {

        this.postService = postService;
        this.userService = userService;
    }


    @GetMapping("/")
    public String loadMainPage(Model model, @RequestParam(required = false) Integer page) {
        if (page == null) {
            page = 1;
        }
        model.addAttribute("postList", postService.getAllPostSortedByRating(page));
        model.addAttribute("pagesList", postService.getPagesNumbers());
        return "index";
    }


    @GetMapping("/submit")
    public String getSubmitPage() {
        return "submit";
    }

    @PostMapping("/submit")
    public String addNewPost(String title, String content) {
        postService.addNewPost(title, content);
        return "redirect:/fake-reddit/";
    }

    @GetMapping("/change-rating/{id}/+")
    public String ratingIncreaseBy1(@PathVariable Long id) {
        postService.upvote(id);
        return "redirect:/fake-reddit/";
    }

    @GetMapping("/change-rating/{id}/-")
    public String ratingDecrement(@PathVariable Long id) {
        postService.downvote(id);
        return "redirect:/fake-reddit/";
    }



    @GetMapping("/register")
    public String getRegPage() {
        return "register";
    }

    @PostMapping("/register")
    public String sendRegisterForm(@RequestParam String username, String password) {
        userService.addNewUser(username,password);
        return "redirect:/fake-reddit/";
    }

    @GetMapping("/login")
    public String getLogingPage(){
        return "login";
    }
    @PostMapping("/login")
    public String getLogin(@RequestParam String username, String password){

        return "login";
    }

}







