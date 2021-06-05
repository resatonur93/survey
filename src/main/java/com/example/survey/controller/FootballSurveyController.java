package com.example.survey.controller;

import com.example.survey.model.FootballSurvey;
import com.example.survey.service.FootballSurveyService;
import com.example.survey.service.HappinessSurveyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FootballSurveyController {
    @Autowired
    private FootballSurveyService footballSurveyService;
    @Autowired
    private HappinessSurveyService happinessSurveyService;


    @GetMapping("/footballSurvey")
    public String showFootballSurvey(FootballSurvey footballSurvey){

        return "add-football-survey";
    }
    @PostMapping("/addFootballSurvey")
    public String addFootballSurvey(FootballSurvey footballSurvey, BindingResult result,Model model){
        if(result.hasErrors()){
            return "add-football-survey";
        }
        footballSurveyService.saveFootballSurvey(footballSurvey);
        return "redirect:/indexFootballSurvey";
    }

    @GetMapping("/indexFootballSurvey")
    public String showFootballSurveyList(Model model){
        model.addAttribute("footballSurveyList",footballSurveyService.findAll());
        model.addAttribute("happinessSurveyList",happinessSurveyService.findAll());
        return "index";
    }
    @GetMapping("/editFootballSurvey/{id}")
    public String showFootballSurvey(@PathVariable("id") long id, Model model){
        FootballSurvey footballSurvey = footballSurveyService.findById(id);
        model.addAttribute("footballSurvey",footballSurvey);
        return "update-football-survey";
    }
    @PostMapping("/updateFootballSurvey/{id}")
    public String updateFootballSurvey(@PathVariable("id")long id,FootballSurvey footballSurvey,
                                       BindingResult result,Model model){
        if (result.hasErrors()) {
            footballSurvey.setId(id);
            return "update-football-survey";
        }
        footballSurveyService.saveFootballSurvey(footballSurvey);
        return "redirect:/indexFootballSurvey";
    }
    @GetMapping("/deleteFootballSurvey/{id}")
    public String deleteFootballSurvey(@PathVariable("id")long id){
        footballSurveyService.delete(id);
        return "redirect:/indexFootballSurvey";
    }

}
