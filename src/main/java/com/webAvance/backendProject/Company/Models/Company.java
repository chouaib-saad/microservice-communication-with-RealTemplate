package com.webAvance.backendProject.Company.Models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_comp;
    private String name_comp ;
    private  String logo;
    private  String desc_comp;

    private String loc_comp;
    private String organisation_type ;
    private String industry_type ;
    private String date_founded;
    private int size_comp;

    private String phone_comp;
    private String email_comp;
    private String website;


    public Long getId_comp() {
        return id_comp;
    }

    public void setId_comp(Long id_comp) {
        this.id_comp = id_comp;
    }

    public String getName_comp() {
        return name_comp;
    }

    public void setName_comp(String name_comp) {
        this.name_comp = name_comp;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getDesc_comp() {
        return desc_comp;
    }

    public void setDesc_comp(String desc_comp) {
        this.desc_comp = desc_comp;
    }

    public String getLoc_comp() {
        return loc_comp;
    }

    public void setLoc_comp(String loc_comp) {
        this.loc_comp = loc_comp;
    }

    public String getOrganisation_type() {
        return organisation_type;
    }

    public void setOrganisation_type(String organisation_type) {
        this.organisation_type = organisation_type;
    }

    public String getDate_founded() {
        return date_founded;
    }

    public void setDate_founded(String date_founded) {
        this.date_founded = date_founded;
    }

    public int getSize_comp() {
        return size_comp;
    }

    public void setSize_comp(int size_comp) {
        this.size_comp = size_comp;
    }

    public String getPhone_comp() {
        return phone_comp;
    }

    public void setPhone_comp(String phone_comp) {
        this.phone_comp = phone_comp;
    }

    public String getEmail_comp() {
        return email_comp;
    }

    public void setEmail_comp(String email_comp) {
        this.email_comp = email_comp;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getIndustry_type() {
        return industry_type;
    }

    public void setIndustry_type(String industry_type) {
        this.industry_type = industry_type;
    }

    public Company(){

    }

    public Company(Long id_comp, String name_comp, String logo, String desc_comp, String loc_comp, String industry_type, String organisation_type, String date_founded, int size_comp, String phone_comp, String email_comp, String website) {
        this.id_comp = id_comp;
        this.name_comp = name_comp;
        this.logo = logo;
        this.desc_comp = desc_comp;
        this.loc_comp = loc_comp;
        this.industry_type = industry_type;
        this.organisation_type = organisation_type;
        this.date_founded = date_founded;
        this.size_comp = size_comp;
        this.phone_comp = phone_comp;
        this.email_comp = email_comp;
        this.website = website;
    }

    public Company(String name_comp, String logo, String desc_comp, String loc_comp, String industry_type, String organisation_type, String date_founded, int size_comp, String phone_comp, String email_comp, String website, Long id_comp) {
        this.id_comp = id_comp;
        this.name_comp = name_comp;
        this.logo = logo;
        this.desc_comp = desc_comp;
        this.loc_comp = loc_comp;
        this.industry_type = industry_type;
        this.organisation_type = organisation_type;
        this.date_founded = date_founded;
        this.size_comp = size_comp;
        this.phone_comp = phone_comp;
        this.email_comp = email_comp;
        this.website = website;
    }
}

