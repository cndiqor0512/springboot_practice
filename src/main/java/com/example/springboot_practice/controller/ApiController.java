package com.example.springboot_practice.controller;

import com.example.springboot_practice.domain.*;
import com.example.springboot_practice.dto.*;
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
    private final CalendarService calendarService;
    private final FoodService foodService;

    @GetMapping("/api/userBoardData")
    public UserBoardDataResponseDto getUserBoardData(@RequestParam Long userId) {
        return apiService.getUserBoardData(userId);  //apiService에서 dto를 return한다.
    }

    @GetMapping("/api/user/{userId}")
    public UserResponseDto getUserData(@PathVariable Long userId) {
        return userService.getData(userId);
    }

    @GetMapping("/api/board/id/{boardId}")
    public BoardResponseDto getBoardData(@PathVariable Long boardId) {
        return boardService.getBoardData(boardId);
    }

    @GetMapping("/api/board")
    public List<BoardResponseDto> getList() {
        return boardService.getList();
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

    @GetMapping("/api/board/type/{type}")
    public List<BoardResponseDto> getBoardListByType(@PathVariable String type) {
        return boardService.getListByType(type);
    }

    @GetMapping("/api/notice")
    public List<NoticeResponseDto> getNoticeList() {
        return noticeService.getNoticeList();
    }

    @GetMapping("/api/notice/{noticeId}")
    public NoticeResponseDto getNoticeData(@PathVariable Long noticeId) {
        return noticeService.getNoticeData(noticeId);
    }

    @GetMapping("/api/community")
    public List<CommunityResponseDto> getCommunityList(){
        return communityService.getCommunityList();
    }

    @GetMapping("/api/community/{communityId}")
    public CommunityResponseDto getCommunityData(@PathVariable Long communityId){ return communityService.getCommunityData(communityId);}

    @GetMapping("/api/calendar")
    public List<CalendarResponseDto> getCalendarList(){ return calendarService.getCalendarList();}

    @GetMapping("/api/calendar/{calendarId}")
    public CalendarResponseDto getCalendarData(@PathVariable Long calendarId){ return calendarService.getCalendarData(calendarId);}

    @GetMapping("/api/food")
    public List<FoodResponseDto> getFoodList(){ return foodService.getFoodList();}

    @GetMapping("/api/food/{foodId}")
    public FoodResponseDto getFoodData(@PathVariable Long foodId){return foodService.getFoodData(foodId);}

}