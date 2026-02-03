package com.example.event_management;

import com.example.event_management.model.Event;
import com.example.event_management.repository.EventRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@DataJpaTest
class EventRepositoryTest {
    @Autowired
    EventRepository repo;
    @Test
    void saveEvent() {
        Event e = new Event();
        e.setTitle("Meeting");
        assertNotNull(repo.save(e));
    }
}
