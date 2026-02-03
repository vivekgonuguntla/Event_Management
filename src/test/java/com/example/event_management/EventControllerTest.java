package com.example.event_management;

import com.example.event_management.controller.EventController;
import com.example.event_management.service.EventService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;

import com.example.event_management.controller.EventController;
import com.example.event_management.service.EventService;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@WebMvcTest(EventController.class)
class EventControllerTest {
    @Autowired
    MockMvc mockMvc;
    @MockBean
    EventService service;
    @Test
    void getAllEvents() throws Exception {
        mockMvc.perform(get("/api/events"))
                .andExpect(status().isOk());
    }
}