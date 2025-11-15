package com.example.zadanie_123;

public class User {
    private String firstName;
    private String lastName;

    private int AvatarId;

    public User(String firstName, String lastName, int AvatarId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.AvatarId = AvatarId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAvatarId() {
        return AvatarId;
    }
}
