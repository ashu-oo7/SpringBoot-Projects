package com.example.LearningSpring.Service;

import com.example.LearningSpring.Models.Alien;
import com.example.LearningSpring.Repository.AlienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlienService {

    @Autowired
    AlienRepository alienRepository;

    public List<Alien> getallAliens(){
        return alienRepository.findAll();
    }

    public Alien getAlienbyId(Integer id){
        return alienRepository.findById(id).orElse(new Alien());
    }

    public void saveAlien(Alien alien){
        alienRepository.save(alien);
    }
}
