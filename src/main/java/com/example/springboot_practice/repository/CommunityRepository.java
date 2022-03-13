package com.example.springboot_practice.repository;

import com.example.springboot_practice.domain.Community;
import com.example.springboot_practice.dto.CommunityResponseDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CommunityRepository {
    List<CommunityResponseDto> getCommunityList();
    CommunityResponseDto getCommunityData(Long communityId);
}
