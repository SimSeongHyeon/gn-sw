package com.example.demo.controller;

import com.example.demo.domain.Spot;
import com.example.demo.service.SpotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class SpotController {
  private final SpotService spotService;

    @Autowired
    public SpotController(SpotService spotService) {
    this.spotService = spotService;
  }

  @GetMapping(value = "/spot")
  public String showAllSpots(Model model){
    List<Spot> allSpots = spotService.findAll();
    model.addAttribute("spots", allSpots);
    return "spot";

  }
}
