package com.webAvance.backendProject.candidate.Service;

import com.webAvance.backendProject.candidate.Models.favoris_Company;
import com.webAvance.backendProject.candidate.Repository.favCompRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class favCompService {
    @Autowired
    favCompRepository favCompRepository;

    public favCompService() {

    }

    public List<favoris_Company> getAll() {
        return favCompRepository.findAll();
    }

    public favoris_Company getOne(Long id) {
        return favCompRepository.findById(id).get();
    }

    public favoris_Company add(favoris_Company fav){
        return favCompRepository.save(fav);
    }
}