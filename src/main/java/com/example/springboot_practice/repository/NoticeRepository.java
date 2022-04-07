package com.example.springboot_practice.repository;

import com.example.springboot_practice.dto.NoticeRequestDto;
import com.example.springboot_practice.dto.NoticeResponseDto;
import com.example.springboot_practice.dto.NoticeUpdateRequestDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface NoticeRepository {
    List<NoticeResponseDto> getNoticeList();

    NoticeResponseDto getNoticeData(Long noticeId);

    List<NoticeResponseDto> getNoticeLimit();

    void saveNoticeData(NoticeRequestDto dto);

    void updateNoticeData(NoticeUpdateRequestDto dto);
}
