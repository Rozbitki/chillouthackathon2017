package app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticationController extends BaseController {

    @RequestMapping(value = "/login", method = RequestMethod.POST, produces = "application/json")
    public String login(){
        return "{\"test\": \"value\"}";
    }
}
