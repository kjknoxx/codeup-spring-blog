package com.codeup.codeupspringblog.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String username;

    @Column
    private String email;

    @Column
    private String password;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private List<Post> posts;

    public User(){

    }

    public User(long id, String username, String email, String password, List<Post> posts){
        this.id=id;
        this.username=username;
        this.email=email;
        this.password=password;
        this.posts=posts;
    }

    public User(String username, String email, String password, List<Post> posts) {
        this.username=username;
        this.email=email;
        this.password=password;
        this.posts=posts;
    }

    public User(String username, String email, String password) {
        this.username=username;
        this.email=email;
        this.password=password;
    }

    //getters and setters
    public long getId() {
        return id;
    }

    public void setId (long id) {
        this.id = id;
    }

    public String getUsername () {
        return username;
    }

    public void setUsername(String username) {
        this.username=username;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }
}

