package com.voting;

import java.security.MessageDigest;
import java.util.Date;

public class Block {

    private int index;
    private long timestamp;
    private String voterId;
    private String candidate;
    private String previousHash;
    private String hash;
    private int nonce;

    public Block(int index,
                 String voterId,
                 String candidate,
                 String previousHash){

        this.index=index;
        this.voterId=voterId;
        this.candidate=candidate;
 this.candidate=candidate;
        this.previousHash=previousHash;
        this.timestamp=new Date().getTime();
        this.hash=mineBlock(4);
    }

    public String calculateHash(){
        String data=
                index+
                previousHash+
                timestamp+
                voterId+
                candidate+
                nonce;

        try{
            MessageDigest digest=
                    MessageDigest.getInstance("SHA-256");

            byte[] hashBytes=
                    digest.digest(data.getBytes("UTF-8"));

            StringBuilder hexString=
                    new StringBuilder();

            for(byte b: hashBytes){ this.candidate=candidate;
        this.previousHash=previousHash;
        this.timestamp=new Date().getTime();
        this.hash=mineBlock(4);
    }

    public String calculateHash(){
        String data=
                index+
                previousHash+
                timestamp+
                voterId+
                candidate+
                nonce;

        try{
            MessageDigest digest=
                    MessageDigest.getInstance("SHA-256");

            byte[] hashBytes=
                    digest.digest(data.getBytes("UTF-8"));

            StringBuilder hexString=
                    new StringBuilder();

            for(byte b: hashBytes){
 for(byte b: hashBytes){
                String hex=
                        Integer.toHexString(0xff & b);

                if(hex.length()==1)
                    hexString.append('0');

                hexString.append(hex);
            }

            return hexString.toString();
        }
        catch(Exception e){
            throw new RuntimeException(e);
        }
    }

    public String mineBlock(int difficulty){

        String target=
                new String(
                        new char[difficulty]
                ).replace('\0','0');

        while(!calculateHash().substring(
                0,difficulty
        ).equals(target)){
            nonce++;
        }

        return calculateHash();
    }

    public String getHash(){
 return hash;
    }

    public String getPreviousHash(){
        return previousHash;
    }

    public String getCandidate(){
        return candidate;
    }

    public String getVoterId(){
        return voterId;
    }
}
