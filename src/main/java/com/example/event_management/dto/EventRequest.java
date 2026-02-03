package com.example.event_management.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
public class EventRequest {
    @NotBlank
    private String title;
    private String description;
    private String location;
    private LocalDate date;
    private LocalTime time;

}
