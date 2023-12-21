package org.example;

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
    @RequestMapping("/menu-admin")
    public ModelAndView getMenuAdmin() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("menu_admin");
        return modelAndView;
    }
    @RequestMapping("/users-table")
    public String getUsersTable()
    {
        return TableBuilder.buildUserTable();
    }
    @RequestMapping("/beds-table")
    public String getBedsTable()
    {
        return TableBuilder.buildUserTable();
    }
}
