package com.example.mat.knnheartdisasea;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.example.mat.knnheartdisasea.Adapter.CustomAdapter;

import static com.example.mat.knnheartdisasea.Common.PatiensData.newPatient;
import static com.example.mat.knnheartdisasea.Common.PatiensData.patients;
import static com.example.mat.knnheartdisasea.Common.TestResult.testResult;

public class StatusActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    CustomAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_status);

        mRecyclerView = findViewById(R.id.recyclerView);
        mAdapter = new CustomAdapter(this,testResult);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}
