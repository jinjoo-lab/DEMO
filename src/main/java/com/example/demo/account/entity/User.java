package com.example.demo.account.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class User {
    String userName;
    String password;
    String address;
    String detailAddress;
    Date createdAt;


    @Id
    int userId;
}
