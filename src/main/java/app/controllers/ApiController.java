package app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class ApiController extends BaseController {

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public String getUser(@PathVariable Long id){
        String returnString = "{\"id\": " + id + ", \"name\": \"Janusz\"}";
        return returnString;
    }

}
