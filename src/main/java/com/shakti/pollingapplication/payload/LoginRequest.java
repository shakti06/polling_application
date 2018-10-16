package com.shakti.pollingapplication.payload;

import javax.validation.constraints.NotNull;

public class LoginRequest {
    @NotNull
    private String usernameOrEmail;
    @NotNull
    private String password;

    public String getUsernameOrEmail() {
        return usernameOrEmail;
    }

    public void setUsernameOrEmail(String usernameOrEmail) {
        this.usernameOrEmail = usernameOrEmail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
