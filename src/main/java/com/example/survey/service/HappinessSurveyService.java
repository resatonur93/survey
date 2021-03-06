package com.example.survey.service;

import com.example.survey.model.HappinessSurvey;
import com.example.survey.repository.HappinessSurveyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.OptionalDouble;

@Service
public class HappinessSurveyService {
    @Autowired
    private HappinessSurveyRepository happinessSurveyRepository;

    public HappinessSurvey saveHappinessSurvey(HappinessSurvey happinessSurvey){
        return happinessSurveyRepository.save(happinessSurvey);
    }
    public HappinessSurvey findById(long id){
        return happinessSurveyRepository.findById(id)
                .orElseThrow(()->new IllegalArgumentException("Girilen id geçersiz." +id));
    }
    public List<HappinessSurvey> findAll(){
        return happinessSurveyRepository.findAll();
    }

    public void delete(long id){
        HappinessSurvey happinessSurvey = happinessSurveyRepository.findById(id)
                .orElseThrow(()-> new IllegalArgumentException("Girilen id geçersiz." +id));
        happinessSurveyRepository.delete(happinessSurvey);
    }
    public double calculateHappinessRate() {
        List<HappinessSurvey> happinessSurveyList = this.findAll();
        return !happinessSurveyList.isEmpty() ? happinessSurveyList.stream().
                mapToDouble(HappinessSurvey::getRate).average().getAsDouble() : 0.0;
    }
}
