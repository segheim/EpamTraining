package com.epam.savitsky.training.firstLevel.classesjava;

public class Library {
    private Book[] libraryBooks;

    public Library(Book[] libraryBooks) {
        this.libraryBooks = libraryBooks;
    }

    public String getListOfBooks() {
        StringBuilder stringBuilder = new StringBuilder("List of books: ");
        for (Book book : libraryBooks) {
            stringBuilder.append(book.getTitle() + "\n");
        }

        return stringBuilder.toString();
    }

    public String getBooksByAuthor(String searchAuthor) {
        StringBuilder stringBuilder = new StringBuilder("List " + searchAuthor + "'s books: ");
        for (Book book : libraryBooks) {
            if (book.getAuthor().equals(searchAuthor)) {
                stringBuilder.append(book.getTitle() + "\n");
            }
        }

        return stringBuilder.toString();
    }

    public String getBooksByPublishingHouse(String publishingHouse) {
        StringBuilder stringBuilder = new StringBuilder("List of books published by " + publishingHouse + ":");
        for (Book book : libraryBooks) {
            if (book.getPublishingHouse().equals(publishingHouse)) {
                stringBuilder.append(book.getTitle() + "\n");
            }
        }

        return stringBuilder.toString();
    }

    public String getBooksAfterGivenYear(int givenYear) {
        StringBuilder stringBuilder = new StringBuilder("List of books published after " + givenYear + " year:");
        for (Book book : libraryBooks) {
            if (book.getYearPublishing() > givenYear) {
                stringBuilder.append(book.getTitle() + "\n");
            }
        }

        return stringBuilder.toString();
    }
}