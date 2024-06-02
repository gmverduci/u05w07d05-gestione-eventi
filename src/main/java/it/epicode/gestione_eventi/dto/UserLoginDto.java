package it.epicode.gestione_eventi.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class UserLoginDto {
    @Email
    @NotBlank(message = "Please write your email.")
    private String email;
    @NotBlank(message = "Please write your password.")
    private String password;
}
