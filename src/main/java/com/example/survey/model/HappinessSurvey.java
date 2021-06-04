package com.example.survey.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class HappinessSurvey extends Survey{
    private int rate;
    private String happiestThing;
    private String mostDisappointingThing;
}
