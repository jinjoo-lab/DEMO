package com.example.demo.account.dto;

import lombok.Data;

@Data
public class SignUpRequest {
    String userId;
    String userName;
    String password;
}
