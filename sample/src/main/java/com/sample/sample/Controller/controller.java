package com.sample.sample.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.sample.model.info;

@RestController
public class controller 
{
    @GetMapping("/welcome")
    public List<info> details()
    {
        List<info> li = new ArrayList<info>();
        info a = new info();
        a.setName("Sowjanya.K");
        a.setRegno("727722EUCS173");
        a.setCourse("BE-CSE");
        a.setHobbies("");
        a.setFavfood("");
        a.setExperiance("");
        a.setAim("");
        a.setGoal("");
        a.setQuote("");
        li.add(a); 
        return li;
    }
}
    
