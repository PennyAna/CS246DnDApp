package org.haderlie.claire.dundrag;

import android.view.View;
import android.widget.EditText;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Base64;
import java.util.Random;

import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

public class LoginSecurityHandler {
    // User currentUser;

    MainActivity mainActivity;

    LoginSecurityHandler(MainActivity mainAct) {
        mainActivity = mainAct;
    }

    public Boolean validateUsername() {
        return true;
    }

    public Boolean validatePassword() {
        return true;
    }

    //Call this when they sign up
    public User signUp() throws Exception {


        EditText firstNameInput = (EditText) mainActivity.findViewById(R.id.signup_firstname);
        EditText lastNameInput = (EditText) mainActivity.findViewById(R.id.signup_lastname);

        EditText usernameInput = (EditText) mainActivity.findViewById(R.id.signup_username);
        EditText passwordInput = (EditText) mainActivity.findViewById(R.id.signup_password);


        String firstName = firstNameInput.getText().toString();
        String lastName = lastNameInput.getText().toString();
        String username = usernameInput.getText().toString();
        String password = passwordInput.getText().toString();

        User newUser = new User(firstName, lastName, username, password);

        try{
        hashUserPassword(newUser);}
        catch(Exception e){
            e.printStackTrace();
        }

        return newUser;
    }

    private static final Random RANDOM = new SecureRandom();


    // These constant values are used by the hash algorithm.
    private static final int ITERATIONS = 10000;
    private static final int KEY_LENGTH = 256;


    // This function generates a random, 16-byte
    // salt value.
    private static byte[] getNextSalt() {
        byte[] salt = new byte[16];
        RANDOM.nextBytes(salt);
        return salt;
    }

    // This function uses the PBKDF2 algorithm for generating the hash. If you're
    // interested in why this particular function was chosen, see:
    // http://security.stackexchange.com/questions/4781/do-any-security-experts-recommend-bcrypt-for-password-storage/6415#6415
    private static byte[] getHash(char[] password, byte[] salt) throws Exception {

        PBEKeySpec spec = new PBEKeySpec(password, salt, ITERATIONS, KEY_LENGTH);
        Arrays.fill(password, java.lang.Character.MIN_VALUE);

        SecretKeyFactory skf = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
        byte[] hash = skf.generateSecret(spec).getEncoded();

        return hash;
    }

    /**
     * This function takes the password from the {@link User} class and hashes it.
     * As a side-effect, the original password value is removed for security purposes.
     *
     * @param user The user whose password needs to be hashed.
     * @throws Exception If there is a problem with the chosen hash function.
     */
    public static void hashUserPassword(User user) throws Exception {

        // Get the next random salt value to use for this password
        byte[] salt = getNextSalt();
        char[] password = user.getPassword().toCharArray();

        //Test the password to see if it has at least 8 characters and at least 1 digit
        //Throws an exception if the parameters are not met.

        if (!(user.getPassword().matches(".*\\d.*"))) {
            throw new WeakPasswordException("Password must contain at least 1 number.");
        }

        //TODO--put this back to 8
        if (user.getPassword().length() < 4) {
            throw new WeakPasswordException("Password must be at least 4 characters long.");
        }


        // Once we've generated the hash, clear the old password
        // from memory for security purposes
        byte[] hash = getHash(password, salt);

        Arrays.fill(password, java.lang.Character.MIN_VALUE);

        user.setPassword("");

        if (hash != null) {

            // By Base64-encoding the raw bytes, we can store them as strings.
            // This allows us to save the values to a file or database if needed.

            String hashString = Base64.getEncoder().encodeToString(hash);
            String saltString = Base64.getEncoder().encodeToString(salt);

            user.setHashedPassword(hashString);
            user.setSalt(saltString);
        } else {
            user.setHashedPassword(null);
            user.setSalt(null);
        }
    }

    /**
     * This function uses the password and salt in the {@link User} to generate a hash,
     * then compares that hash to the original hash value.
     *
     * @param user The user whose password needs to be hashed.
     * @return Whether or not the password values match.
     * @throws Exception If there is a problem with the chosen hash function.
     */
    public static Boolean verifyPassword(User user) throws Exception {

        // Have to get the raw data values to use on our hash function
        char[] password = user.getPassword().toCharArray();
        byte[] salt = Base64.getDecoder().decode(user.getSalt());

        // Generate the new hash, and retrieve the user's hash
        byte[] expectedHash = getHash(password, salt);
        byte[] userHash = Base64.getDecoder().decode(user.getHashedPassword());

        // If the new hash came out as null, or the lengths don't match,
        // we know that the original password is different
        if (expectedHash == null || expectedHash.length != userHash.length)
            return false;

        // Check each byte of the two hashes and as soon as we find one
        // that is different, we know that the passwords don't match
        for (int i = 0; i < expectedHash.length; i++) {
            if (expectedHash[i] != userHash[i])
                return false;
        }

        // If we got this far, it means the password hashes match, so we
        // can assume the passwords do as well.
        return true;
    }
}
