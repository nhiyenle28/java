package com.example.welcomeapp.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class WelcomeMessage {
    private String message;
    private String time;

    public WelcomeMessage(String message) {
        this.message = message;
        this.time = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));
    }

    public String getMessage() {
        return message;
    }

    public String getTime() {
        return time;
    }
}
