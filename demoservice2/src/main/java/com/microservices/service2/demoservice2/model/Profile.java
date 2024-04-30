package com.microservices.service2.demoservice2.model;

import java.util.List;

public class Profile {

    private int id;
    private List<String> posts;
    private List<String> notifications;

    public Profile(int id, List<String> posts, List<String> notifications) {
        this.id = id;
        this.posts = posts;
        this.notifications = notifications;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<String> getPosts() {
        return posts;
    }

    public void setPosts(List<String> posts) {
        this.posts = posts;
    }

    public List<String> getNotifications() {
        return notifications;
    }

    public void setNotifications(List<String> notifications) {
        this.notifications = notifications;
    }

}
