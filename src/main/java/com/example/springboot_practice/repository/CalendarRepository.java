package com.example.springboot_practice.repository;

import com.example.springboot_practice.dto.CalendarRequestDto;
import com.example.springboot_practice.dto.CalendarResponseDto;
import com.example.springboot_practice.dto.CalendarUpdateRequestDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CalendarRepository {
    List<CalendarResponseDto> getCalendarList();

    CalendarResponseDto getCalendarData(Long id);

    List<CalendarResponseDto> getCalendarLimit();

    void saveCalendarData(CalendarRequestDto dto);

    void updateCalendarData(CalendarUpdateRequestDto dto);
}
