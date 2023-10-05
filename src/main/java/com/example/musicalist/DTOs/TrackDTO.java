package com.example.musicalist.DTOs;

import java.sql.Time;

import lombok.Getter;
import lombok.Setter;

public class TrackDTO {
    @Getter @Setter
    private Long track_id;
     
    @Getter @Setter
    private String title;

    @Getter @Setter
    private Time duration;
}