package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @RequestMapping(value = "/", produces = "application/json")
    @ResponseBody
    public String base(){
        return "Kappa";
    }
}
