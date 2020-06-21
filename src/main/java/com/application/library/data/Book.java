package com.application.library.data;

import javax.persistence.*;

@Entity
@Table(name = "books")

public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "title")
    private String title;

    @Column(name = "publishmentYear")
    private int publishmentYear;

    public Book(){}

    public Book(String title, int publishmentYear) {
        this.title = title;
        this.publishmentYear = publishmentYear;
    }

    public long getId() {
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

    public int getPublishmentYear() {
        return publishmentYear;
    }

    public void setPublishmentYear(int publishmentYear) {
        this.publishmentYear = publishmentYear;
    }
}
