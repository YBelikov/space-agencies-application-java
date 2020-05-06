package com.ybelikov.spaceagencies.controllers;

import com.ybelikov.spaceagencies.domain.Agency;
import com.ybelikov.spaceagencies.repositories.AgencyRepository;
import com.ybelikov.spaceagencies.repositories.ProgramRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AgencyController {
    @Autowired
    AgencyRepository agencyRepository;

    @Autowired
    ProgramRepository programRepository;

    @RequestMapping("/agency/{id}")
    public String agency(@PathVariable  Long id, Model model){
        model.addAttribute("agency", agencyRepository.findById(id));
        model.addAttribute("programs", programRepository.findAll());
        return "agency";
    }

    @GetMapping("/agencies")
    public String agenciesList(Model model){
        model.addAttribute("agencies", agencyRepository.findAll());
        return "agencies";
    }

    @PostMapping("/agencies")
    public String addAgency(@RequestParam String name, @RequestParam String establishmentDate, Model model) {
        try {
            Agency newAgency = new Agency();
            newAgency.setName(name);
            Date newDate = new SimpleDateFormat("dd.mm.yyyy").parse(establishmentDate);
            newAgency.setEstablishmentDate(newDate);
            agencyRepository.save(newAgency);
            model.addAttribute("agency", newAgency);
            model.addAttribute("programs", programRepository.findAll());
        }catch (ParseException ex){
            System.out.println("Parse exception occured");
        }
        return "agencies";
    }

}
