package ru.maxima.user.api_impl;

import org.springframework.stereotype.Component;
import ru.maxima.user.api.UserApi;
import ru.maxima.user.api.UserDto;

@Component
public class UserApiImpl implements UserApi {

    @Override
    public UserDto getUserById(Long id) {
        return new UserDto(id, "Example User");
    }
}