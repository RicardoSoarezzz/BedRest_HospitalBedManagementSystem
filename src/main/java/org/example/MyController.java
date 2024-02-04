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


    @RequestMapping("/login")
    public ModelAndView getLogin() {
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
    @RequestMapping("/gestao")
    public ModelAndView getMenuGestao() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("gestao");
        return modelAndView;

    }


    @RequestMapping("/manutencao")
    public ModelAndView getMenuManutencao() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("manutencao");
        return modelAndView;

    }


    @RequestMapping("/basico")
    public ModelAndView getMenuBase() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("basico");
        return modelAndView;
    }
    ////////////////////////////////////////////////////////////////////


    ////////////////////////////////////////////////////////////////////
    //USERS
    @RequestMapping("/USER/add")
    public ModelAndView getAddUser() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("USER/add");
        return modelAndView;
    }

    @RequestMapping("/USER/remove")
    public ModelAndView getRemoveUser() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("USER/remove");
        return modelAndView;
    }
    @RequestMapping("/USER/updateInfo")
    public ModelAndView getUpdInfoUser() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("USER/updateInfo");
        return modelAndView;
    }

    @RequestMapping("/USER/updateType")
    public ModelAndView getUpdTypeUser() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("USER/updateType");
        return modelAndView;
    }
    ////////////////////////////////////////////////////////////////////


    ////////////////////////////////////////////////////////////////////
    //REPORTS
    @RequestMapping("/REPORT/occupation")
    public ModelAndView getOccupations() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("REPORT/occupation");
        return modelAndView;
    }
    @RequestMapping("/REPORT/meals")
    public ModelAndView getMeals() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("REPORT/meals");
        return modelAndView;
    }

    @RequestMapping("/REPORT/maintenanceAndCleaning")
    public ModelAndView getMaintenance() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("REPORT/maintenanceAndCleaning");
        return modelAndView;
    }
    ////////////////////////////////////////////////////////////////////


    ////////////////////////////////////////////////////////////////////
    //BED
    @RequestMapping("/BED/addBed")
    public ModelAndView getAddBed() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("BED/addBed");
        return modelAndView;
    }
    @RequestMapping("/BED/removeBed")
    public ModelAndView getRemoveBed() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("BED/removeBed");
        return modelAndView;
    }

    @RequestMapping("/BED/updateBed")
    public ModelAndView getUpdBed() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("BED/updateBed");
        return modelAndView;
    }
    ////////////////////////////////////////////////////////////////////


    ////////////////////////////////////////////////////////////////////
    //BED
    @RequestMapping("/DEPARTMENT/add")
    public ModelAndView getAddDEP() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("DEPARTMENT/add");
        return modelAndView;
    }
    @RequestMapping("/DEPARTMENT/remove")
    public ModelAndView getRemoveDEP() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("DEPARTMENT/remove");
        return modelAndView;
    }

    @RequestMapping("/DEPARTMENT/update")
    public ModelAndView getUpdateDEP() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("DEPARTMENT/update");
        return modelAndView;
    }

    ////////////////////////////////////////////////////////////////////


    ////////////////////////////////////////////////////////////////////
    //STOCKS
    @RequestMapping("/STOCKS/add")
    public ModelAndView getAddStocks() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("STOCKS/add");
        return modelAndView;
    }
    @RequestMapping("/STOCKS/remove")
    public ModelAndView getRemoveStocks() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("STOCKS/remove");
        return modelAndView;
    }

    @RequestMapping("/STOCKS/update")
    public ModelAndView getUpdStocks() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("STOCKS/update");
        return modelAndView;
    }
    ////////////////////////////////////////////////////////////////////

    @RequestMapping("/USER/userTable")
    public String getUsersTable()
    {
        return TableBuilder.buildUserTable();
    }
    @RequestMapping("/BED/bedTable")
    public String getBedsTable()
    {
        return TableBuilder.buildBedsTable();
    }

    @RequestMapping("/REPORT/occupationRate")
    public String getOccupationRate(){
        return TableBuilder.buildOccupationRate();
    }
}
