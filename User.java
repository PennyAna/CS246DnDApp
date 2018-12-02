package com.alex.j.cs246dd;


import java.util.ArrayList;

public class User {

    ArrayList<Character> characters;
    String username;
    String passHash;
    String fullName;
    Boolean isSignedUp;

    /**
     * Constructs a newly allocated {@code Character} object that
     * represents the specified {@code char} value.
     *
     * @param value the value to be represented by the
     *              {@code Character} object.
     */

    public User(char value) {
    }

    String getUsername() {
        return username;
    }

    void setUsername(String newUsername) {
        username = newUsername;
    }

    String getFullName() {
        return fullName;
    }

    void setFullName(String newName) {
        fullName = newName;
    }

    String getPassHash() {
        return passHash;
    }

    void setPassHash(String hash) {
        passHash = hash;
    }

    boolean getIsSignedUp() {
        return isSignedUp;
    }

    void setIsSignedUp(boolean signedUp) {
        isSignedUp = signedUp;
    }

    ArrayList<Character> getCharacters() {
        return null;
    }

    void removeCharacter(int index) {
        characters.remove(index);
    }

    void addCharacter(Character newChar) {
        characters.add(newChar);
    }

    void editCharacter(int index, Character editedCharacter) {
        characters.add(index, editedCharacter);
        }
}

