package com.opusm_assignment.dto.userDto;

import lombok.Getter;

import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;

@Getter
public class SignUpRequestDto {
    @Pattern(regexp = "^[a-zA-Z0-9]{4,11}$")
    private String username;

    @Pattern(regexp = "^(?=.*[A-Za-z])(?=.*[0-9])(?=.*[$@$!%*#?&])[A-Za-z0-9$@$!%*#?&]{4,20}$")
    private String password;

    private String nickname;

    @Email
    private String email;


}
