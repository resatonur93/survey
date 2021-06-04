package com.example.survey.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class Survey {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;

    private String surname;

    private String gender;

    @Temporal(TemporalType.DATE)
    private Date birthDate;

    private String description;

    private String pollsterName;

    private String pollsterSurname;
}
