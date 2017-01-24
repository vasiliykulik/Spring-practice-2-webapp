package application.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Стрела on 24.01.2017.
 */
// Контроллеры - те же bean - s d SPRING
    @RestController
    @RequestMapping(value = "ctr")
public class SimpleController {
    @Autowired//()
    private Echo echo;
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(@RequestParam("name") String name){
        return echo.echo(name);
    }

}
