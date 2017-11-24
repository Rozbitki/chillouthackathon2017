package app.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class ApiController extends BaseController {

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public ResponseEntity getUser(@PathVariable Long id){
        String returnString = "{\"id\": " + id + ", \"name\": \"Janusz\"}";
        return ResponseEntity.ok(returnString);
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE, produces = "application/json")
    @ResponseBody
    public ResponseEntity deleteUser(@PathVariable Long id){
        String returnString = "{\"id\": " + id + ", \"name\": \"Janusz\"}";
        return ResponseEntity.ok(returnString);
    }

    @RequestMapping(value = "/advertisement/{id}", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public ResponseEntity getAdvertisement(@PathVariable Long id){
        String returnString = "{\"id\": " + id + ", \"name\": \"Janusz\"}";
        return ResponseEntity.ok(returnString);
    }

    @RequestMapping(value = "/advertisements", method = RequestMethod.POST, produces = "application/json")
    @ResponseBody
    public ResponseEntity getAdvertisement(@RequestBody String request){
        return ResponseEntity.ok(request);
    }

    @RequestMapping(value = "/advertisement", method = RequestMethod.PUT, produces = "application/json")
    @ResponseBody
    public ResponseEntity addAdvertisement(@RequestBody String request){
        return ResponseEntity.ok(request);
    }

}
