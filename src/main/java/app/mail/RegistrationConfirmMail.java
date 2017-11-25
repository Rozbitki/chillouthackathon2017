package app.mail;

import app.dto.Token;
import app.entities.User;
import app.utils.TokenManager;

public class RegistrationConfirmMail {

    public static void sendMail(User to){
        String subject = "Potwierdzenie rejestracji";
        String message = "Skopiuj ponizszy link do paska przegladarki, aby potwierdzić: localhost:8080/activate/";

        String t = TokenManager.generateEmailToken(to);

        MailManager.sendMail(to.getEmail(), subject, message);
    }
}
