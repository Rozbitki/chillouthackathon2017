package app.utils;

import app.dto.Token;
import app.entities.User;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class TokenManager {
    private static final Map<Token, User> tokenMap = new HashMap<>();

    public static Token generateToken(User user){
        Token t = new Token(UUID.randomUUID().toString(), true);
        tokenMap.put(t, user);
        return t;
    }

    public static Boolean checkToken(Token token, User user){
        return tokenMap.get(token) == user ? true : false;
    }
}
