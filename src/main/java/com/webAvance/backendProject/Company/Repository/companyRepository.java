package com.webAvance.backendProject.Company.Repository;

import com.webAvance.backendProject.Company.Models.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface companyRepository extends JpaRepository<Company, Long> {


}
