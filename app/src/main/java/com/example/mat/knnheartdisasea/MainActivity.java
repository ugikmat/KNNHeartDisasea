
package com.example.mat.knnheartdisasea;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.mat.knnheartdisasea.Common.PatiensData;
import com.example.mat.knnheartdisasea.Model.Patient;
import com.example.mat.knnheartdisasea.Model.Test;

import java.util.ArrayList;

import static com.example.mat.knnheartdisasea.Common.PatiensData.*;
import static com.example.mat.knnheartdisasea.Common.TestResult.testResult;

public class MainActivity extends AppCompatActivity {


    Button btnResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        patients = new ArrayList<>();

        testResult = new ArrayList<>();

        btnResult = findViewById(R.id.btn_result);

//        AddPatient(new Patient(32,1,1,95,0,-9,0,127,0,.7,1,-9,-9,1));
//        AddPatient(new Patient(35,1,4,-9,0,-9,1,130,1,-9,-9,-9,7,3));
//        AddPatient(new Patient(38,0,4,105,0,-9,0,166,0,2.8,1,-9,-9,2));
//        AddPatient(new Patient(43,1,4,115,0,0,0,145,1,2,2,-9,7,4));
//        AddPatient(new Patient(72,1,3,160,0,9,2,114,0,1.6,2,2,-9,0));
//        AddPatient(new Patient(60,1,4,130,0,9,1,130,1,1.1,3,1,-9,1));
        AddPatient(new Patient(	32	,	1	,	1	,	95	,	0	,	-9	,	0	,	127	,	0	,	0.7	,	1	,	-9	,	-9	,	1	)	)	;
        AddPatient(new Patient(	34	,	1	,	4	,	115	,	0	,	-9	,	-9	,	154	,	0	,	0.2	,	1	,	-9	,	-9	,	1	)	)	;
        AddPatient(new Patient(	35	,	1	,	4	,	-9	,	0	,	-9	,	0	,	130	,	1	,	-9	,	-9	,	-9	,	7	,	3	)	)	;
        AddPatient(new Patient(	36	,	1	,	4	,	110	,	0	,	-9	,	0	,	125	,	1	,	1	,	2	,	-9	,	6	,	1	)	)	;
        AddPatient(new Patient(	38	,	0	,	4	,	110	,	0	,	0	,	0	,	156	,	0	,	0	,	2	,	-9	,	3	,	1	)	)	;
        AddPatient(new Patient(	38	,	1	,	4	,	150	,	0	,	-9	,	0	,	120	,	1	,	-9	,	0	,	-9	,	3	,	1	)	)	;
        AddPatient(new Patient(	40	,	1	,	4	,	95	,	0	,	-9	,	1	,	144	,	0	,	0	,	1	,	-9	,	-9	,	2	)	)	;
        AddPatient(new Patient(	43	,	1	,	4	,	100	,	0	,	-9	,	0	,	122	,	0	,	1.5	,	3	,	-9	,	-9	,	3	)	)	;
        AddPatient(new Patient(	43	,	1	,	4	,	140	,	0	,	0	,	1	,	140	,	1	,	0.5	,	1	,	-9	,	7	,	2	)	)	;
        AddPatient(new Patient(	46	,	1	,	4	,	100	,	0	,	-9	,	1	,	133	,	0	,	-2.6	,	2	,	-9	,	-9	,	1	)	)	;
        AddPatient(new Patient(	46	,	1	,	4	,	115	,	0	,	0	,	0	,	113	,	1	,	1.5	,	2	,	-9	,	7	,	1	)	)	;
        AddPatient(new Patient(	47	,	1	,	4	,	110	,	0	,	-9	,	1	,	149	,	0	,	2.1	,	1	,	-9	,	-9	,	2	)	)	;
        AddPatient(new Patient(	48	,	1	,	4	,	115	,	0	,	-9	,	0	,	128	,	0	,	0	,	2	,	-9	,	6	,	2	)	)	;
        AddPatient(new Patient(	50	,	0	,	4	,	160	,	0	,	-9	,	0	,	110	,	0	,	0	,	-9	,	-9	,	3	,	1	)	)	;
        AddPatient(new Patient(	50	,	1	,	4	,	115	,	0	,	0	,	0	,	120	,	1	,	0.5	,	2	,	-9	,	6	,	3	)	)	;
        AddPatient(new Patient(	50	,	1	,	4	,	120	,	0	,	0	,	1	,	156	,	1	,	0	,	1	,	-9	,	6	,	3	)	)	;
        AddPatient(new Patient(	51	,	1	,	4	,	110	,	0	,	-9	,	0	,	92	,	0	,	0	,	2	,	-9	,	-9	,	4	)	)	;
        AddPatient(new Patient(	51	,	1	,	4	,	130	,	0	,	-9	,	0	,	170	,	-0.7	,	7	,	1	,	-9	,	-9	,	2	)	)	;
        AddPatient(new Patient(	51	,	1	,	4	,	140	,	0	,	0	,	0	,	60	,	0	,	0	,	2	,	-9	,	3	,	2	)	)	;
        AddPatient(new Patient(	52	,	1	,	4	,	95	,	0	,	-9	,	0	,	82	,	1	,	-9	,	-9	,	-9	,	-9	,	2	)	)	;
        AddPatient(new Patient(	53	,	1	,	2	,	120	,	0	,	0	,	0	,	95	,	0	,	0	,	2	,	-9	,	3	,	3	)	)	;
        AddPatient(new Patient(	53	,	1	,	2	,	130	,	0	,	-9	,	1	,	120	,	0	,	0.7	,	3	,	-9	,	-9	,	0	)	)	;
        AddPatient(new Patient(	53	,	1	,	3	,	105	,	0	,	0	,	0	,	115	,	0	,	0	,	2	,	-9	,	7	,	1	)	)	;
        AddPatient(new Patient(	54	,	1	,	4	,	120	,	0	,	0	,	0	,	155	,	0	,	0	,	2	,	-9	,	7	,	2	)	)	;
        AddPatient(new Patient(	54	,	1	,	4	,	180	,	0	,	-9	,	0	,	150	,	1.5	,	2	,	-9	,	1	,	7	,	1	)	)	;
        AddPatient(new Patient(	55	,	1	,	4	,	120	,	0	,	0	,	1	,	92	,	0	,	0.3	,	1	,	-9	,	7	,	4	)	)	;
        AddPatient(new Patient(	56	,	1	,	3	,	120	,	0	,	0	,	0	,	97	,	0	,	0	,	2	,	-9	,	7	,	0	)	)	;
        AddPatient(new Patient(	56	,	1	,	4	,	120	,	0	,	0	,	1	,	148	,	0	,	0	,	2	,	-9	,	-9	,	2	)	)	;
        AddPatient(new Patient(	57	,	1	,	3	,	105	,	0	,	-9	,	0	,	148	,	0	,	0.3	,	2	,	-9	,	-9	,	1	)	)	;
        AddPatient(new Patient(	57	,	1	,	4	,	140	,	0	,	-9	,	0	,	100	,	1	,	0	,	-9	,	-9	,	6	,	3	)	)	;
        AddPatient(new Patient(	57	,	1	,	4	,	160	,	0	,	-9	,	0	,	98	,	1	,	2	,	2	,	-9	,	7	,	2	)	)	;
        AddPatient(new Patient(	58	,	1	,	4	,	170	,	0	,	-9	,	1	,	105	,	1	,	0	,	-9	,	-9	,	3	,	1	)	)	;
        AddPatient(new Patient(	59	,	1	,	4	,	110	,	0	,	-9	,	0	,	94	,	0	,	0	,	-9	,	-9	,	6	,	3	)	)	;
        AddPatient(new Patient(	59	,	1	,	4	,	135	,	0	,	0	,	0	,	115	,	1	,	1	,	2	,	-9	,	7	,	1	)	)	;
        AddPatient(new Patient(	60	,	1	,	3	,	115	,	0	,	-9	,	0	,	143	,	0	,	2.4	,	1	,	-9	,	-9	,	1	)	)	;
        AddPatient(new Patient(	60	,	1	,	4	,	160	,	0	,	0	,	1	,	99	,	1	,	0.5	,	2	,	-9	,	7	,	3	)	)	;
        AddPatient(new Patient(	61	,	1	,	4	,	110	,	0	,	-9	,	0	,	113	,	0	,	1.4	,	2	,	-9	,	-9	,	1	)	)	;
        AddPatient(new Patient(	61	,	1	,	4	,	130	,	0	,	-9	,	0	,	77	,	0	,	2.5	,	2	,	-9	,	-9	,	3	)	)	;
        AddPatient(new Patient(	61	,	1	,	4	,	160	,	0	,	1	,	1	,	145	,	0	,	1	,	2	,	-9	,	7	,	2	)	)	;
        AddPatient(new Patient(	62	,	0	,	1	,	140	,	0	,	-9	,	0	,	143	,	0	,	0	,	-9	,	-9	,	3	,	2	)	)	;
        AddPatient(new Patient(	62	,	1	,	4	,	115	,	0	,	-9	,	0	,	72	,	1	,	-0.5	,	2	,	-9	,	3	,	1	)	)	;
        AddPatient(new Patient(	63	,	1	,	4	,	150	,	0	,	0	,	0	,	86	,	1	,	2	,	2	,	-9	,	-9	,	3	)	)	;
        AddPatient(new Patient(	64	,	1	,	4	,	185	,	0	,	0	,	0	,	98	,	1	,	0	,	1	,	-9	,	7	,	1	)	)	;
        AddPatient(new Patient(	65	,	1	,	4	,	145	,	0	,	-9	,	1	,	67	,	0	,	-9	,	-9	,	-9	,	6	,	3	)	)	;
        AddPatient(new Patient(	66	,	0	,	4	,	155	,	0	,	-9	,	0	,	90	,	0	,	0	,	-9	,	-9	,	7	,	1	)	)	;
        AddPatient(new Patient(	69	,	1	,	4	,	135	,	0	,	0	,	0	,	130	,	0	,	0	,	2	,	-9	,	6	,	1	)	)	;
        AddPatient(new Patient(	72	,	1	,	3	,	160	,	0	,	-9	,	2	,	114	,	0	,	1.6	,	2	,	2	,	-9	,	0	)	)	;
        AddPatient(new Patient(	73	,	0	,	3	,	160	,	0	,	0	,	1	,	121	,	0	,	0	,	1	,	-9	,	3	,	1	)	)	;
        AddPatient(new Patient(	64	,	0	,	4	,	200	,	0	,	0	,	0	,	140	,	1	,	1	,	2	,	-9	,	3	,	3	)	)	;
        AddPatient(new Patient(	65	,	1	,	4	,	115	,	0	,	0	,	0	,	93	,	1	,	0	,	2	,	-9	,	7	,	1	)	)	;
        AddPatient(new Patient(38,1,3,100,1,-9,0,179,0,-1.1,1,-9,-9,0));
//        AddPatient(new Patient(38,1,3,100,1,-9,0,179,0,-1.1,1,-9,-9,0));

        btnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final ProgressDialog mDialog = new ProgressDialog(MainActivity.this);
                mDialog.setTitle("Calculating");
                mDialog.setMessage("Mohon Tunggu Sebentar....");
                mDialog.setCancelable(false);
                mDialog.show();
                new Thread(new Runnable() {
                    public void run() {
                        try {
                            chooseData();
                            int right,left;
                            for (int norm=0;norm<2;norm++){
                                for (int dist=0;dist<2;dist++){
                                    for(int vote=0;vote<2;vote++){
                                        right=0;
                                        left=0;
                                        for(Patient testPatient:patientsTest){
                                            newPatient=get(testPatient);
                                            count(norm,dist,vote,newPatient);
                                            if(checkStatus(vote)){
                                                right++;
                                            }else{
                                                left++;
                                            }
                                        }

                                        double res=((double) right/(double)patientsTest.size())*100;
                                        testResult.add(new Test(norm,dist,vote,((double) right/(double)patientsTest.size())*100));
                                    }
                                }
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        mDialog.dismiss();
                        Intent toResult = new Intent(MainActivity.this,StatusActivity.class);
                        startActivity(toResult);

                    }
                }).start();
            }
        });


    }

    public void AddPatient(Patient patient){
        patients.add(patient);
    }

    public void count(int norm, int dist, int vote,Patient testPatien){
        if(norm==0){
            countAllDistance(norm,dist,minMaxNormalize());
        }else{
            countAllDistance(norm,dist,zScoreNormalize());
        }
        sorting(norm);
        choosedPatients = getKPatien(11);
    }


    public Patient minMaxNormalize(){
        patientsMinMaxNormalized = new ArrayList<>();
        patientsMinMaxNormalized.addAll(get(patientsTraining));
        patientsMinMaxNormalized.add(get(newPatient));
        for(int i=0;i<patientsMinMaxNormalized.size();i++){
            Patient xPatient =patientsMinMaxNormalized.get(i);
            xPatient.setAge((xPatient.getAge()-getMinAge())/(getMaxAge()-getMinAge()));
//            xPatient.setSex((xPatient.getSex()-getMinSex())/(getMaxSex()-getMinSex()));
            xPatient.setSex((xPatient.getSex()==newPatient.getSex())?0:1);
//            xPatient.setCp((xPatient.getCp()-getMinCp())/(getMaxCp()-getMinCp()));
            xPatient.setCp((xPatient.getCp()==newPatient.getCp()?0:1));
            xPatient.setThresbps((xPatient.getThresbps()-getMinThresbps())/(getMaxThresbps()-getMinThresbps()));
            xPatient.setChol((xPatient.getChol()-getMinChol())/(getMaxChol()-getMinChol()));
            xPatient.setFbs((xPatient.getFbs()-getMinFbs())/(getMaxFbs()-getMinFbs()));
            xPatient.setRestecg((xPatient.getRestecg()-getMinRestecg())/(getMaxRestecg()-getMinRestecg()));
            xPatient.setThalach((xPatient.getThalach()-getMinThalach())/(getMaxThalach()-getMinThalach()));
            xPatient.setExang((xPatient.getExang()-getMinExang())/(getMaxExang()-getMinExang()));
            xPatient.setOldpeak((xPatient.getOldpeak()-getMinOldpeak())/(getMaxOldpeak()-getMinOldpeak()));
            xPatient.setSlope((xPatient.getSlope()-getMinSlope())/(getMaxSlope()-getMinSlope()));
            xPatient.setCa((xPatient.getCa()-getMinCa())/(getMaxCa()-getMinCa()));
            xPatient.setThal((xPatient.getThal()-getMinThal())/(getMaxThal()-getMinThal()));
            patientsMinMaxNormalized.set(i,xPatient);
        }
        return get(patientsMinMaxNormalized.get(patientsMinMaxNormalized.size()-1));
    }

    public Patient zScoreNormalize(){
        patientsZScoreNormalized = new ArrayList<>();
        patientsZScoreNormalized.addAll(get(patientsTraining));
        patientsZScoreNormalized.add(get(newPatient));
        for(int i=0;i<patientsZScoreNormalized.size();i++){
            Patient xPatient =patientsZScoreNormalized.get(i);
            xPatient.setAge((xPatient.getAge()-getMeanAge())/standartDeviasiAge());
//            xPatient.setSex((xPatient.getSex()-getMeanSex())/standartDeviasiSex());
            xPatient.setSex((xPatient.getSex()==newPatient.getSex())?0:1);
//            xPatient.setCp((xPatient.getCp()-getMeanCp())/standartDeviasiCp());
            xPatient.setCp((xPatient.getCp()==newPatient.getCp()?0:1));
            xPatient.setThresbps((xPatient.getThresbps()-getMeanThresbps())/standartDeviasiThresbps());
            xPatient.setChol((xPatient.getChol()-getMeanChol())/standartDeviasiChol());
            xPatient.setFbs((xPatient.getFbs()-getMeanFbs())/standartDeviasiFbs());
            xPatient.setRestecg((xPatient.getRestecg()-getMeanRestecg())/standartDeviasiRestecg());
            xPatient.setThalach((xPatient.getThalach()-getMeanThalach())/standartDeviasiThalach());
            xPatient.setExang((xPatient.getExang()-getMeanExang())/standartDeviasiExang());
            xPatient.setOldpeak((xPatient.getOldpeak()-getMeanOldpeak())/standartDeviasiOldpeak());
            xPatient.setSlope((xPatient.getSlope()-getMeanSlope())/standartDeviasiSlope());
            xPatient.setCa((xPatient.getCa()-getMeanCa())/standartDeviasiCa());
            xPatient.setThal((xPatient.getThal()-getMeanThal())/standartDeviasiThal());
            patientsZScoreNormalized.set(i,xPatient);
        }
        return get(patientsZScoreNormalized.get(patientsZScoreNormalized.size()-1));
    }


    public void countAllDistance(int norm,int dist,Patient testPatient){
        if(dist==0){
            if(norm==0){
                for(int i=0;i<patientsMinMaxNormalized.size()-1;i++){
                    patientsMinMaxNormalized.get(i).setDistance(euclidDistance(patientsMinMaxNormalized.get(i),testPatient));
                }
            }else{
                for(int i=0;i<patientsZScoreNormalized.size()-1;i++){
                    patientsZScoreNormalized.get(i).setDistance(euclidDistance(patientsZScoreNormalized.get(i),testPatient));
                }
            }
        }else{
            if(norm==0){
                for(int i=0;i<patientsMinMaxNormalized.size()-1;i++){
                    patientsMinMaxNormalized.get(i).setDistance(manhatanDistance(patientsMinMaxNormalized.get(i),testPatient));
                }
            }else{
                for(int i=0;i<patientsZScoreNormalized.size()-1;i++){
                    patientsZScoreNormalized.get(i).setDistance(manhatanDistance(patientsZScoreNormalized.get(i),testPatient));
                }
            }
        }
    }

    public double [] voteWeight(ArrayList<Patient> kPatient){
        double [] vote = new double[5];
        for(int i=0;i<vote.length;i++){
            vote[i]=0;
            for(int j=0;j<kPatient.size();j++){
                if(kPatient.get(j).getNum()==i){
                    vote[i]+=(1/kPatient.get(j).getDistance());
                }
            }
        }
        return vote;

    }

    public double euclidDistance(Patient patienA, Patient patientB){
        double age,sex,cp,thresbps,chol,fbs,restecg,thalach,exang,oldpeak,slope,ca,thal;
        age=Math.pow((patienA.getAge()- patientB.getAge()),2);
        sex=Math.pow((patienA.getSex()- patientB.getSex()),2);
        cp=Math.pow((patienA.getCp()- patientB.getCp()),2);
        thresbps=Math.pow((patienA.getThresbps()- patientB.getThresbps()),2);
        chol=Math.pow((patienA.getChol()- patientB.getChol()),2);
        fbs=Math.pow((patienA.getFbs()- patientB.getFbs()),2);
        restecg=Math.pow((patienA.getRestecg()- patientB.getRestecg()),2);
        thalach=Math.pow((patienA.getThalach()- patientB.getThalach()),2);
        exang=Math.pow((patienA.getExang()- patientB.getExang()),2);
        oldpeak=Math.pow((patienA.getOldpeak()- patientB.getOldpeak()),2);
        slope=Math.pow((patienA.getSlope()- patientB.getSlope()),2);
        ca=Math.pow((patienA.getCa()- patientB.getCa()),2);
        thal=Math.pow((patienA.getThal()- patientB.getThal()),2);
        double euc = Math.sqrt(age+sex+cp+thresbps+chol+fbs+restecg+thalach+exang+oldpeak+slope+ca+thal);

        return euc;
    }
    public double manhatanDistance(Patient patienA, Patient patientB){
        double age,sex,cp,thresbps,chol,fbs,restecg,thalach,exang,oldpeak,slope,ca,thal;
        age=Math.abs((patienA.getAge()- patientB.getAge()));
        sex=Math.abs((patienA.getSex()- patientB.getSex()));
        cp=Math.abs((patienA.getCp()- patientB.getCp()));
        thresbps=Math.abs((patienA.getThresbps()- patientB.getThresbps()));
        chol=Math.abs((patienA.getChol()- patientB.getChol()));
        fbs=Math.abs((patienA.getFbs()- patientB.getFbs()));
        restecg=Math.abs((patienA.getRestecg()- patientB.getRestecg()));
        thalach=Math.abs((patienA.getThalach()- patientB.getThalach()));
        exang=Math.abs((patienA.getExang()- patientB.getExang()));
        oldpeak=Math.abs((patienA.getOldpeak()- patientB.getOldpeak()));
        slope=Math.abs((patienA.getSlope()- patientB.getSlope()));
        ca=Math.abs((patienA.getCa()- patientB.getCa()));
        thal=Math.abs((patienA.getThal()- patientB.getThal()));
        double man = age+sex+cp+thresbps+chol+fbs+restecg+thalach+exang+oldpeak+slope+ca+thal;

        return man;
    }

    public void sorting(int norm){
        Patient tmp;
        patientsSorted = new ArrayList<>();
        patientsSorted.addAll(get((norm==0?patientsMinMaxNormalized:patientsZScoreNormalized)));
        patientsSorted.remove(patientsSorted.size()-1);
        for(int i=0;i<patientsSorted.size();i++){
            for(int j=0;j<patientsSorted.size()-1;j++){
                if(patientsSorted.get(j).getDistance()>patientsSorted.get(j+1).getDistance()){
                    tmp=get(patientsSorted.get(j));
                    patientsSorted.set(j,get(patientsSorted.get(j+1)));
                    patientsSorted.set(j+1,get(tmp));
                }
            }
        }
        tmp =null;
    }

    public ArrayList<Patient> getKPatien(int k){
        choosedPatients = new ArrayList<>();
        ArrayList<Patient> kResult =new ArrayList<>();
        for(int a=0;a<k;a++){
            kResult.add(get(patientsSorted.get(a)));
        }
        return kResult;
    }

    public boolean checkStatus(int vote){

        ArrayList<Patient> kResult = get(choosedPatients);
        int [] gol = new int[5];

        boolean result = false;

        if(vote==0){
            for(Patient p:kResult){
                if(p.getNum()==0.0){ gol[0]++;}
                else if(p.getNum()==1.0){ gol[1]++;}
                else if(p.getNum()==2.0){ gol[2]++;}
                else if(p.getNum()==3.0){ gol[3]++;}
                else if(p.getNum()==4.0){ gol[4]++;}
            }
            double max = Math.max(gol[4],Math.max(gol[3],Math.max(gol[2],Math.max(gol[1],gol[0]))));
            if(max==gol[0]){
                if(newPatient.getNum()==0) result=true;

            }
            if(max==gol[1]){
                if(newPatient.getNum()==1) result=true;

            }
            if(max==gol[2]){
                if(newPatient.getNum()==2) result=true;

            }
            if(max==gol[3]){
                if(newPatient.getNum()==3) result=true;

            }
            if(max==gol[4]){
                if(newPatient.getNum()==4) result=true;

            }
        }else{
            double [] votes = voteWeight(kResult);
            double max = Math.max(votes[4],Math.max(votes[3],Math.max(votes[2],Math.max(votes[1],votes[0]))));

            if(max==votes[0]){
                if(newPatient.getNum()==0) result=true;

            }
            if(max==votes[1]){
                if(newPatient.getNum()==1) result=true;

            }
            if(max==votes[2]){
                if(newPatient.getNum()==2) result=true;

            }
            if(max==votes[3]){
                if(newPatient.getNum()==3) result=true;

            }
            if(max==votes[4]){
                if(newPatient.getNum()==4) result=true;

            }
        }
        return result;
    }
}
