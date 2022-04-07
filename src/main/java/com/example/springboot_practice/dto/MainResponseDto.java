package com.example.springboot_practice.dto;


import lombok.Data;

import java.util.List;

@Data
public class MainResponseDto {
    private List<BoardResponseDto> mainBoard;
    private List<CalendarResponseDto> mainCalendar;
    private List<FoodResponseDto> mainFood;
    private List<NoticeResponseDto> mainNotice;
    private List<CommunityResponseDto> mainCommunity;
}
