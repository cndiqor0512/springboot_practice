package com.example.springboot_practice.controller;

import com.example.springboot_practice.dto.*;
import com.example.springboot_practice.service.NoticeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class NoticeController {
    private final NoticeService noticeService;

    @GetMapping("/api/notice")
    public List<NoticeResponseDto> getNoticeList() {
        return noticeService.getNoticeList();
    }

    @PostMapping("/api/notice")
    public int saveNoticeData(@RequestBody NoticeRequestDto dto) {
        return noticeService.saveNoticeData(dto);
    }

    @GetMapping("/api/notice/{noticeId}")
    public NoticeResponseDto getNoticeData(@PathVariable Long noticeId) {
        return noticeService.getNoticeData(noticeId);
    }

    @PutMapping("/api/notice")
    public int updateNoticeData(@RequestBody NoticeUpdateRequestDto dto){ return noticeService.updateNoticeData(dto);}

    @DeleteMapping("/api/notice")
    public int deleteNoticeData(@RequestBody NoticeDeleteRequestDto dto){ return noticeService.deleteNoticeData(dto);}
}
