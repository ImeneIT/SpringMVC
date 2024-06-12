package com.example.SpringMvc.controller;

import com.example.SpringMvc.dto.ClubDto;
import com.example.SpringMvc.service.ClubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
@Controller
public class ClubController {
    private  ClubService clubService;

    @Autowired
    public ClubController(ClubService clubService) {
        this.clubService = clubService;
    }
    @GetMapping(value = "/clubs")
    public String listClubs(Model model){
        List<ClubDto> clubs=clubService.findAllClubs();
        model.addAttribute("clubs",clubs);
        return "clubs-list";

    }

}
