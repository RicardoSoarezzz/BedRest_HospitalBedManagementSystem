package org.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class MyController {
    @RequestMapping("/")
    public ModelAndView getHomepage() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        return modelAndView;
    }
    @RequestMapping("/menuadmin")
    public ModelAndView getMenuAdmin() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("menu_admin");
        return modelAndView;
    }
    @GetMapping("/usersTable")
    public String hello()
    {
        String table = new TableBuilder().buildHtmlTable();
        System.out.println(table);
        return table;
    }

}
