package com.epam.savitsky.training.firstLevel.classesjava;

import java.util.Objects;

public class Book {
    private int id;
    private String title;
    private String author;
    private String publishingHouse;
    private int yearPublishing;
    private int numberPages;
    private int cost;
    private String typeBinding;

    public Book() {
    }

    public Book(Book book) {
        this.id = book.id;
        this.title = book.title;
        this.author = book.author;
        this.publishingHouse = book.publishingHouse;
        this.yearPublishing = book.yearPublishing;
        this.numberPages = book.numberPages;
        this.cost = book.cost;
        this.typeBinding = book.typeBinding;
    }

    public Book(int id, String author) {
        this.id = id;
        this.author = author;
    }

    public Book(int id, String title, String author, String publishingHouse,
                int yearPublishing, int numberPages, int cost, String typeBinding) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publishingHouse = publishingHouse;
        this.yearPublishing = yearPublishing;
        this.numberPages = numberPages;
        this.cost = cost;
        this.typeBinding = typeBinding;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public int getYearPublishing() {
        return yearPublishing;
    }

    public void setYearPublishing(int yearPublishing) {
        this.yearPublishing = yearPublishing;
    }

    public int getNumberPages() {
        return numberPages;
    }

    public void setNumberPages(int numberPages) {
        this.numberPages = numberPages;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getTypeBinding() {
        return typeBinding;
    }

    public void setTypeBinding(String typeBinding) {
        this.typeBinding = typeBinding;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == book.id && yearPublishing == book.yearPublishing && numberPages == book.numberPages
                && cost == book.cost && Objects.equals(title, book.title)
                && Objects.equals(author, book.author) && Objects.equals(publishingHouse, book.publishingHouse)
                && Objects.equals(typeBinding, book.typeBinding);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, author, publishingHouse, yearPublishing, numberPages, cost, typeBinding);
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publishingHouse='" + publishingHouse + '\'' +
                ", yearPublishing=" + yearPublishing +
                ", numberPages=" + numberPages +
                ", cost=" + cost +
                ", typeBinding='" + typeBinding + '\'' +
                '}';
    }
}
