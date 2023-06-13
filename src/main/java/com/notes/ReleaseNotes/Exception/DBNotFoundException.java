package com.notes.ReleaseNotes.Exception;

public class DBNotFoundException extends Exception {

    public DBNotFoundException() {
    }

    public DBNotFoundException(String message) {
        super(message);
    }
}
