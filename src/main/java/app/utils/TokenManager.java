package app.utils;

import app.dto.Token;
import app.entities.User;
import org.hibernate.procedure.NoSuchParameterException;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class TokenManager {
    private static final Map<String, User> loginTokenMap = new HashMap<>();
    private static final Map<String, User> emailTokenMap = new HashMap<>();

    public static String generateLoginToken(User user){
        String t = UUID.randomUUID().toString();
        loginTokenMap.put(t, user);
        return t;
    }

    public static String generateEmailToken(User user){
        String t = UUID.randomUUID().toString();
        emailTokenMap.put(t, user);
        return t;
    }

    public static User checkToken(String token) throws NoSuchFieldException {
        boolean tokenFound = false;
        token = token.startsWith("Bearer ") ? token.substring("Bearer ".length()) : token;
        for (String t : loginTokenMap.keySet()) {
            if (t.equals(token)) {
                tokenFound = true;
                break;
            }
        }

        if (tokenFound) {
            return loginTokenMap.get(token);
        } else {
            throw new NoSuchFieldException("Wrong token");
        }
    }
}
