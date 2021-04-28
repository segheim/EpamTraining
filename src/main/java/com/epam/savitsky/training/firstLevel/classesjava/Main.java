package com.epam.savitsky.training.firstLevel.classesjava;

public class Main {

    public static void main(String[] args) {
        BookGenerator bookGenerator = new BookGenerator();
        Library library = new Library(bookGenerator.getCatalogBook());

        Printer.toScreen(library.getListOfBooks());
        Printer.toScreen(library.getBooksByAuthor("Tolstoi"));
        Printer.toScreen(library.getBooksByPublishingHouse("Classic"));
        Printer.toScreen(library.getBooksAfterGivenYear(2000));
    }
}
