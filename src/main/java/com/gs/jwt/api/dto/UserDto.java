package com.gs.jwt.api.dto;

import lombok.*;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "users")
public class UserDto {

    @Id
    private String id; //MongoDB 식별자 코드

    private String userName;

    private String passWord;

    private int age;
}
