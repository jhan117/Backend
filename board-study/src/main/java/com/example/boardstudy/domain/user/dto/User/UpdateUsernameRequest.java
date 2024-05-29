package com.example.boardstudy.domain.user.dto.User;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;

@Getter
public class UpdateUsernameRequest {
    @NotBlank
    private String username;
}
