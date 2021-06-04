package com.example.survey.repository;

import com.example.survey.model.FootballSurvey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FootballSurveyRepository extends JpaRepository<FootballSurvey,Long> {
}
