package com.example.event_management.controller;

import com.example.event_management.dto.EventRequest;
import com.example.event_management.model.Event;
import com.example.event_management.service.EventService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/events")
public class EventController {
    @Autowired
    private EventService service;

    @PostMapping
    public ResponseEntity<Event> create(@Valid @RequestBody EventRequest request) {
        return new ResponseEntity<>(service.createEvent(request),
                HttpStatus.CREATED);
    }

    @GetMapping
    public List<Event> getAll() {
        return service.getAllEvents();
    }

    @GetMapping("/{id}")
    public Event getById(@PathVariable Long id) {
        return service.getEventById(id);
    }

    @PutMapping("/{id}")
    public Event update(@PathVariable Long id,
                        @RequestBody EventRequest request) {
        return service.updateEvent(id, request);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.deleteEvent(id);
        return ResponseEntity.noContent().build();
    }
}