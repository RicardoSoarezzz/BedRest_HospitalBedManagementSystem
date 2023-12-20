package org.example;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Controller {
    @GetMapping("/hello")
    public String hello()
    {
        String table = new TableBuilder().buildHtmlTable();
        System.out.println(table);
        return table;
    }
}
