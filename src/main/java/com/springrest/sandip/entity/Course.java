package com.springrest.sandip.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Course {
    @Id
    private Long id;
    private String courseName;
    private Date releaseDate;
    private String author;

    public Course(Long id, String courseName, String author) {
        this.id = id;
        this.courseName = courseName;
        this.releaseDate = new Date();
        this.author = author;
    }

    public Course() {
        super();
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", courseName='" + courseName + '\'' +
                ", releaseDate=" + releaseDate +
                ", author='" + author + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
