package com.example.springboot_practice.repository;

import com.example.springboot_practice.domain.User;
import org.apache.ibatis.annotations.Mapper;


import java.util.List;

@Mapper
public interface UserRepository {
    List<User> getList();

    User getData(Long userId);
}
