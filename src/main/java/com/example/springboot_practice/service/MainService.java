package com.example.springboot_practice.service;


import com.example.springboot_practice.dto.BoardResponseDto;
import com.example.springboot_practice.dto.MainResponseDto;
import com.example.springboot_practice.repository.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class MainService {
    private final BoardRepository boardRepository;
    private final CalendarRepository calendarRepository;
    private final CommunityRepository communityRepository;
    private final FoodRepository foodRepository;
    private final NoticeRepository noticeRepository;

    public MainResponseDto getMainList(){
        MainResponseDto dto = new MainResponseDto();


        dto.setMainBoard(boardRepository.getBoardLimit());
        dto.setMainFood(foodRepository.getFoodLimit());
        dto.setMainCalendar(calendarRepository.getCalendarLimit());
        dto.setMainNotice(noticeRepository.getNoticeLimit());
        dto.setMainCommunity(communityRepository.getCommunityLimit());
        return dto;
    }
}
