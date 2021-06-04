package com.example.survey.repository;

import com.example.survey.model.HappinessSurvey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HappinessSurveyRepository extends JpaRepository<HappinessSurvey,Long> {
}
