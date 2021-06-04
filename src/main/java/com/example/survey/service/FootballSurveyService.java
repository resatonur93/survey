package com.example.survey.service;

import com.example.survey.model.FootballSurvey;
import com.example.survey.repository.FootballSurveyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FootballSurveyService {
    @Autowired
    private FootballSurveyRepository footballSurveyRepository;

    public FootballSurvey saveFootballSurvey(FootballSurvey footballSurvey){
        return footballSurveyRepository.save(footballSurvey);
    }

    public FootballSurvey findById(Long id){
        return footballSurveyRepository.findById(id)
                .orElseThrow(()-> new IllegalArgumentException("Girilen id geçersiz."));
    }

    public List<FootballSurvey> findAll(){
        return footballSurveyRepository.findAll();
    }

    public void delete(long id){
        FootballSurvey footballSurvey= footballSurveyRepository.findById(id)
                .orElseThrow(()->new IllegalArgumentException("Girilen id geçersiz."));
        footballSurveyRepository.delete(footballSurvey);
    }
}
