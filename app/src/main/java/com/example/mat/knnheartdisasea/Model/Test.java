package com.example.mat.knnheartdisasea.Model;

/**
 * Created by mat on 13/12/17.
 */

public class Test {
    int  norm,dist,vote;
    double result;


    public Test() {

    }

    public Test(int norm, int dist, int vote) {
        this.norm = norm;
        this.dist = dist;
        this.vote = vote;
    }

    public Test(int norm, int dist, int vote, double result) {
        this.norm = norm;
        this.dist = dist;
        this.vote = vote;
        this.result = result;
    }

    public int getNorm() {
        return norm;
    }

    public void setNorm(int norm) {
        this.norm = norm;
    }

    public int getDist() {
        return dist;
    }

    public void setDist(int dist) {
        this.dist = dist;
    }

    public int getVote() {
        return vote;
    }

    public void setVote(int vote) {
        this.vote = vote;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
}
