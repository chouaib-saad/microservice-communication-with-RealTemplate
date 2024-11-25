package com.webAvance.backendProject.candidate.Contoller;


import com.webAvance.backendProject.candidate.Models.favoris_Company;
import com.webAvance.backendProject.candidate.Service.favCompService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/fav_company")
public class Fav_CompanyController {
    @Autowired
    favCompService favCompService;



    @GetMapping("/all")
    public List<favoris_Company> getAllFav(){
        return favCompService.getAll();
    }
    @GetMapping("/{id}")
    public favoris_Company getOneFav(@PathVariable Long id){
        return favCompService.getOne(id);
    }

    @PostMapping("/save")
    public favoris_Company saveFav(@RequestBody favoris_Company fav){
        return favCompService.add(fav);
    }



}
