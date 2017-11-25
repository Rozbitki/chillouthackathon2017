package app.dto;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;

public class Token {
    String token;
    Boolean success;


    public Token( String token, Boolean success) {
        if (token.startsWith("Bearer ")) {
            token = token.substring("Bearer ".length());
        }
        this.token = token;
        this.success = success;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }
}

