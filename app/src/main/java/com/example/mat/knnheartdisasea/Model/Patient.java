package com.example.mat.knnheartdisasea.Model;

/**
 * Created by Mat on 12/6/17.
 */

public class Patient {
    private double age,sex,cp,thresbps,chol,fbs,restecg,thalach,exang,oldpeak,slope,ca,thal,num;

    public double distance;

    private int gol;

    public Patient() {
    }

    public Patient(double age, double sex, double cp, double thresbps, double chol, double fbs, double restecg, double thalach, double exang, double oldpeak, double slope, double ca, double thal, double num) {
        this.age = age;
        this.sex = sex;
        this.cp = cp;
        this.thresbps = thresbps;
        this.chol = chol;
        this.fbs = fbs;
        this.restecg = restecg;
        this.thalach = thalach;
        this.exang = exang;
        this.oldpeak = oldpeak;
        this.slope = slope;
        this.ca = ca;
        this.thal = thal;
        this.num = num;
    }

    public Patient(double age, double sex, double cp, double thresbps, double chol, double fbs, double restecg, double thalach, double exang, double oldpeak, double slope, double ca, double thal, double num, double distance) {
        this.age = age;
        this.sex = sex;
        this.cp = cp;
        this.thresbps = thresbps;
        this.chol = chol;
        this.fbs = fbs;
        this.restecg = restecg;
        this.thalach = thalach;
        this.exang = exang;
        this.oldpeak = oldpeak;
        this.slope = slope;
        this.ca = ca;
        this.thal = thal;
        this.num = num;
        this.distance=distance;
    }

    public Patient(double age, double sex, double cp, double thresbps, double chol, double fbs, double restecg, double thalach, double exang, double oldpeak, double slope, double ca, double thal) {
        this.age = age;
        this.sex = sex;
        this.cp = cp;
        this.thresbps = thresbps;
        this.chol = chol;
        this.fbs = fbs;
        this.restecg = restecg;
        this.thalach = thalach;
        this.exang = exang;
        this.oldpeak = oldpeak;
        this.slope = slope;
        this.ca = ca;
        this.thal = thal;
    }


    public double getAge() {
        return age;
    }

    public double getSex() {
        return sex;
    }

    public double getCp() {
        return cp;
    }

    public double getThresbps() {
        return thresbps;
    }

    public double getChol() {
        return chol;
    }

    public double getFbs() {
        return fbs;
    }

    public double getRestecg() {
        return restecg;
    }

    public double getThalach() {
        return thalach;
    }

    public double getExang() {
        return exang;
    }

    public double getOldpeak() {
        return oldpeak;
    }

    public double getSlope() {
        return slope;
    }

    public double getCa() {
        return ca;
    }

    public double getThal() {
        return thal;
    }

    public double getNum() {
        return num;
    }

    public double getDistance() {
        return distance;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public void setSex(double sex) {
        this.sex = sex;
    }

    public void setCp(double cp) {
        this.cp = cp;
    }

    public void setThresbps(double thresbps) {
        this.thresbps = thresbps;
    }

    public void setChol(double chol) {
        this.chol = chol;
    }

    public void setFbs(double fbs) {
        this.fbs = fbs;
    }

    public void setRestecg(double restecg) {
        this.restecg = restecg;
    }

    public void setThalach(double thalach) {
        this.thalach = thalach;
    }

    public void setExang(double exang) {
        this.exang = exang;
    }

    public void setOldpeak(double oldpeak) {
        this.oldpeak = oldpeak;
    }

    public void setSlope(double slope) {
        this.slope = slope;
    }

    public void setCa(double ca) {
        this.ca = ca;
    }

    public void setThal(double thal) {
        this.thal = thal;
    }

    public void setNum(double num) {
        this.num = num;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public void setNum(float num) {
        this.num = num;
    }

    public int getGol() {
        return gol;
    }

    public void setGol(int gol) {
        this.gol = gol;
    }


}
