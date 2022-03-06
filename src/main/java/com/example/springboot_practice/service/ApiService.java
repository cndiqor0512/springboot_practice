package com.example.springboot_practice.service;

import com.example.springboot_practice.domain.User;
import com.example.springboot_practice.dto.UserBoardDataResponseDto;
import com.example.springboot_practice.repository.BoardRepository;
import com.example.springboot_practice.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ApiService {
    private final BoardRepository boardRepository;
    private final UserRepository userRepository;

    public UserBoardDataResponseDto getUserBoardData(Long userId) {
        UserBoardDataResponseDto dto = new UserBoardDataResponseDto();

        User userData = userRepository.getData(userId);

        dto.setUserId(userData.getId());            //userRepository에서 Id를 가져온(get) 후, dto의 userId에 저장(set)한다.
        dto.setAddress(userData.getAddress());      //userRepository에서 Address를 가져온(get) 후, dto의 Address에 저장(set)한다.
        dto.setAge(userData.getAge());              //userRepository에서 Age를 가져온(get) 후, dto의 Age에 저장(set)한다.
        dto.setName(userData.getName());            //userRepository에서 Name을 가져온(get) 후, dto의 Name에 저장(set)한다.
        dto.setBoardData(boardRepository.getUserBoardData(userData.getId()));           //boardRepository의 boardData를 dto에 저장한다.

        return dto;         //dto 출력(userId, Address, Age, Name, boardData)
    }
}
