package org.example.springboot.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Setter
@Getter
public class AddUserRequest {
    private String email;
    private String password;
}