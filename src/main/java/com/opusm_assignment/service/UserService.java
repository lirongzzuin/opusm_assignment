package com.opusm_assignment.service;

import com.opusm_assignment.dto.userDto.DubCheckRequestDto;
import com.opusm_assignment.dto.userDto.SignUpRequestDto;
import com.opusm_assignment.model.User;
import com.opusm_assignment.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Transactional
    public void signup(SignUpRequestDto requestDto) {
        if (userRepository.findByUsername(requestDto.getUsername()).isPresent()) {
            throw new IllegalArgumentException("존재하는 아이디입니다.");
        }

        User user = new User(requestDto);
        String password = passwordEncoder.encode(requestDto.getPassword());
        user.setPassword(password);
        userRepository.save(user);
    }

    public boolean dubCheck(DubCheckRequestDto requestDto) {
        return (!userRepository.findByUsername(requestDto.getUsername()).isPresent());
    }
}
