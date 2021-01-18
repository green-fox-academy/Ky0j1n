package com.greenfox.demo;

import com.greenfox.demo.models.Todo;
import com.greenfox.demo.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    TodoRepository todoRepository;

    @Autowired
    public DemoApplication(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        todoRepository.save(new Todo("daily task"));
        todoRepository.save(new Todo("make the beds", true, true));
        todoRepository.save(new Todo("do the washing up",true,false));
        todoRepository.save(new Todo("clean the bathroom and the kitchen", true, true));
        todoRepository.save(new Todo("wipe all the surfaces with cloth", false, false));
        todoRepository.save(new Todo("remove grease", false ,false));

    }
}
