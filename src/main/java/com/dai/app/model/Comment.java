package com.dai.app.model;

import javax.persistence.*;
import java.sql.Blob;

@Entity
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column()
    private Long id;

    @ManyToOne
    private MyUser myUser;

    @ManyToOne
    private Announcement announcement;

    @Column()
    private Blob data;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public MyUser getMyUser() {
        return myUser;
    }

    public void setUserId(MyUser myUser) {
        this.myUser = myUser;
    }

    public Announcement getAnnouncement() {
        return announcement;
    }

    public void setAnnouncement(Announcement announcement) {
        this.announcement = announcement;
    }

    public Blob getData() {
        return data;
    }

    public void setData(Blob data) {
        this.data = data;
    }
}
