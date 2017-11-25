package app.utils;

import app.dto.Token;
import app.entities.User;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class TokenManager {
    private static final Map<Token, User> loginTokenMap = new HashMap<>();
    private static final Map<Token, User> emailTokenMap = new HashMap<>();

    public static Token generateLoginToken(User user){
        Token t = new Token(UUID.randomUUID().toString(), true);
        loginTokenMap.put(t, user);
        return t;
    }

    public static Token generateEmailToken(User user){
        Token t = new Token(UUID.randomUUID().toString(), true);
        emailTokenMap.put(t, user);
        return t;
    }

    public static Boolean checkToken(Token token, User user){
        return loginTokenMap.get(token) == user ? true : false;
    }
}
