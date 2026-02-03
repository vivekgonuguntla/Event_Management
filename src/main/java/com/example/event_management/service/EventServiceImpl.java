package com.example.event_management.service;

import com.example.event_management.dto.EventRequest;
import com.example.event_management.exception.ResourceNotFoundException;
import com.example.event_management.model.Event;
import com.example.event_management.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventServiceImpl implements EventService {
    @Autowired
    private EventRepository repository;
    public Event createEvent(EventRequest request) {
        Event e = new Event();
        e.setTitle(request.getTitle());
        e.setDescription(request.getDescription());
        e.setLocation(request.getLocation());
        e.setDate(request.getDate());
        e.setTime(request.getTime());
        return repository.save(e);
    }
    public List<Event> getAllEvents() {
        return repository.findAll();
    }
    public Event getEventById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Event not found"));
    }
    public Event updateEvent(Long id, EventRequest request) {
        Event e = getEventById(id);
        e.setTitle(request.getTitle());
        e.setDescription(request.getDescription());
        e.setLocation(request.getLocation());
        e.setDate(request.getDate());
        e.setTime(request.getTime());
        return repository.save(e);
    }
    public void deleteEvent(Long id) {
        repository.delete(getEventById(id));
    }
}
