package org.haderlie.claire.dundrag;


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

    public void setPlayer(Character character){
        player = character;
    }

    public void setFirstName(String name){
        firstName = name;
    }

    public void setLastName(String name){
        lastName = name;
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
