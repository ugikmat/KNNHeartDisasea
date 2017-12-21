package com.example.mat.knnheartdisasea.Common;

import com.example.mat.knnheartdisasea.Model.Patient;

import java.util.ArrayList;

/**
 * Created by Mat on 12/6/17.
 */

public class PatiensData {
    public static Patient newPatient;
    public static ArrayList<Patient> patients;
    public static ArrayList<Patient> patientsSorted;
    public static ArrayList<Patient> patientsMinMaxNormalized;
    public static ArrayList<Patient> patientsZScoreNormalized;
    public static ArrayList<Patient> patientsTest;
    public static ArrayList<Patient> patientsTraining;
    public static ArrayList<Patient> choosedPatients;

    public static Patient getNewPatient() {
        return newPatient;
    }

    public static void setNewPatient(Patient newPatient) {
        PatiensData.newPatient = newPatient;
    }

    public static double getMinAge(){
        ArrayList<Patient> xPatient = new ArrayList<>();
        xPatient.addAll(get(patientsTraining));
        xPatient.add(get(newPatient));
        double minAge=xPatient.get(0).getAge();
        for(int i=0;i<xPatient.size();i++){
            if(minAge>xPatient.get(i).getAge()){
                minAge=xPatient.get(i).getAge();
            }
        }
        return minAge;
    }

    public static double getMinCp(){
        ArrayList<Patient> xPatient = new ArrayList<>();
        xPatient.addAll(get(patientsTraining));
        xPatient.add(get(newPatient));
        double minCp=xPatient.get(0).getCp();
        for(int i=0;i<xPatient.size();i++){
            if(minCp>xPatient.get(i).getCp()){
                minCp=xPatient.get(i).getCp();
            }
        }
        return minCp;
    }
    public static double getMinSex(){
        ArrayList<Patient> xPatient = new ArrayList<>();
        xPatient.addAll(get(patientsTraining));
        xPatient.add(get(newPatient));
        double minSex=xPatient.get(0).getSex();
        for(int i=0;i<xPatient.size();i++){
            if(minSex>xPatient.get(i).getSex()){
                minSex=xPatient.get(i).getSex();
            }
        }
        return minSex;
    }
    public static double getMinThresbps(){
        ArrayList<Patient> xPatient = new ArrayList<>();
        xPatient.addAll(get(patientsTraining));
        xPatient.add(get(newPatient));
        double minThresbps=xPatient.get(0).getThresbps();
        for(int i=0;i<xPatient.size();i++){
            if(minThresbps>xPatient.get(i).getThresbps()){
                minThresbps=xPatient.get(i).getThresbps();
            }
        }
        return minThresbps;
    }
    public static double getMinChol(){
        ArrayList<Patient> xPatient = new ArrayList<>();
        xPatient.addAll(get(patientsTraining));
        xPatient.add(get(newPatient));
        double minChol=xPatient.get(0).getChol();
        for(int i=0;i<xPatient.size();i++){
            if(minChol>xPatient.get(i).getChol()){
                minChol=xPatient.get(i).getChol();
            }
        }
        return minChol;
    }
    public static double getMinFbs(){
        ArrayList<Patient> xPatient = new ArrayList<>();
        xPatient.addAll(get(patientsTraining));
        xPatient.add(get(newPatient));
        double minFbs=xPatient.get(0).getFbs();
        for(int i=0;i<xPatient.size();i++){
            if(minFbs>xPatient.get(i).getFbs()){
                minFbs=xPatient.get(i).getFbs();
            }
        }
        return minFbs;
    }
    public static double getMinRestecg(){
        ArrayList<Patient> xPatient = new ArrayList<>();
        xPatient.addAll(get(patientsTraining));
        xPatient.add(get(newPatient));
        double minRestecg=xPatient.get(0).getRestecg();
        for(int i=0;i<xPatient.size();i++){
            if(minRestecg>xPatient.get(i).getRestecg()){
                minRestecg=xPatient.get(i).getRestecg();
            }
        }
        return minRestecg;
    }
    public static double getMinThalach(){
        ArrayList<Patient> xPatient = new ArrayList<>();
        xPatient.addAll(get(patientsTraining));
        xPatient.add(get(newPatient));
        double minThalach=xPatient.get(0).getThalach();
        for(int i=0;i<xPatient.size();i++){
            if(minThalach>xPatient.get(i).getThalach()){
                minThalach=xPatient.get(i).getThalach();
            }
        }
        return minThalach;
    }
    public static double getMinExang(){
        ArrayList<Patient> xPatient = new ArrayList<>();
        xPatient.addAll(get(patientsTraining));
        xPatient.add(get(newPatient));
        double minExang=xPatient.get(0).getExang();
        for(int i=0;i<xPatient.size();i++){
            if(minExang>xPatient.get(i).getExang()){
                minExang=xPatient.get(i).getExang();
            }
        }
        return minExang;
    }

    public static double getMinOldpeak(){
        ArrayList<Patient> xPatient = new ArrayList<>();
        xPatient.addAll(get(patientsTraining));
        xPatient.add(get(newPatient));
        double minOldpeak=xPatient.get(0).getOldpeak();
        for(int i=0;i<xPatient.size();i++){
            if(minOldpeak>xPatient.get(i).getOldpeak()){
                minOldpeak=xPatient.get(i).getOldpeak();
            }
        }
        return minOldpeak;
    }
    public static double getMinSlope(){
        ArrayList<Patient> xPatient = new ArrayList<>();
        xPatient.addAll(get(patientsTraining));
        xPatient.add(get(newPatient));
        double minSlope=xPatient.get(0).getSlope();
        for(int i=0;i<xPatient.size();i++){
            if(minSlope>xPatient.get(i).getSlope()){
                minSlope=xPatient.get(i).getSlope();
            }
        }
        return minSlope;
    }

    public static double getMinCa(){
        ArrayList<Patient> xPatient = new ArrayList<>();
        xPatient.addAll(get(patientsTraining));
        xPatient.add(get(newPatient));
        double minCa=xPatient.get(0).getCa();
        for(int i=0;i<xPatient.size();i++){
            if(minCa>xPatient.get(i).getCa()){
                minCa=xPatient.get(i).getCa();
            }
        }
        return minCa;
    }
    public static double getMinThal(){
        ArrayList<Patient> xPatient = new ArrayList<>();
        xPatient.addAll(get(patientsTraining));
        xPatient.add(get(newPatient));
        double minThal=xPatient.get(0).getThal();
        for(int i=0;i<xPatient.size();i++){
            if(minThal>xPatient.get(i).getThal()){
                minThal=xPatient.get(i).getThal();
            }
        }
        return minThal;
    }

    public static double getMaxAge(){
        ArrayList<Patient> xPatient = new ArrayList<>();
        xPatient.addAll(get(patientsTraining));
        xPatient.add(get(newPatient));
        double maxAge=xPatient.get(0).getAge();
        for(int i=0;i<xPatient.size();i++){
            if(maxAge<xPatient.get(i).getAge()){
                maxAge=xPatient.get(i).getAge();
            }
        }
        return maxAge;
    }

    public static double getMaxCp(){
        ArrayList<Patient> xPatient = new ArrayList<>();
        xPatient.addAll(get(patientsTraining));
        xPatient.add(get(newPatient));
        double maxCp=xPatient.get(0).getCp();
        for(int i=0;i<xPatient.size();i++){
            if(maxCp<xPatient.get(i).getCp()){
                maxCp=xPatient.get(i).getCp();
            }
        }
        return maxCp;
    }
    public static double getMaxSex(){
        ArrayList<Patient> xPatient = new ArrayList<>();
        xPatient.addAll(get(patientsTraining));
        xPatient.add(get(newPatient));
        double maxSex=xPatient.get(0).getSex();
        for(int i=0;i<xPatient.size();i++){
            if(maxSex<xPatient.get(i).getSex()){
                maxSex=xPatient.get(i).getSex();
            }
        }
        return maxSex;
    }
    public static double getMaxThresbps(){
        ArrayList<Patient> xPatient = new ArrayList<>();
        xPatient.addAll(get(patientsTraining));
        xPatient.add(get(newPatient));
        double maxThresbps=xPatient.get(0).getThresbps();
        for(int i=0;i<xPatient.size();i++){
            if(maxThresbps<xPatient.get(i).getThresbps()){
                maxThresbps=xPatient.get(i).getThresbps();
            }
        }
        return maxThresbps;
    }
    public static double getMaxChol(){
        ArrayList<Patient> xPatient = new ArrayList<>();
        xPatient.addAll(get(patientsTraining));
        xPatient.add(get(newPatient));
        double maxChol=xPatient.get(0).getChol();
        for(int i=0;i<xPatient.size();i++){
            if(maxChol<xPatient.get(i).getChol()){
                maxChol=xPatient.get(i).getChol();
            }
        }
        return maxChol;
    }
    public static double getMaxFbs(){
        ArrayList<Patient> xPatient = new ArrayList<>();
        xPatient.addAll(get(patientsTraining));
        xPatient.add(get(newPatient));
        double maxFbs=xPatient.get(0).getFbs();
        for(int i=0;i<xPatient.size();i++){
            if(maxFbs<xPatient.get(i).getFbs()){
                maxFbs=xPatient.get(i).getFbs();
            }
        }
        return maxFbs;
    }
    public static double getMaxRestecg(){
        ArrayList<Patient> xPatient = new ArrayList<>();
        xPatient.addAll(get(patientsTraining));
        xPatient.add(get(newPatient));
        double maxRestecg=xPatient.get(0).getRestecg();
        for(int i=0;i<xPatient.size();i++){
            if(maxRestecg<xPatient.get(i).getRestecg()){
                maxRestecg=xPatient.get(i).getRestecg();
            }
        }
        return maxRestecg;
    }
    public static double getMaxThalach(){
        ArrayList<Patient> xPatient = new ArrayList<>();
        xPatient.addAll(get(patientsTraining));
        xPatient.add(get(newPatient));
        double maxThalach=xPatient.get(0).getThalach();
        for(int i=0;i<xPatient.size();i++){
            if(maxThalach<xPatient.get(i).getThalach()){
                maxThalach=xPatient.get(i).getThalach();
            }
        }
        return maxThalach;
    }
    public static double getMaxExang(){
        ArrayList<Patient> xPatient = new ArrayList<>();
        xPatient.addAll(get(patientsTraining));
        xPatient.add(get(newPatient));
        double maxExang=xPatient.get(0).getExang();
        for(int i=0;i<xPatient.size();i++){
            if(maxExang<xPatient.get(i).getExang()){
                maxExang=xPatient.get(i).getExang();
            }
        }
        return maxExang;
    }
    public static double getMaxOldpeak(){
        ArrayList<Patient> xPatient = new ArrayList<>();
        xPatient.addAll(get(patientsTraining));
        xPatient.add(get(newPatient));
        double maxOldpeak=xPatient.get(0).getOldpeak();
        for(int i=0;i<xPatient.size();i++){
            if(maxOldpeak<xPatient.get(i).getOldpeak()){
                maxOldpeak=xPatient.get(i).getOldpeak();
            }
        }
        return maxOldpeak;
    }
    public static double getMaxSlope(){
        ArrayList<Patient> xPatient = new ArrayList<>();
        xPatient.addAll(get(patientsTraining));
        xPatient.add(get(newPatient));
        double maxSlope=xPatient.get(0).getSlope();
        for(int i=0;i<xPatient.size();i++){
            if(maxSlope<xPatient.get(i).getSlope()){
                maxSlope=xPatient.get(i).getSlope();
            }
        }
        return maxSlope;
    }

    public static double getMaxCa(){
        ArrayList<Patient> xPatient = new ArrayList<>();
        xPatient.addAll(get(patientsTraining));
        xPatient.add(get(newPatient));
        double maxCa=xPatient.get(0).getCa();
        for(int i=0;i<xPatient.size();i++){
            if(maxCa<xPatient.get(i).getCa()){
                maxCa=xPatient.get(i).getCa();
            }
        }
        return maxCa;
    }
    public static double getMaxThal(){
        ArrayList<Patient> xPatient = new ArrayList<>();
        xPatient.addAll(get(patientsTraining));
        xPatient.add(get(newPatient));
        double maxThal=xPatient.get(0).getThal();
        for(int i=0;i<xPatient.size();i++){
            if(maxThal<xPatient.get(i).getThal()){
                maxThal=xPatient.get(i).getThal();
            }
        }
        return maxThal;
    }

    public static double getAllAge(){
        ArrayList<Patient> xPatient = new ArrayList<>();
        xPatient.addAll(get(patientsTraining));
        xPatient.add(get(newPatient));
        double age=0;
        for(Patient patient:xPatient){
            age+=patient.getAge();
        }
        return age;
    }

    public static double getAllPowAge(){
        ArrayList<Patient> xPatient = new ArrayList<>();
        xPatient.addAll(get(patientsTraining));
        xPatient.add(get(newPatient));
        double age=0;
        for(Patient patient:xPatient){
            age+=Math.pow(patient.getAge(),2);
        }
        return age;
    }

    public static double getMeanAge(){
        ArrayList<Patient> xPatient = new ArrayList<>();
        xPatient.addAll(get(patientsTraining));
        xPatient.add(get(newPatient));
        double age=0;
        for(Patient patient:xPatient){
            age+=patient.getAge();
        }
        return (age/(patientsTraining.size()+1));
    }

    public static double standartDeviasiAge(){
        double sd=0;
        sd=Math.sqrt(Math.abs((getAllPowAge()-Math.pow(getAllAge(),2))/(patientsTraining.size()+1)));
        return sd;
    }

    public static double getAllSex(){
        ArrayList<Patient> xPatient = new ArrayList<>();
        xPatient.addAll(get(patientsTraining));
        xPatient.add(get(newPatient));
        double Sex=0;
        for(Patient patient:xPatient){
            Sex+=patient.getSex();
        }
        return Sex;
    }

    public static double getAllPowSex(){
        ArrayList<Patient> xPatient = new ArrayList<>();
        xPatient.addAll(get(patientsTraining));
        xPatient.add(get(newPatient));
        double Sex=0;
        for(Patient patient:xPatient){
            Sex+=Math.pow(patient.getSex(),2);
        }
        return Sex;
    }

    public static double getMeanSex(){
        ArrayList<Patient> xPatient = new ArrayList<>();
        xPatient.addAll(get(patientsTraining));
        xPatient.add(get(newPatient));
        double Sex=0;
        for(Patient patient:xPatient){
            Sex+=patient.getSex();
        }
        return (Sex/(patientsTraining.size()+1));
    }

    public static double standartDeviasiSex(){
        double sd=0;
        sd=Math.sqrt(Math.abs(getAllPowSex()-Math.pow(getAllSex(),2))/(patientsTraining.size()+1));
        return sd;
    }

    public static double getAllCp(){
        ArrayList<Patient> xPatient = new ArrayList<>();
        xPatient.addAll(get(patientsTraining));
        xPatient.add(get(newPatient));
        double Cp=0;
        for(Patient patient:xPatient){
            Cp+=patient.getCp();
        }
        return Cp;
    }

    public static double getAllPowCp(){
        ArrayList<Patient> xPatient = new ArrayList<>();
        xPatient.addAll(get(patientsTraining));
        xPatient.add(get(newPatient));
        double Cp=0;
        for(Patient patient:xPatient){
            Cp+=Math.pow(patient.getCp(),2);
        }
        return Cp;
    }

    public static double getMeanCp(){
        ArrayList<Patient> xPatient = new ArrayList<>();
        xPatient.addAll(get(patientsTraining));
        xPatient.add(get(newPatient));
        double Cp=0;
        for(Patient patient:xPatient){
            Cp+=patient.getCp();
        }
        return (Cp/(patientsTraining.size()+1));
    }

    public static double standartDeviasiCp(){
        ArrayList<Patient> xPatient = new ArrayList<>();
        xPatient.addAll(get(patientsTraining));
        xPatient.add(get(newPatient));
        double sd=0;
        sd=Math.sqrt(Math.abs(getAllPowCp()-Math.pow(getAllCp(),2))/(patientsTraining.size()+1));
        return sd;
    }

    public static double getAllThresbps(){
        ArrayList<Patient> xPatient = new ArrayList<>();
        xPatient.addAll(get(patientsTraining));
        xPatient.add(get(newPatient));
        double Thresbps=0;
        for(Patient patient:xPatient){
            Thresbps+=patient.getThresbps();
        }
        return Thresbps;
    }

    public static double getAllPowThresbps(){
        ArrayList<Patient> xPatient = new ArrayList<>();
        xPatient.addAll(get(patientsTraining));
        xPatient.add(get(newPatient));
        double Thresbps=0;
        for(Patient patient:xPatient){
            Thresbps+=Math.pow(patient.getThresbps(),2);
        }
        return Thresbps;
    }

    public static double getMeanThresbps(){
        ArrayList<Patient> xPatient = new ArrayList<>();
        xPatient.addAll(get(patientsTraining));
        xPatient.add(get(newPatient));
        double Thresbps=0;
        for(Patient patient:xPatient){
            Thresbps+=patient.getThresbps();
        }
        return (Thresbps/(patientsTraining.size()+1));
    }

    public static double standartDeviasiThresbps(){
        ArrayList<Patient> xPatient = new ArrayList<>();
        xPatient.addAll(get(patientsTraining));
        xPatient.add(get(newPatient));
        double sd=0;
        sd=Math.sqrt(Math.abs(getAllPowThresbps()-Math.pow(getAllThresbps(),2))/(patientsTraining.size()+1));
        return sd;
    }

    public static double getAllChol(){
        ArrayList<Patient> xPatient = new ArrayList<>();
        xPatient.addAll(get(patientsTraining));
        xPatient.add(get(newPatient));
        double Chol=0;
        for(Patient patient:xPatient){
            Chol+=patient.getChol();
        }
        return Chol;
    }

    public static double getAllPowChol(){
        ArrayList<Patient> xPatient = new ArrayList<>();
        xPatient.addAll(get(patientsTraining));
        xPatient.add(get(newPatient));
        double Chol=0;
        for(Patient patient:xPatient){
            Chol+=Math.pow(patient.getChol(),2);
        }
        return Chol;
    }

    public static double getMeanChol(){
        ArrayList<Patient> xPatient = new ArrayList<>();
        xPatient.addAll(get(patientsTraining));
        xPatient.add(get(newPatient));
        double Chol=0;
        for(Patient patient:xPatient){
            Chol+=patient.getChol();
        }
        return (Chol/(patientsTraining.size()+1));
    }

    public static double standartDeviasiChol(){
        double sd=0;
        double powX,x,tSize,top;
        powX=getAllPowChol();
        x=getAllChol();
        tSize=patientsTraining.size()+1;
        top=(getAllPowChol()-Math.pow(getAllChol(),2));
        sd=Math.sqrt(Math.abs(getAllPowChol()-Math.pow(getAllChol(),2))/(patientsTraining.size()+1));
        return sd;
    }

    public static double getAllFbs(){
        ArrayList<Patient> xPatient = new ArrayList<>();
        xPatient.addAll(get(patientsTraining));
        xPatient.add(get(newPatient));
        double Fbs=0;
        for(Patient patient:xPatient){
            Fbs+=patient.getFbs();
        }
        return Fbs;
    }

    public static double getAllPowFbs(){
        ArrayList<Patient> xPatient = new ArrayList<>();
        xPatient.addAll(get(patientsTraining));
        xPatient.add(get(newPatient));
        double Fbs=0;
        for(Patient patient:xPatient){
            Fbs+=Math.pow(patient.getFbs(),2);
        }
        return Fbs;
    }

    public static double getMeanFbs(){
        ArrayList<Patient> xPatient = new ArrayList<>();
        xPatient.addAll(get(patientsTraining));
        xPatient.add(get(newPatient));
        double Fbs=0;
        for(Patient patient:xPatient){
            Fbs+=patient.getFbs();
        }
        return (Fbs/(patientsTraining.size()+1));
    }

    public static double standartDeviasiFbs(){
        double sd=0;
        sd=Math.sqrt(Math.abs(getAllPowFbs()-Math.pow(getAllFbs(),2))/(patientsTraining.size()+1));
        return sd;
    }

    public static double getAllRestecg(){
        ArrayList<Patient> xPatient = new ArrayList<>();
        xPatient.addAll(get(patientsTraining));
        xPatient.add(get(newPatient));
        double Restecg=0;
        for(Patient patient:xPatient){
            Restecg+=patient.getRestecg();
        }
        return Restecg;
    }

    public static double getAllPowRestecg(){
        ArrayList<Patient> xPatient = new ArrayList<>();
        xPatient.addAll(get(patientsTraining));
        xPatient.add(get(newPatient));
        double Restecg=0;
        for(Patient patient:xPatient){
            Restecg+=Math.pow(patient.getRestecg(),2);
        }
        return Restecg;
    }

    public static double getMeanRestecg(){
        ArrayList<Patient> xPatient = new ArrayList<>();
        xPatient.addAll(get(patientsTraining));
        xPatient.add(get(newPatient));
        double Restecg=0;
        for(Patient patient:xPatient){
            Restecg+=patient.getRestecg();
        }
        return (Restecg/(patientsTraining.size()+1));
    }

    public static double standartDeviasiRestecg(){

        double sd=0;
        sd=Math.sqrt(Math.abs(getAllPowRestecg()-Math.pow(getAllRestecg(),2))/(patientsTraining.size()+1));
        return sd;
    }

    public static double getAllThalach(){
        ArrayList<Patient> xPatient = new ArrayList<>();
        xPatient.addAll(get(patientsTraining));
        xPatient.add(get(newPatient));
        double Thalach=0;
        for(Patient patient:xPatient){

            Thalach+=patient.getThalach();
        }
        return Thalach;
    }

    public static double getAllPowThalach(){
        ArrayList<Patient> xPatient = new ArrayList<>();
        xPatient.addAll(get(patientsTraining));
        xPatient.add(get(newPatient));
        double Thalach=0;
        for(Patient patient:xPatient){
            Thalach+=Math.pow(patient.getThalach(),2);
        }
        return Thalach;
    }

    public static double getMeanThalach(){
        ArrayList<Patient> xPatient = new ArrayList<>();
        xPatient.addAll(get(patientsTraining));
        xPatient.add(get(newPatient));
        double Thalach=0;
        for(Patient patient:xPatient){
            Thalach+=patient.getThalach();
        }
        return (Thalach/(patientsTraining.size()+1));
    }

    public static double standartDeviasiThalach(){
        double sd=0;
        sd=Math.sqrt(Math.abs(getAllPowThalach()-Math.pow(getAllThalach(),2))/(patientsTraining.size()+1));
        return sd;
    }

    public static double getAllExang(){
        ArrayList<Patient> xPatient = new ArrayList<>();
        xPatient.addAll(get(patientsTraining));
        xPatient.add(get(newPatient));
        double Exang=0;
        for(Patient patient:xPatient){
            Exang+=patient.getExang();
        }
        return Exang;
    }

    public static double getAllPowExang(){
        ArrayList<Patient> xPatient = new ArrayList<>();
        xPatient.addAll(get(patientsTraining));
        xPatient.add(get(newPatient));
        double Exang=0;
        for(Patient patient:xPatient){
            Exang+=Math.pow(patient.getExang(),2);
        }
        return Exang;
    }

    public static double getMeanExang(){
        ArrayList<Patient> xPatient = new ArrayList<>();
        xPatient.addAll(get(patientsTraining));
        xPatient.add(get(newPatient));
        double Exang=0;
        for(Patient patient:xPatient){
            Exang+=patient.getExang();
        }
        return (Exang/(patientsTraining.size()+1));
    }

    public static double standartDeviasiExang(){
        double sd=0;
        sd=Math.sqrt(Math.abs(getAllPowExang()-Math.pow(getAllExang(),2))/(patientsTraining.size()+1));
        return sd;
    }

    public static double getAllOldpeak(){
        ArrayList<Patient> xPatient = new ArrayList<>();
        xPatient.addAll(get(patientsTraining));
        xPatient.add(get(newPatient));
        double Oldpeak=0;
        for(Patient patient:xPatient){
            Oldpeak+=patient.getOldpeak();
        }
        return Oldpeak;
    }

    public static double getAllPowOldpeak(){
        ArrayList<Patient> xPatient = new ArrayList<>();
        xPatient.addAll(get(patientsTraining));
        xPatient.add(get(newPatient));
        double Oldpeak=0;
        for(Patient patient:xPatient){
            Oldpeak+=Math.pow(patient.getOldpeak(),2);
        }
        return Oldpeak;
    }

    public static double getMeanOldpeak(){
        ArrayList<Patient> xPatient = new ArrayList<>();
        xPatient.addAll(get(patientsTraining));
        xPatient.add(get(newPatient));
        double Oldpeak=0;
        for(Patient patient:xPatient){
            Oldpeak+=patient.getOldpeak();
        }
        return (Oldpeak/(patientsTraining.size()+1));
    }

    public static double standartDeviasiOldpeak(){
        double sd=0;
        sd=Math.sqrt(Math.abs(getAllPowOldpeak()-Math.pow(getAllOldpeak(),2))/(patientsTraining.size()+1));
        return sd;
    }

    public static double getAllSlope(){
        ArrayList<Patient> xPatient = new ArrayList<>();
        xPatient.addAll(get(patientsTraining));
        xPatient.add(get(newPatient));
        double Slope=0;
        for(Patient patient:xPatient){
            Slope+=patient.getSlope();
        }
        return Slope;
    }

    public static double getAllPowSlope(){
        ArrayList<Patient> xPatient = new ArrayList<>();
        xPatient.addAll(get(patientsTraining));
        xPatient.add(get(newPatient));
        double Slope=0;
        for(Patient patient:xPatient){
            Slope+=Math.pow(patient.getSlope(),2);
        }
        return Slope;
    }

    public static double getMeanSlope(){
        ArrayList<Patient> xPatient = new ArrayList<>();
        xPatient.addAll(get(patientsTraining));
        xPatient.add(get(newPatient));
        double Slope=0;
        for(Patient patient:xPatient){
            Slope+=patient.getSlope();
        }
        return (Slope/(patientsTraining.size()+1));
    }

    public static double standartDeviasiSlope(){
        double sd=0;
        sd=Math.sqrt(Math.abs(getAllPowSlope()-Math.pow(getAllSlope(),2))/(patientsTraining.size()+1));
        return sd;
    }

    public static double getAllCa(){
        ArrayList<Patient> xPatient = new ArrayList<>();
        xPatient.addAll(get(patientsTraining));
        xPatient.add(get(newPatient));
        double Ca=0;
        for(Patient patient:xPatient){
            Ca+=patient.getCa();
        }
        return Ca;
    }

    public static double getAllPowCa(){
        ArrayList<Patient> xPatient = new ArrayList<>();
        xPatient.addAll(get(patientsTraining));
        xPatient.add(get(newPatient));
        double Ca=0;
        for(Patient patient:xPatient){
            Ca+=Math.pow(patient.getCa(),2);
        }
        return Ca;
    }

    public static double getMeanCa(){
        ArrayList<Patient> xPatient = new ArrayList<>();
        xPatient.addAll(get(patientsTraining));
        xPatient.add(get(newPatient));
        double Ca=0;
        for(Patient patient:xPatient){
            Ca+=patient.getCa();
        }
        return (Ca/(patientsTraining.size()+1));
    }

    public static double standartDeviasiCa(){
        double sd=0;
        sd=Math.sqrt(Math.abs(getAllPowCa()-Math.pow(getAllCa(),2))/(patientsTraining.size()+1));
        return sd;
    }

    public static double getAllThal(){
        ArrayList<Patient> xPatient = new ArrayList<>();
        xPatient.addAll(get(patientsTraining));
        xPatient.add(get(newPatient));
        double Thal=0;
        for(Patient patient:xPatient){
            Thal+=patient.getThal();
        }
        return Thal;
    }

    public static double getAllPowThal(){
        ArrayList<Patient> xPatient = new ArrayList<>();
        xPatient.addAll(get(patientsTraining));
        xPatient.add(get(newPatient));
        double Thal=0;
        for(Patient patient:xPatient){
            Thal+=Math.pow(patient.getThal(),2);
        }
        return Thal;
    }

    public static double getMeanThal(){
        ArrayList<Patient> xPatient = new ArrayList<>();
        xPatient.addAll(get(patientsTraining));
        xPatient.add(get(newPatient));
        double Thal=0;
        for(Patient patient:xPatient){
            Thal+=patient.getThal();
        }
        return (Thal/(patientsTraining.size()+1));
    }

    public static double standartDeviasiThal(){
        double sd=0;
        double powX,x,tSize,top;
        powX=getAllPowThal();
        x=getAllThal();
        tSize=patientsTraining.size()+1;
        top=(getAllPowThal()-Math.pow(getAllThal(),2));
        sd=Math.sqrt(Math.abs(getAllPowThal()-Math.pow(getAllThal(),2))/(patientsTraining.size()+1));
        return sd;
    }

    public static void chooseData(){
        patientsTest = new ArrayList<>();
        patientsTraining = new ArrayList<>();

        for(int i=0;i<patients.size()*2/5;i++){
            patientsTest.add(get(patients.get(i)));
        }

        for(int i=(patients.size()*2/5);i<patients.size();i++){
            patientsTraining.add(get(patients.get(i)));
        }

    }

    public static ArrayList<Patient> get(ArrayList<Patient>patients){
        ArrayList<Patient> xPatient = new ArrayList<>();
        for(Patient patient:patients){
            xPatient.add(new Patient(patient.getAge(),patient.getSex(),patient.getCp(),patient.getThresbps(),patient.getChol(),patient.getFbs(),patient.getRestecg(),patient.getThalach(),patient.getExang(),patient.getOldpeak(),patient.getSlope(),patient.getCa(),patient.getThal(),patient.getNum(),patient.getDistance()));
        }
        return xPatient;
    }

    public static Patient get(Patient patient){
        Patient xPatient = new Patient(patient.getAge(),patient.getSex(),patient.getCp(),patient.getThresbps(),patient.getChol(),patient.getFbs(),patient.getRestecg(),patient.getThalach(),patient.getExang(),patient.getOldpeak(),patient.getSlope(),patient.getCa(),patient.getThal(),patient.getNum(),patient.getDistance());
        return xPatient;
    }
}
