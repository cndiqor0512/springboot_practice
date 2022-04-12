package com.example.springboot_practice.controller;

import com.example.springboot_practice.dto.CommunityDeleteRequestDto;
import com.example.springboot_practice.dto.CommunityRequestDto;
import com.example.springboot_practice.dto.CommunityResponseDto;
import com.example.springboot_practice.dto.CommunityUpdateRequestDto;
import com.example.springboot_practice.service.CommunityService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CommunityController {
    private final CommunityService communityService;

    @GetMapping("/api/community")
    public List<CommunityResponseDto> getCommunityList() {
        return communityService.getCommunityList();
    }

    @PostMapping("/api/community")
    public int saveCommunityData(@RequestBody CommunityRequestDto dto) {
        return communityService.saveCommunityData(dto);
    }

    @GetMapping("/api/community/{communityId}")
    public CommunityResponseDto getCommunityData(@PathVariable Long communityId) {
        return communityService.getCommunityData(communityId);
    }

    @PutMapping("/api/community")
    public int updateCommunityData(@RequestBody CommunityUpdateRequestDto dto) {
        return communityService.updateCommunityData(dto);
    }

    @DeleteMapping("/api/community")
    public int deleteCommunityData(@RequestBody CommunityDeleteRequestDto dto){
        return communityService.deleteCommunityData(dto);
    }

}
