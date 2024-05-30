package com.example.demo.models;

import lombok.Data;
import lombok.Builder;

@Data
@Builder
public class LoginResponseModel {
    private String token;
    private String refreshToken;
}