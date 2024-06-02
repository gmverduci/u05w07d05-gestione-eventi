package it.epicode.gestione_eventi.dto;

import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.time.LocalDate;

@Data
public class EventDto {
    @NotBlank
    private String title;
    @NotBlank
    private String description;
    @Future(message = "You can't choose a past date.")
    private LocalDate date;
    @NotBlank
    private String location;
    @Min(value = 2, message = "Please set at least 2 partecipants.")
    private int maxPartecipants;
}
