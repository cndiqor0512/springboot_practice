package com.example.springboot_practice.controller;

import com.example.springboot_practice.dto.*;
import com.example.springboot_practice.service.*;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequiredArgsConstructor
public class ApiController {
    private final ApiService apiService;
    private final UserService userService;
    private final AddressService addressService;
    private final MainService mainService;

    @GetMapping("/api/userBoardData")
    public UserBoardDataResponseDto getUserBoardData(@RequestParam Long userId) {
        return apiService.getUserBoardData(userId);  //apiService에서 dto를 return한다.
    }

    @GetMapping("/api/user/{userId}")
    public UserResponseDto getUserData(@PathVariable Long userId) {
        return userService.getData(userId);
    }

    @GetMapping("/api/user")
    public List<UserResponseDto> getUserList() {
        return userService.getList();
    }

    @GetMapping("/api/address")
    public List<AddressResponseDto> getAddressList() {
        return addressService.getAddressList();
    }

    @GetMapping("/api/address/{userId}")
    public AddressResponseDto getAddress(@PathVariable Long userId) {
        return addressService.getAddress(userId);
    }

    @GetMapping("/api/main")
    public MainResponseDto getMainList() {
        return mainService.getMainList();
    }

}