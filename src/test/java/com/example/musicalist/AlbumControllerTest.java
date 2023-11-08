package com.example.musicalist;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;


@SpringBootTest
@AutoConfigureMockMvc
public class AlbumControllerTest {

    @Autowired
    private MockMvc mockMvc;

    //Tets agregar album
    @Test
    public void testAgregar() throws Exception {
        String jsonPayload = "{\n" + 
            "\"id\": 1,\n" + 
            "\"nombre\": \"Rock\",\n" + 
            "\"descripcion\": \"Genero musical que se caracteriza por la utilizacion de guitarras electricas, bateria y bajo\"\n" + 
            "}";
        mockMvc.perform(MockMvcRequestBuilders
                .post("/Album/Agregar")
                .contentType(MediaType.APPLICATION_JSON)
                .content(jsonPayload))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }
    
}