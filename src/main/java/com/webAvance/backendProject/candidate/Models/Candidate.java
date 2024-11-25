package com.webAvance.backendProject.candidate.Models;

import com.webAvance.backendProject.Company.Models.Job;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Candidate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_cand;

    private String firstName_cand;
    private String lastName_cand;
    private String image;
    private String biography;
    private String education_level;
    private String date_birth;
    private String notionality;
    private String gender;
    private String experience;
    private String phone_number;
    private String location;
    private String email;

    /*@OneToMany(mappedBy = "candidate")
    private List<Apply> applications;  // List of jobs the candidate has applied for

    // Getter and setter for the Apply reference


    public List<Apply> getApplications() {
        return applications;
    }

    public void setApplications(List<Apply> applications) {
        this.applications = applications;
    }*/

    // Getter and setter for the candidate properties
    public Long getId_cand() {
        return id_cand;
    }

    public void setId_cand(Long id_cand) {
        this.id_cand = id_cand;
    }

    public String getFirstName_cand() {
        return firstName_cand;
    }

    public void setFirstName_cand(String firstName_cand) {
        this.firstName_cand = firstName_cand;
    }

    public String getLastName_cand() {
        return lastName_cand;
    }

    public void setLastName_cand(String lastName_cand) {
        this.lastName_cand = lastName_cand;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }

    public String getEducation_level() {
        return education_level;
    }

    public void setEducation_level(String education_level) {
        this.education_level = education_level;
    }

    public String getDate_birth() {
        return date_birth;
    }

    public void setDate_birth(String date_birth) {
        this.date_birth = date_birth;
    }

    public String getNotionality() {
        return notionality;
    }

    public void setNotionality(String notionality) {
        this.notionality = notionality;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
