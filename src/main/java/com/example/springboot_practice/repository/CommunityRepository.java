package com.example.springboot_practice.repository;

import com.example.springboot_practice.dto.CommunityRequestDto;
import com.example.springboot_practice.dto.CommunityResponseDto;
import com.example.springboot_practice.dto.CommunityUpdateRequestDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CommunityRepository {
    List<CommunityResponseDto> getCommunityList();

    CommunityResponseDto getCommunityData(Long communityId);

    List<CommunityResponseDto> getCommunityLimit();

    void saveCommunityData(CommunityRequestDto dto);

    void updateCommunityData(CommunityUpdateRequestDto dto);
}
