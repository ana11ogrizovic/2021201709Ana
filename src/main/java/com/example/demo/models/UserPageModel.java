package com.example.demo.models;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class UserPageModel {
    private List<UserModel> Users;
    private int totalPages;
    private Long totalElements;
}
