package org.haderlie.claire.dndapp;


import java.util.ArrayList;

/**
 * A User class for holding the user information
 *
 * This class is used to store the user's data from the database
 * and interact with its list of characters.
 *
 * @author Niclairex
 * @version 3.14159
 */
public class User {

    //List of the characters that the user has
    ArrayList<Character> characters;

    //The username
    String username;

    //A hashed version of the users' password
    String passHash;

    //The user's full name
    String fullName;

    //A boolean determining if the user is signed up for a table or not
    Boolean isSignedUp;


    public String getUsername() {
        return username;
    }

    public void setUsername(String newUsername) {
        username = newUsername;
    }

    public String getFullName() {
        return fullName;
    }

   public void setFullName(String newName) {
        fullName = newName;
    }

    public String getPassHash() {
        return passHash;
    }

   public void setPassHash(String hash) {
        passHash = hash;
    }

    /**
     * Check if the user is already signed up for a table or not
     *
     * @return isSignedUp A boolean to return {@code true} or {@code false} whether
     *                      the user is signed up.
     */
    public Boolean getIsSignedUp() {
        return isSignedUp;
    }

    /**
     * Change if the user is signed up for a table or not
     *
     * @param signedUp The new {@code true} or {@code false} signifying that the
     *                 user is signed up.
     */
    public void setIsSignedUp(boolean signedUp) {
        isSignedUp = signedUp;
    }

    /**
     *
     * @return characters Send back a copy of the list of {@code characters}
     */
    public ArrayList<Character> getCharacters() {
        return characters;
    }

    /**
     * Remove a character from a the list
     *
     * @param index The index of the character that is to be removed from
     *              the list.
     */
    public void removeCharacter(int index) {
        characters.remove(index);
    }

    /**
     * Add a new character into the characters list
     *
     * @param newChar The new character that is to be put into the User's
     *                characters list
     */
    public void addCharacter(Character newChar) {
        characters.add(newChar);
    }

    /**
     * Edit a character in the {@code characters} ArrayList
     *
     * <p>
     *     It is a "pseudo" edit. The {@code Character} itself is not changed, but instead
     *     the {@code Character} at the given index is replaced with an edited version of itself.
     * </p>
     * @param index The index of the {@code Character} that is to be replaced.
     * @param editedCharacter A new {@code Character} that was copied from a {@code Character}
     *                        and changed.
     */
    public void editCharacter(int index, Character editedCharacter) {
        characters.add(index, editedCharacter);
        }
}

