package com.greenfox.demo.controllers;

import com.greenfox.demo.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//Create a new controller called TodoController which maps to /todo
//with @RequestMapping ("/todo") -> the url wil look like "/todo/" or "/todo/list"
@RequestMapping("/todo")
public class TodoController {

    private TodoRepository todoRepository;

    @Autowired
    public TodoController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }



    @RequestMapping(value = {"/", "/list"}, method = RequestMethod.GET)
//    @ResponseBody
    public String list(Model model) {
        model.addAttribute("todos", todoRepository.findAll());
        return "todolist";
    }
}
