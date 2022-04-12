package com.example.springboot_practice.service;

import com.example.springboot_practice.domain.Notice;
import com.example.springboot_practice.dto.NoticeDeleteRequestDto;
import com.example.springboot_practice.dto.NoticeRequestDto;
import com.example.springboot_practice.dto.NoticeResponseDto;
import com.example.springboot_practice.dto.NoticeUpdateRequestDto;
import com.example.springboot_practice.repository.NoticeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class NoticeService {
    private final NoticeRepository noticeRepository;

    public List<NoticeResponseDto> getNoticeList(){
        return noticeRepository.getNoticeList();
    }
    public NoticeResponseDto getNoticeData(Long noticeId){
        return noticeRepository.getNoticeData(noticeId);
    }
    public int saveNoticeData(NoticeRequestDto dto) {
        try {
            noticeRepository.saveNoticeData(dto);
            return 200;
        }
        catch(Exception e) {
            throw new RuntimeException();
        }
    }
    public int updateNoticeData(NoticeUpdateRequestDto dto) {
        try {
            noticeRepository.updateNoticeData(dto);
            return 300;
        }
        catch(Exception e) {
            throw new RuntimeException();
        }
    }

    public int deleteNoticeData(NoticeDeleteRequestDto dto){
        try{
            noticeRepository.deleteNoticeData(dto);
            return 400;
        }
        catch(Exception e){
            throw new RuntimeException();
        }
    }
}
