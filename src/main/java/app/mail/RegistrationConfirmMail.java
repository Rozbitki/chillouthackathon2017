package app.mail;

import app.dto.Token;
import app.entities.User;
import app.utils.TokenManager;

public class RegistrationConfirmMail {

    public static void sendMail(User to){
        String subject = "Powtierdzenie rejestracji";
        String message = "Kliknij w link, aby potwierdzić: <a href=\"localhost:8080/>";

        String t = TokenManager.generateEmailToken(to);

        message += t + "<br>";

        MailManager.sendMail(to.getEmail(), subject, message);
    }
}
