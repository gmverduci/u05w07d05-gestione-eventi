package it.epicode.gestione_eventi.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class UserDto {
    @NotBlank
    @Size(max = 30)
    private String firstName;
    @NotBlank
    @Size(max = 30)
    private String lastName;
    @Email
    @NotBlank(message = "Please write your email." )
    private String email;
    @NotBlank(message = "Please write your password." )
    private String password;
}
