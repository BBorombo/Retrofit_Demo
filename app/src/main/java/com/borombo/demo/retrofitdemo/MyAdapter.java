package com.borombo.demo.retrofitdemo;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.borombo.demo.retrofitdemo.model.FOAASOperation;

import java.util.ArrayList;

/**
 * Created by Phantom on 24/09/2016.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>{

    private ArrayList<FOAASOperation> operations;

    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.list_operations, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyAdapter.MyViewHolder holder, int position) {
        FOAASOperation operation = operations.get(position);
        holder.display(operation);
    }

    @Override
    public int getItemCount() {
        return operations.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        private final TextView name;
        private final TextView fields;

        private FOAASOperation currentOperation;

        public MyViewHolder(View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.name);
            fields = (TextView) itemView.findViewById(R.id.fields);
        }

        public void display( FOAASOperation operation){
            currentOperation = operation;
            name.setText(operation.getName());
            fields.setText(operation.getTextField());
        }
    }
}
