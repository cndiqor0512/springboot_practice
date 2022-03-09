package com.example.springboot_practice.repository;

import com.example.springboot_practice.domain.Notice;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface NoticeRepository {
    List<Notice> getNoticeList();
    Notice getNoticeData(Long noticeId);

}
