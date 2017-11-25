package app.controllers;


import app.entities.Advertisement;
import app.entities.User;
import app.enums.SportDiscipline;
import app.services.AdvertisementService;
import app.services.UserService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ApiController extends BaseController {

    private final UserService userService;
    private final AdvertisementService advertisementService;

    @Autowired
    public ApiController(UserService userService, AdvertisementService advertisementService) {
        this.userService = userService;
        this.advertisementService = advertisementService;
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public ResponseEntity getUser(@PathVariable Long id) throws JsonProcessingException {

        return ResponseEntity.ok(userService.getById(id).get());
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE, produces = "application/json")
    @ResponseBody
    public ResponseEntity deleteUser(@PathVariable Long id){
        Boolean success = false;
        User u = userService.getById(id).orElse(null);
        if(u != null){
            userService.delete(u);
            success = true;
        }
        return ResponseEntity.ok(success);
    }

    @RequestMapping(value = "/advertisement/{id}", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public ResponseEntity getAdvertisement(@PathVariable Long id){
        return ResponseEntity.ok(advertisementService.getById(id).get());
    }

    @RequestMapping(value = "/advertisements", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public ResponseEntity getAdvertisements(){
        return ResponseEntity.ok(advertisementService.getAdvertisemens());
    }

    @RequestMapping(value = "/advertisement", method = RequestMethod.POST, produces = "application/json")
    @ResponseBody
    public ResponseEntity getAdvertisement(@RequestBody SportDiscipline discipline){
        return ResponseEntity.ok(advertisementService.getAdvertisementsBySportDiscipline(discipline));
    }

    @RequestMapping(value = "/advertisement", method = RequestMethod.PUT, produces = "application/json")
    @ResponseBody
    public ResponseEntity addAdvertisement(@RequestBody Advertisement adv){
        Boolean succes = false;
        advertisementService.save(adv);
        succes = true;
        return ResponseEntity.ok(succes);
    }

    @RequestMapping(value = "/disciplines", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public ResponseEntity getDisciplines(){
        return ResponseEntity.ok(SportDiscipline.values());
    }
}
