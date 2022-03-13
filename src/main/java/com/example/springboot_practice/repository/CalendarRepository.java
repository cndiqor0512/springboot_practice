package com.example.springboot_practice.repository;

import com.example.springboot_practice.domain.Calendar;
import com.example.springboot_practice.dto.CalendarResponseDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CalendarRepository {
    List<CalendarResponseDto> getCalendarList();
    CalendarResponseDto getCalendarData(Long id);
}
