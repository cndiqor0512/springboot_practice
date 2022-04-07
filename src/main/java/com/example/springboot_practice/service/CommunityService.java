package com.example.springboot_practice.service;

import com.example.springboot_practice.dto.CommunityRequestDto;
import com.example.springboot_practice.dto.CommunityResponseDto;
import com.example.springboot_practice.dto.CommunityUpdateRequestDto;
import com.example.springboot_practice.repository.CommunityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CommunityService {
    private final CommunityRepository communityRepository;

    public List<CommunityResponseDto> getCommunityList(){
        return communityRepository.getCommunityList();
    }

    public CommunityResponseDto getCommunityData(Long communityId){
        return communityRepository.getCommunityData(communityId);
    }

    public int saveCommunityData(CommunityRequestDto dto){
        try{
            communityRepository.saveCommunityData(dto);
            return 200;
        }
        catch(Exception e){
            throw new RuntimeException();
        }
    }

    public int updateCommunityData(CommunityUpdateRequestDto dto){
        try{
            communityRepository.updateCommunityData(dto);
            return 300;
        }
        catch(Exception e){
            throw new RuntimeException();
        }
    }

}
