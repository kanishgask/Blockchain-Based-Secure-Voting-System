VoteController.java
package com.voting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class VoteController {

    @Autowired
    VoteService service;

    @PostMapping("/vote")
    public String vote(
        @RequestParam String voterId,
        @RequestParam String candidate
    ){
        return service.castVote(
                voterId,
                candidate
        );
    }

    @GetMapping("/results")
    public Map<String,Integer> results(){
        return service.results();
    }

    @GetMapping("/validate
