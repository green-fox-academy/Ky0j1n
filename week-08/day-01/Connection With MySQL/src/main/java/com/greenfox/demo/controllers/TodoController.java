package com.greenfox.demo.controllers;

import com.greenfox.demo.models.Todo;
import com.greenfox.demo.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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
    public String list(Model model, @RequestParam(required = false) Boolean isActive) {
        List<Todo> todoList = (List<Todo>) todoRepository.findAll();
        if (isActive == null) {
            model.addAttribute("todos", todoRepository.findAll());
        } else {

            model.addAttribute("todos",
                    todoList.stream()
                            .filter(t -> t.getDone() != isActive)
                            .collect(Collectors.toList()));
        }
        return "todolist";

    }

    @GetMapping("/add")
   public String getAddPage(){
        return "add";
    }

    @PostMapping("/add")
   public String AddTodo(String title ){
        todoRepository.save(new Todo(title));
        return "redirect:/todo/list";
    }

    @GetMapping("/{id}/delete")
    public String deleteById(@PathVariable Long id){
            todoRepository.deleteById(id);
        return "redirect:/todo/list";
    }

    @GetMapping("/{id}/edit")
    public String getTodoById(Model model,@PathVariable Long id){

       Optional<Todo> todoObject = todoRepository.findById(id);

       if(todoObject.isPresent()) {
           Todo todo = todoObject.get();
           model.addAttribute("todo",todo);
       }else {
           model.addAttribute("error","Unable to locate todo with this id");
       }
        return "edit";
    }

    @PostMapping("/{id}/edit")
    public String editTodoById(@ModelAttribute Todo todo) {

        todoRepository.save(todo);

        return "redirect:/todo/list";
    }



}
