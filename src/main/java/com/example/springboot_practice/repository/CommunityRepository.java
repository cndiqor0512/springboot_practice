package com.example.springboot_practice.repository;

import com.example.springboot_practice.domain.Community;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CommunityRepository {
    List<Community> getCommunityList();
    Community getCommunityData(Long communityId);
}
