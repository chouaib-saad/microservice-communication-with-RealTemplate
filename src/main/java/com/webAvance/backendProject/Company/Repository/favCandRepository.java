package com.webAvance.backendProject.Company.Repository;


import com.webAvance.backendProject.Company.Models.favoris_Cand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface favCandRepository extends JpaRepository<favoris_Cand, Long> {

}
