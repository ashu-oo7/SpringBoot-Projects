package com.example.LearningSpring.Controllers;

import com.example.LearningSpring.Models.Alien;
import com.example.LearningSpring.Service.AlienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AlienController {

    @Autowired
    AlienService alienService;

    @GetMapping("/")
    public List<Alien> getAliens(){
       return alienService.getallAliens();
    }
    @GetMapping("/{id}")
    public Alien getAlienbyId(@PathVariable Integer id){
        return alienService.getAlienbyId(id);
    }

    @PostMapping("/")
    public void createAlien(@RequestBody Alien alien){
         alienService.saveAlien(alien);
    }
}
