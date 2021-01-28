package com.greenfox.groottest.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.greenfox.groottest.controllers.GuardianController;
import com.greenfox.groottest.error.GrootError;
import com.greenfox.groottest.error.NoInputException;
import com.greenfox.groottest.models.Arrow;
import com.greenfox.groottest.models.Groot;
import com.greenfox.groottest.services.GrootService;
import com.greenfox.groottest.services.YonduService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(GuardianController.class)
public class GuardianControllerTest {

    @MockBean
    private GrootService grootService;
    @MockBean
    private YonduService yonduService;

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void getTranslated() throws Exception {
        String message = "bob";
        when(grootService.getTranslation(message)).thenReturn(new Groot(message));
        mockMvc.perform(get("/groot").param("message", "bob"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("received", is("bob")))
                .andExpect(jsonPath("translated", is("I am Groot!")))
                .andDo(print());
    }

    @Test
    public void getTranslatedWithoutParameter() throws Exception {
        GrootError grootError = new GrootError();
        when(grootService.getTranslation(any())).thenThrow(NoInputException.class);
        mockMvc.perform(get("/groot"))
                .andExpect(status().isBadRequest())
                .andDo(print());
    }

    @Test
    public void getSpeed() throws Exception {
        Double distance = 100.0;
        Double time = 10.0;

        when(yonduService.getSpeed(distance,time)).thenReturn(new Arrow(distance,time));
        mockMvc.perform(get("/yondu")
                .param("distance", distance.toString())
                .param("time", time.toString()))
                .andExpect(status().isOk())
                .andExpect(jsonPath("distance", is(100.0)))
                .andExpect(jsonPath("time", is(10.0)))
                .andExpect(jsonPath("speed", is( 10.0)))
                .andDo(print());
    }

    @Test
    public void getSpeedWithNull() throws Exception {
        Double distance = 100.0;
        Double time = null;

        when(yonduService.getSpeed(distance,time)).thenThrow(new NoInputException());
        mockMvc.perform(get("/yondu")
                .param("distance", distance.toString()))
                .andExpect(status().isBadRequest())
                .andExpect(jsonPath("error", is("I am Groot!")))
                .andDo(print());
    }


}
