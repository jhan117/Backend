package com.example.boardstudy.domain.user.dto.User;

import com.example.boardstudy.domain.user.entity.User;
import com.example.boardstudy.domain.user.entity.UserRole;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto {
    private Long id;
    private String name;
    private UserRole role;

    public UserDto(User user) {
        this.id = user.getId();
        this.name = user.getUsername();
        this.role = user.getRole();
    }
}
