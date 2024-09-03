package com.servisuygulamas.servis.controller;

import com.servisuygulamas.servis.dto.CandidateDTO;
import com.servisuygulamas.servis.model.Candidate;
import com.servisuygulamas.servis.servis.CvHavuzuClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/cv")
public class CvHavuzuClientController {

    @Autowired
    private CvHavuzuClientService cvHavuzuClientService;

    @GetMapping("/candidates/{id}")
    public Mono<CandidateDTO> getCandidate(@PathVariable Long id) {
        return cvHavuzuClientService.getCandidate(id);
    }

    @PostMapping("/candidates")
    public Mono<Candidate> createCandidate(@RequestBody Candidate candidate) {
        return cvHavuzuClientService.createCandidate(candidate);
    }

    @DeleteMapping("/candidates/{id}")
    public Mono<Void> deleteCandidate(@PathVariable String id) {
        return cvHavuzuClientService.deleteCandidate(id);
    }
    @GetMapping("/candidates")
    public Flux<CandidateDTO> getAllCandidates() {
        return cvHavuzuClientService.getAllCandidates();
    }

}
