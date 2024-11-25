package com.webAvance.backendProject.Company.Contoller;


import com.webAvance.backendProject.Company.Models.Company;
import com.webAvance.backendProject.Company.Service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/companies")
public class CompanyController {
    @Autowired
    private CompanyService CompanyService;



    @GetMapping("/all")
    public List<Company> getAllCompanies(){
        return CompanyService.getAll();
    }
    @GetMapping("/{id}")
    public Company getOneCampany(@PathVariable Long id){
        return CompanyService.getOne(id);
    }

    @PostMapping("/save")
    public Company saveCompany(@RequestBody Company comp){
        return CompanyService.add(comp);
    }

    @PutMapping("/update/{id}")
    public Company updateCompany(@PathVariable Long id, @RequestBody Company comp) {
      return CompanyService.update(id, comp);
    }


}
