package com.example.survey.model;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;
import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
public class Survey {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;


    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "gender")
    private String gender;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "birth_day")
    private LocalDate birthDate;

    @Column(name = "description")
    private String description;

    @Column(name = "pollster_name")
    private String pollsterName;

    @Column(name = "pollster_surname")
    private String pollsterSurname;
}
