package com.example.demo.account.dto;

import lombok.Data;
import java.util.*;
@Data
public class UserDto {
    String userId;
    String userName;
    String address;
    String detailAddress;
    Date createdAt;
}
