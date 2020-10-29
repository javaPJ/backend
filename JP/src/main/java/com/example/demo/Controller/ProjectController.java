package com.example.demo.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController("auth")
public class ProjectController {
    @RequestMapping(value = "/createSchdule", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public String isRunning() {
        return "sadf";
    }
    @RequestMapping(value = "/createProject", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public String asdf() {
        return "sadf";
    }
    @RequestMapping(value = "/readSchedule", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public String asd() {
        return "OK";
    }
    @ResponseStatus(value = HttpStatus.FORBIDDEN)
    public String sasd() {
        return "FAIL";
    }
    @RequestMapping(value = "/joinProject", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public String asdasdff() {
        return "sadf";
    }
    @RequestMapping(value = "/joinProject", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public String assdff() {
        return "sadf";
    }
}