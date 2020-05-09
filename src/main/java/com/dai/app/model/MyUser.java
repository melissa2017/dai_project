package com.dai.app.model;

import javax.persistence.*;
import java.sql.Blob;
import java.util.List;

@Entity
public class MyUser {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column()
    private Long id;

    @Column()
    private String email;

    @Column()
    private String phoneNumber;

    @Column()
    private String firstName;

    @Column()
    private String lastName;

    @Column()
    private String password;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address", referencedColumnName = "id")
    private Address address;

    @Column()
    private Blob categorySubscriptions;

    @Column()
    private SubscriptionType subscriptionType;

    @Column()
    private Float rating;

    @Column()
    private Integer numberOfVotes;

    @OneToMany(mappedBy = "myUser")
    private List<Announcement> announcements;

    @OneToMany(mappedBy = "myUser")
    private List<Comment> comments;

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPassword() {
        return password;
    }

    public Address getAddress() {
        return address;
    }

    public Blob getCategorySubscriptions() {
        return categorySubscriptions;
    }

    public SubscriptionType getSubscriptionType() {
        return subscriptionType;
    }

    public Float getRating() {
        return rating;
    }

    public Integer getNumberOfVotes() {
        return numberOfVotes;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAddressId(Address address) {
        this.address = address;
    }

    public void setCategorySubscriptions(Blob categorySubscriptions) {
        this.categorySubscriptions = categorySubscriptions;
    }

    public void setSubscriptionType(SubscriptionType subscriptionType) {
        this.subscriptionType = subscriptionType;
    }

    public void setRating(Float rating) {
        this.rating = rating;
    }

    public void setNumberOfVotes(Integer numberOfVotes) {
        this.numberOfVotes = numberOfVotes;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", password='" + password + '\'' +
                ", categorySubscriptions=" + categorySubscriptions +
                ", subscriptionType=" + subscriptionType +
                ", rating=" + rating +
                '}';
    }
}

