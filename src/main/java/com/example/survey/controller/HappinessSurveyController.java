package com.example.survey.controller;

import com.example.survey.model.HappinessSurvey;
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
public class HappinessSurveyController {
    @Autowired
    private FootballSurveyService footballSurveyService;
    @Autowired
    private HappinessSurveyService happinessSurveyService;

    @GetMapping("/happinessSurvey")
    public String showHappinessSurvey(HappinessSurvey happinessSurvey){
        return "add-happiness-survey";
    }
    @PostMapping("/addHappinessSurvey")
    public String addHappinessSurvey(HappinessSurvey happinessSurvey, BindingResult result,Model model){
        if(result.hasErrors()){
            return "add-happiness-survey";
        }
        happinessSurveyService.saveHappinessSurvey(happinessSurvey);
        return "redirect:/indexHappinessSurvey";
    }
    @GetMapping("/indexHappinessSurvey")
    public String showHappinessSurveyList(Model model){
        model.addAttribute("averageHappiness",happinessSurveyService.calculateHappinessRate());
        model.addAttribute("happinessSurveyList",happinessSurveyService.findAll());
        model.addAttribute("footballSurveyList",footballSurveyService.findAll());
        return "index";
    }
    @GetMapping("/editHappinessSurvey/{id}")
    public String showHappinessSurvey(@PathVariable("id") long id,Model model){
        HappinessSurvey happinessSurvey=happinessSurveyService.findById(id);
        model.addAttribute("happinessSurvey",happinessSurvey);
        return "update-happiness-survey";
    }
    @PostMapping("/updateHappinessSurvey/{id}")
    public String updateHappinessSurvey(@PathVariable("id") long id,HappinessSurvey happinessSurvey,
                                        BindingResult result){
        if(result.hasErrors()){
            happinessSurvey.setId(id);
            return "update-happiness-survey";
        }
        happinessSurveyService.saveHappinessSurvey(happinessSurvey);
        return "redirect:/indexHappinessSurvey";
    }
    @GetMapping("/deleteHappinessSurvey/{id}")
    public String deleteHappinessSurvey(@PathVariable("id") long id){
        happinessSurveyService.delete(id);
        return "redirect:/indexHappinessSurvey";
    }

}
