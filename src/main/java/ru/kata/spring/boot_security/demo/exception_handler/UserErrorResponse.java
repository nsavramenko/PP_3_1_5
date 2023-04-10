package ru.kata.spring.boot_security.demo.exception_handler;

public class UserErrorResponse {

    private String info;

    public UserErrorResponse(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
