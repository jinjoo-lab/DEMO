package com.example.demo.account.dto.user;

import lombok.Data;

@Data
public class AddUserRequest {
    String userName;
    String address;
    String detailAddress;
    int age;
    int birthYear;
    int birthMonth;
    int birthDay;
}
