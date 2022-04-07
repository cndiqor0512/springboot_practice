package com.example.springboot_practice.controller;

import com.example.springboot_practice.dto.CalendarRequestDto;
import com.example.springboot_practice.dto.CalendarResponseDto;
import com.example.springboot_practice.dto.CalendarUpdateRequestDto;
import com.example.springboot_practice.service.CalendarService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CalendarController {
    private final CalendarService calendarService;

    @GetMapping("/api/calendar")
    public List<CalendarResponseDto> getCalendarList() {
        return calendarService.getCalendarList();
    }

    @PostMapping("/api/calendar")
    public int saveCalendarData(@RequestBody CalendarRequestDto dto) {
        return calendarService.saveCalendarData(dto);
    }

    @GetMapping("/api/calendar/{calendarId}")
    public CalendarResponseDto getCalendarData(@PathVariable Long calendarId) {
        return calendarService.getCalendarData(calendarId);
    }

    @PutMapping("/api/calendar")
    public int updateCalendarData(@RequestBody CalendarUpdateRequestDto dto) {
        return calendarService.updateCalendarData(dto);
    }
}
