package com.photoapp.api.users.photoappapiusers.ui.models;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserDto implements Serializable {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String encryptedPassword;
    private String userId;
    private static final long serialVersionUID = 5945913988825211544L;
}
