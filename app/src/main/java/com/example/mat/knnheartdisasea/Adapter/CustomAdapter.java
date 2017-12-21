package com.example.mat.knnheartdisasea.Adapter;

/**
 * Created by Mat on 12/6/17.
 */

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mat.knnheartdisasea.Model.Patient;
import com.example.mat.knnheartdisasea.Model.Test;
import com.example.mat.knnheartdisasea.R;

import java.util.ArrayList;




public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.CustomViewHolder> {

    LayoutInflater mInflater;
    ArrayList<Test> tested;



    public CustomAdapter(Context context,ArrayList<Test> testResult){
        this.mInflater = LayoutInflater.from(context);
        this.tested = testResult;
    }


    class CustomViewHolder extends RecyclerView.ViewHolder
    {

        TextView txtNormalize,txtDistance,txtVote,textAccurate;
        CustomAdapter mAdapter;

        public CustomViewHolder(View itemView, CustomAdapter adapter) {
            super(itemView);

            txtNormalize = itemView.findViewById(R.id.textNormalize);
            txtDistance = itemView.findViewById(R.id.textDistance);
            txtVote = itemView.findViewById(R.id.textVote);
            textAccurate = itemView.findViewById(R.id.textAccurate);
            mAdapter=adapter;
        }
    }


    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = mInflater.inflate(R.layout.row,parent,false);
        return new CustomViewHolder(itemView,this);
    }

    @Override
    public void onBindViewHolder(CustomViewHolder holder, final int position) {

        holder.txtDistance.setText(tested.get(position).getDist()+"");
        holder.txtNormalize.setText(tested.get(position).getNorm()+"");
        holder.txtVote.setText(tested.get(position).getVote()+"");
        holder.textAccurate.setText(String.valueOf(tested.get(position).getResult())+"");
    }

    @Override
    public int getItemCount() {
        return tested.size();
    }
}
