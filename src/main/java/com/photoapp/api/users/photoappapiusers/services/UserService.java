package com.photoapp.api.users.photoappapiusers.services;

import com.photoapp.api.users.photoappapiusers.ui.models.UserDto;

public interface UserService {
    UserDto createUser(UserDto userDetails);
}
