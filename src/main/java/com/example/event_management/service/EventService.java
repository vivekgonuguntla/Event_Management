package com.example.event_management.service;

import com.example.event_management.dto.EventRequest;
import com.example.event_management.model.Event;

import java.util.List;

public interface EventService {
    Event createEvent(EventRequest request);
    List<Event> getAllEvents();
    Event getEventById(Long id);
    Event updateEvent(Long id, EventRequest request);
    void deleteEvent(Long id);
}