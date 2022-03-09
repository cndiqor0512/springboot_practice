package com.example.springboot_practice.service;

import com.example.springboot_practice.domain.Community;
import com.example.springboot_practice.repository.CommunityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CommunityService {
    private final CommunityRepository communityRepository;

    public List<Community> getCommunityList(){
        return communityRepository.getCommunityList();
    }

    public Community getCommunityData(Long communityId){
        return communityRepository.getCommunityData(communityId);
    }

}
