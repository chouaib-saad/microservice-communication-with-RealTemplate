package com.webAvance.backendProject.Company.Service;

import com.webAvance.backendProject.Company.Models.Company;
import com.webAvance.backendProject.Company.Repository.companyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CompanyService {
    public CompanyService(){

    }
    @Autowired
    private companyRepository companyRepository;

    public List<Company> getAll(){
        return companyRepository.findAll();
    }

    public Company getOne(Long id){
        return companyRepository.findById(id).get();
    }


    public Company add(Company comp){
        return companyRepository.save(comp);
    }


    public Company update(Long id, Company comp) {

        Company c = companyRepository.findById(id).orElseThrow(() -> new RuntimeException("Company not found"));

        if (comp.getName_comp() != null) {
            c.setName_comp(comp.getName_comp());
        }
        if (comp.getLogo() != null) {
            c.setLogo(comp.getLogo());
        }
        if (comp.getDesc_comp() != null) {
            c.setDesc_comp(comp.getDesc_comp());
        }
        if (comp.getLoc_comp() != null) {
            c.setLoc_comp(comp.getLoc_comp());
        }
        if (comp.getOrganisation_type() != null) {
            c.setOrganisation_type(comp.getOrganisation_type());
        }
        if (comp.getDate_founded() != null) {
            c.setDate_founded(comp.getDate_founded());
        }
        if (comp.getSize_comp() != 0) { // Only update if the size is not the default (0)
            c.setSize_comp(comp.getSize_comp());
        }
        if (comp.getPhone_comp() != null) {
            c.setPhone_comp(comp.getPhone_comp());
        }
        if (comp.getEmail_comp() != null) {
            c.setEmail_comp(comp.getEmail_comp());
        }
        if (comp.getWebsite() != null) {
            c.setWebsite(comp.getWebsite());
        }


        return companyRepository.save(c);
    }



}
