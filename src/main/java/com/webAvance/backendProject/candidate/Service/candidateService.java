package com.webAvance.backendProject.candidate.Service;

import com.webAvance.backendProject.candidate.Models.Candidate;
import com.webAvance.backendProject.candidate.Repository.candidateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class candidateService {
    @Autowired
    candidateRepository candidateRepository;

    public candidateService(){

    }

    public List<Candidate> getAll(){
        return candidateRepository.findAll();
    }

    public Candidate getOne(Long id){
        return candidateRepository.findById(id).get();
    }

    public Candidate saveCand(Candidate cand){
        return candidateRepository.save(cand);
    }

    public Candidate update(Long id,Candidate cand) {

        Candidate c = candidateRepository.findById(id).orElseThrow(() -> new RuntimeException("Company not found"));
        if( c!= null){
            c.setFirstName_cand(cand.getFirstName_cand());
            c.setLastName_cand(cand.getLastName_cand());
            c.setImage(cand.getImage());
            c.setBiography(cand.getBiography());
            c.setEducation_level(cand.getEducation_level());
            c.setDate_birth(cand.getDate_birth());
            c.setGender(cand.getGender());
            c.setExperience(cand.getExperience());
            c.setPhone_number(cand.getPhone_number());
            c.setLocation(cand.getLocation());
            c.setEmail(cand.getEmail());
        }

        // Save the updated company back to the database
        return candidateRepository.save(c);
    }





}
