package com.example.demo.account.dto.user;

import lombok.Data;

@Data
public class UpdateUserRequest {
    int userId;
    String userName;
    int age;
}
