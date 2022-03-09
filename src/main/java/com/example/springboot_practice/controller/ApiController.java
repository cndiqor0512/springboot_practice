package com.example.springboot_practice.controller;

import com.example.springboot_practice.domain.*;
import com.example.springboot_practice.dto.UserBoardDataResponseDto;
import com.example.springboot_practice.service.*;
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
    private final NoticeService noticeService;
    private final CommunityService communityService;

    @GetMapping("/api/userBoardData")
    public UserBoardDataResponseDto getUserBoardData(@RequestParam Long userId) {
        return apiService.getUserBoardData(userId);  //apiService에서 dto를 return한다.
    }

    @GetMapping("/api/user/{userId}")
    public User getUserData(@PathVariable Long userId) {
        return userService.getData(userId);
    }

    @GetMapping("/api/board/id/{boardId}")
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
    public Address getAddress(@PathVariable Long userId) {
        return addressService.getAddress(userId);
    }

    @GetMapping("/api/board/type/{type}")
    public List<Board> getBoardListByType(@PathVariable String type) {
        return boardService.getListByType(type);
    }

    @GetMapping("/api/notice")
    public List<Notice> getNoticeList() {
        return noticeService.getNoticeList();
    }

    @GetMapping("/api/notice/{noticeId}")
    public Notice getNoticeData(@PathVariable Long noticeId) {
        return noticeService.getNoticeData(noticeId);
    }

    @GetMapping("/api/community")
    public List<Community> getCommunityList(){
        return communityService.getCommunityList();
    }

    @GetMapping("/api/community/{communityId}")
    public Community getCommunityData(@PathVariable Long communityId){ return communityService.getCommunityData(communityId);}

}