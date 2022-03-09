package com.example.springboot_practice.service;

import com.example.springboot_practice.domain.Notice;
import com.example.springboot_practice.repository.NoticeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class NoticeService {
    private final NoticeRepository noticeRepository;

    public List<Notice> getNoticeList(){
        return noticeRepository.getNoticeList();
    }
    public Notice getNoticeData(Long noticeId){
        return noticeRepository.getNoticeData(noticeId);
    }
}
