package com.example.demo2.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name="Account")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;
    @Column(name="Email",nullable = false)
    private String Email;
    @Column(name="UserDisplayName",nullable = false)
    private String UserDisplayName;
    @Column(name="AboutMe",nullable = false)
    private String AboutMe;
    @Column(name="Views", nullable = false)
    private int Views;
    @Column(name="TopicCounts", nullable = false)
    private int TopicCounts;
    @Column(name="Password", nullable = false)
    private String Password;
    @Column(name="CreationDate", nullable = false)
    private Date CreationDate;
    @Column(name="Role", nullable = false)
    private int Role;
    public Account() {
    }

    public Account(int ID, String email, String userDisplayName, String aboutMe, int views, int topicCounts, String password, Date creationDate, int role) {
        this.ID = ID;
        Email = email;
        UserDisplayName = userDisplayName;
        AboutMe = aboutMe;
        Views = views;
        TopicCounts = topicCounts;
        Password = password;
        CreationDate = creationDate;
        Role = role;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getUserDisplayName() {
        return UserDisplayName;
    }

    public void setUserDisplayName(String userDisplayName) {
        UserDisplayName = userDisplayName;
    }

    public String getAboutMe() {
        return AboutMe;
    }

    public void setAboutMe(String aboutMe) {
        AboutMe = aboutMe;
    }

    public int getViews() {
        return Views;
    }

    public void setViews(int views) {
        Views = views;
    }

    public int getTopicCounts() {
        return TopicCounts;
    }

    public void setTopicCounts(int topicCounts) {
        TopicCounts = topicCounts;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public Date getCreationDate() {
        return CreationDate;
    }

    public void setCreationDate(Date creationDate) {
        CreationDate = creationDate;
    }

    public int getRole() {
        return Role;
    }

    public void setRole(int role) {
        Role = role;
    }
}
