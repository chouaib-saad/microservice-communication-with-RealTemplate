package com.webAvance.backendProject.Company.Service;

import com.webAvance.backendProject.Company.Repository.favCandRepository;
import com.webAvance.backendProject.Company.Models.favoris_Cand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class favCandService {
    @Autowired
    favCandRepository favCandRepository;

    public favCandService() {

    }

    public List<favoris_Cand> getAll() {
        return favCandRepository.findAll();
    }

    public favoris_Cand getOne(Long id) {
        return favCandRepository.findById(id).get();
    }

    public favoris_Cand add(favoris_Cand fav){
        return favCandRepository.save(fav);
    }
}