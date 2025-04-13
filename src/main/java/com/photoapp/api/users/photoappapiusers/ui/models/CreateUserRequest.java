package com.photoapp.api.users.photoappapiusers.ui.models;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateUserRequest {
    @NotNull(message = "First Name cannot be null")
    @Size(min = 2, max = 30, message = "First Name could contains from 2 to 30 letters")
    private String firstName;

    @NotNull(message = "Last Name cannot be null")
    @Size(min = 2, max = 30, message = "Last Name could contains from 2 to 30 letters")
    private String lastName;

    @NotNull(message = "First Name cannot be null")
    @Size(min = 4, max = 30, message = "Email could contains from 4 to 30 letters")
    @Email
    private String email;

    @NotNull(message = "First Name cannot be null")
    @Size(min = 8, max = 30, message = "Password could contains from 8 to 30 letters")
    private String password;
}
