package com.webAvance.backendProject.candidate.Repository;

import com.webAvance.backendProject.candidate.Models.favoris_Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface favCompRepository extends JpaRepository<favoris_Company, Long> {

}
