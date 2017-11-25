package app.mail;

import app.dto.Token;
import app.entities.User;
import app.utils.TokenManager;

public class RegistrationConfirmMail {

    public static void sendMail(User to){
        String subject = "Powtierdzenie rejestracji";
        String message = "Kliknij w link, aby potwierdzić <br> ";

        Token t = TokenManager.generateEmailToken(to);

        message += t.getToken() + "<br>";

        MailManager.sendMail(to.getEmail(), subject, message);
    }
}
