package com.voting;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class VoteService {

    private List<Block> blockchain=
            new ArrayList<>();

    private Set<String> votedUsers=
            new HashSet<>();

    public VoteService(){
        createGenesisBlock();
    }

    private void createGenesisBlock(){
        Block genesis=
            new Block(
                0,
                "system",
                "none",
                "0"
            );

        blockchain.add(genesis);
    }

    public String castVote(
            String voterId,
            String candidate
    ){
