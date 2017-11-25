package app.controllers;

import app.dto.Auth;
import app.dto.Token;
import app.entities.User;
import app.mail.RegistrationConfirmMail;
import app.services.UserService;
import app.utils.TokenManager;
import app.utils.Validator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
public class AuthenticationController extends BaseController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "login", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
    @ResponseBody
    public Token login(@RequestBody Auth auth){
        Token t = new Token("", false);
        User u = userService.getByEmail(auth.getEmail()).orElse(new User(-1L,"","","","", LocalDate.now()));
        if(u.getEmail().equals(auth.getEmail()) && u.getPassword().equals(auth.getPassword()))
            t = TokenManager.generateLoginToken(u);
        return t;
    }

    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String login(ModelMap model){
        return "login";
    }

    @RequestMapping(value = "register", method = RequestMethod.GET)
    public String register(){
        return "register";
    }

    @RequestMapping(value = "register", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
    @ResponseBody
    public Boolean register(@RequestBody User user){
        Boolean status = Validator.validateUser(user);
        if(status){
            user.setDeleted(false);
            user.setEnabled(false);
            userService.save(user);
            RegistrationConfirmMail.sendMail(user);
        }

        return status;
    }
}
