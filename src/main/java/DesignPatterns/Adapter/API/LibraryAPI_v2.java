package DesignPatterns.Adapter.API;

import java.time.LocalDate;

public interface LibraryAPI_v2 {

    int numberOfAviableCopies(String bookTitle);

    LocalDate dueDate(String bookTitle, String firstName, String lastName, LocalDate dateOfBirth);

    boolean reserve(String bookTitle, String firstName, String lastName, LocalDate dateOfBirth);
}
