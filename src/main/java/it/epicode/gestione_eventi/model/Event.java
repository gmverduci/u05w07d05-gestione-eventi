package it.epicode.gestione_eventi.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.Fetch;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "events")
@Data
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String description;
    private String location;
    private int maxPartecipants;
    private LocalDate date;
    @ManyToMany(mappedBy = "events")
    @JsonIgnore
    private List<User> users;
}
