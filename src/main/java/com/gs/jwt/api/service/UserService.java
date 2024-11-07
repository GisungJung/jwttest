package com.gs.jwt.api.service;

import com.gs.jwt.api.dto.UserDto;
import com.gs.jwt.api.repo.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public void saveUser(UserDto userDto) {
        userRepository.save(userDto);
    }
}
