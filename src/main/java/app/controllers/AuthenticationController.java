package app.controllers;

import app.dto.Auth;
import app.dto.Token;
import app.entities.User;
import app.utils.TokenManager;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import sun.misc.Request;

@RestController
public class AuthenticationController extends BaseController {

    @RequestMapping(value = "login", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
    @ResponseBody
    public Token login(@RequestBody Auth auth){
        User u = new User(1L,"mleko","lekokm","mlako@mleko.pol");//findUserByEmail(auth.getEmail());
        u.setPassword("xyz");
        Token t = null;
        if(u.getEmail().equals(auth.getEmail()) && u.getPassword().equals(auth.getPassword()))
            t = TokenManager.generateToken(u);
        else
            t = new Token("", false);
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
//        Boolean status = validateUser(user);
//        if(status)
//            UserService.save(user);

        return status;
    }
}
