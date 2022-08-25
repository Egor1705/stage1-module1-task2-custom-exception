package com.epam.mjc;

public class StudentException extends IllegalArgumentException{

    private long studentID;
    public StudentException(String message, long studentID) {
        super("Could not find student with ID "+studentID);
    }
}
