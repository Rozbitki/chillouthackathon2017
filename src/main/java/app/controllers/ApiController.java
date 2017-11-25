package app.controllers;

import app.services.UserService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ApiController extends BaseController {

    private final UserService userService;

    @Autowired
    public ApiController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public ResponseEntity getUser(@PathVariable Long id) throws JsonProcessingException {

        return ResponseEntity.ok(userService.getById(id).get());
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

    @RequestMapping(value = "/advertisement", method = RequestMethod.POST, produces = "application/json")
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
