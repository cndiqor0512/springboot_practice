package com.example.springboot_practice.controller;

import com.example.springboot_practice.domain.Address;
import com.example.springboot_practice.domain.Board;
import com.example.springboot_practice.domain.User;
import com.example.springboot_practice.dto.UserBoardDataResponseDto;
import com.example.springboot_practice.service.AddressService;
import com.example.springboot_practice.service.ApiService;
import com.example.springboot_practice.service.BoardService;
import com.example.springboot_practice.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequiredArgsConstructor
public class ApiController {
    private final ApiService apiService;
    private final UserService userService;
    private final BoardService boardService;
    private final AddressService addressService;

    @GetMapping("/api/userBoardData")
    public UserBoardDataResponseDto getUserBoardData(@RequestParam Long userId) {
        return apiService.getUserBoardData(userId);  //apiService에서 dto를 return한다.
    }

    @GetMapping("/api/user/{userId}")
    public User getUserData(@PathVariable Long userId) {
        return userService.getData(userId);
    }

    @GetMapping("/api/board/{boardId}")
    public Board getBoardData(@PathVariable Long boardId) {
        return boardService.getBoardData(boardId);
    }

    @GetMapping("/api/board")
    public List<Board> getList() {
        return boardService.getList();
    }
    @GetMapping("/api/user")
    public List<User> getUserList() {
        return userService.getList();
    }
    @GetMapping("/api/address")
    public List<Address> getAddressList() {
        return addressService.getAddressList();
    }
    @GetMapping("/api/address/{userId}")
    public Address getAddress(@PathVariable Long userId){
        return addressService.getAddress(userId);
    }
}