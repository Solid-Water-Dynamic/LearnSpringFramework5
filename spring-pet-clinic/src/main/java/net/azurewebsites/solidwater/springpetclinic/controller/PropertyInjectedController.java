package net.azurewebsites.solidwater.springpetclinic.controller;

import net.azurewebsites.solidwater.springpetclinic.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    public GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
