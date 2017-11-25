package app.utils;

import app.entities.User;

import java.time.LocalDate;

public class Validator {

    public static Boolean validateUser(User u){
        if(!u.getEmail().matches("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*$"))
            return false;
        else if(u.getPassword() == null || u.getPassword().equals(""))
            return false;
        else if(u.getName() == null || u.getName().equals(""))
            return false;
        else if(u.getSurname() == null || u.getSurname().equals(""))
            return false;
        else if(u.getBirthDate() == null || u.getBirthDate().equals(LocalDate.now()))
            return false;
        return true;
    }
}
