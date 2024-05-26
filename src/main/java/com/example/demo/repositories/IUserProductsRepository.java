package com.example.demo.repositories;

import com.example.demo.entities.User;
import com.example.demo.entities.UserProducts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IUserProductsRepository extends JpaRepository<UserProducts, Integer>{


    }

