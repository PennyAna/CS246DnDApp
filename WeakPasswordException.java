package com.alex.j.cs246dd;

//This class is an Exception class that throws messages when used in a try/catch statement.
public class WeakPasswordException extends Exception {

    //Default constructor
    public WeakPasswordException()
    {
        super("Password is too weak. Please create stronger password.");
    }
    //Constructor to set specific message
    public WeakPasswordException(String message){
        super(message);
    }

    //Display the exception message.
    public String getMessage (){
        return super.getMessage();
    }

}
