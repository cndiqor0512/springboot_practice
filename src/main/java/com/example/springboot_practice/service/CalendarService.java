package com.example.springboot_practice.service;

import com.example.springboot_practice.domain.Calendar;
import com.example.springboot_practice.dto.CalendarResponseDto;
import com.example.springboot_practice.repository.CalendarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CalendarService {
    private final CalendarRepository calendarRepository;

    public List<CalendarResponseDto> getCalendarList(){
        return calendarRepository.getCalendarList();
    }

    public CalendarResponseDto getCalendarData(Long id){
        return calendarRepository.getCalendarData(id);
    }
}
