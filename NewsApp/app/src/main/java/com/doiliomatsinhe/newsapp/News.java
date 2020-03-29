package com.doiliomatsinhe.newsapp;

public class News {

    private String title;
    private String section;
    private String date;
    private String url;
    private String author;

    public News(String title, String section, String date, String url, String author) {
        this.title = title;
        this.section = section;
        this.date = date;
        this.url = url;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
