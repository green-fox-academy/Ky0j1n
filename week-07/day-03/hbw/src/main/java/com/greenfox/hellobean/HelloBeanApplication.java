package com.greenfox.hellobean;

import com.greenfox.hellobean.hellobeanaplicitionsparts.service.Printer;
import com.greenfox.hellobean.model.MyColor;
import com.greenfox.hellobean.model.YellowColor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloBeanApplication implements CommandLineRunner {

    private Printer printer;
    private MyColor mycolor;

    @Autowired
    HelloBeanApplication(Printer printer, MyColor mycolor) {
        this.printer = printer;
        this.mycolor = mycolor;
    }


    

    public static void main(String[] args) {
        SpringApplication.run(HelloBeanApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
            printer.log("Hello, is it working ? " + mycolor.printColor());
    }
}
