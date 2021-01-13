package com.greenfox.hellobean;

import com.greenfox.hellobean.hellobeanaplicitionsparts.service.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloBeanApplication implements CommandLineRunner {

    private Printer printer;

    @Autowired
    HelloBeanApplication(Printer printer) {
        this.printer = printer;
    }

    public static void main(String[] args) {
        SpringApplication.run(HelloBeanApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
            printer.log("Hello, is it working ?");
    }
}
