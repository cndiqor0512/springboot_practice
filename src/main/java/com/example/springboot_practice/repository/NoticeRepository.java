package com.example.springboot_practice.repository;

import com.example.springboot_practice.domain.Notice;
import com.example.springboot_practice.dto.NoticeResponseDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface NoticeRepository {
    List<NoticeResponseDto> getNoticeList();
    NoticeResponseDto getNoticeData(Long noticeId);

}
