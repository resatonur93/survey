package com.example.survey.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class HappinessSurvey extends Survey{

    @Column(name = "rate")
    private int rate;

    @Column(name = "happiest_thing")
    private String happiestThing;

    @Column(name = "most_dissappointing_thing")
    private String mostDisappointingThing;
}
