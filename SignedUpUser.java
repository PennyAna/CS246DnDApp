package com.alex.j.cs246dd;


/*
 * Class: SignedUpUser
 * Purpose; signed up user contains the information on a character
 * and user to properly display who is signed up for an adventure.
 * it does not contain sensitive information from the user class
 * such as username or password info
 */

public class SignedUpUser {
    private Character player;
    private String firstName;
    private String lastName;

    SignedUpUser(User user, Character character) {
        firstName = user.getFirstName();
        lastName = user.getLastName();
        player = character;
    }

    public Character getPlayer() {
        return player;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
