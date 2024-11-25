package com.webAvance.backendProject.Company.Contoller;


import com.webAvance.backendProject.Company.Models.favoris_Cand;
import com.webAvance.backendProject.Company.Service.favCandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/fav_cand")
public class Fav_CandController {
    @Autowired
    favCandService favCandService;



    @GetMapping("/all")
    public List<favoris_Cand> getAllFav(){
        return favCandService.getAll();
    }
    @GetMapping("/{id}")
    public favoris_Cand getOneFav(@PathVariable Long id){
        return favCandService.getOne(id);
    }

    @PostMapping("/save")
    public favoris_Cand saveFav(@RequestBody favoris_Cand fav){
        return favCandService.add(fav);
    }



}
