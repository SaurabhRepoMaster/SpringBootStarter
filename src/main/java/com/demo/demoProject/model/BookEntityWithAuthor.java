package com.demo.demoProject.model;

import jakarta.persistence.*;
import org.springframework.web.bind.annotation.RestController;

@Entity
@Table(name = "books")
public class BookEntityWithAuthor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int bookId;

    @Override
    public String toString() {
        return "BookEntityWithAuthor{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", author=" + author +
                '}';
    }

    public BookEntityWithAuthor(int bookId, String bookName, Author author) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    private String bookName;

    @OneToOne(cascade =  CascadeType.ALL)
    private Author author;

    public BookEntityWithAuthor() {
    }
}
