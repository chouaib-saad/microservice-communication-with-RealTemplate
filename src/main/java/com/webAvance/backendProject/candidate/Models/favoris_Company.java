package com.webAvance.backendProject.candidate.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class favoris_Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_fav_Comp;
    private Long id_cand;
    private Long id_comp;

    public favoris_Company(Long id_fav_Comp, Long id_cand, Long id_comp) {
        this.id_fav_Comp = id_fav_Comp;
        this.id_cand = id_cand;
        this.id_comp = id_comp;
    }

    public favoris_Company(Long id_favoris) {
        this.id_fav_Comp = id_favoris;
    }
    public favoris_Company(Long id_cand, Long id_comp) {
        this.id_cand = id_cand;
        this.id_comp = id_comp;
    }

    public Long getId_favoris() {
        return id_fav_Comp;
    }

    public void setId_favoris(Long id_fav_Comp) {
        this.id_fav_Comp = id_fav_Comp;
    }

    public Long getId_cand() {
        return id_cand;
    }

    public void setId_cand(Long id_cand) {
        this.id_cand = id_cand;
    }

    public Long getId_comp() {
        return id_comp;
    }

    public void setId_comp(Long id_comp) {
        this.id_comp = id_comp;
    }
}
