package com.webAvance.backendProject.candidate.Contoller;

import com.webAvance.backendProject.candidate.Models.Candidate;
import com.webAvance.backendProject.candidate.Service.candidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/candidate")
public class CandidateController {
    @Autowired
    candidateService candidateService;


    @GetMapping("/all")
    public List<Candidate> getAllCoandidates(){
        return candidateService.getAll();
    }
    @GetMapping("/{id}")
    public Candidate getOneCand(@PathVariable Long id){
        return candidateService.getOne(id);
    }

    @PostMapping("/save")
    public Candidate saveCand(@RequestBody Candidate cand){
        return candidateService.saveCand(cand);
    }

    @PutMapping("/update/{id}")
    public Candidate updateCandate(@PathVariable Long id, @RequestBody Candidate cand) {
        return candidateService.update(id, cand);
    }


}
