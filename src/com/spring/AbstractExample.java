package com.spring;

public abstract class AbstractExample {
    private String email;

    public void setEmail(String email) {
        this.email = email;
    }

    public void getEmail() {
        System.out.println("email : " +email);
    }
}
