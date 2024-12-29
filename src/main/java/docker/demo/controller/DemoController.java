package docker.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/demo")
@RestController
public class DemoController {

    @RequestMapping(value = "/greet/{name}", method = RequestMethod.GET)
    public String greet(@PathVariable("name") String name) {
        return "Hello "+ name +" !!\nWelcome to Docker World !!\n";
    }
}
