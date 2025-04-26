package ru.maxima.user.service;

import org.springframework.stereotype.Service;
import ru.maxima.user.api.UserDto;

@Service
public class UserService {

    public UserDto getUserById(Long id) {
        return new UserDto(id, "Service User");
    }
}