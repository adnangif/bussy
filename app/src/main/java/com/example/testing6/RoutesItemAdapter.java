package com.example.testing6;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.textview.MaterialTextView;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RoutesItemAdapter  extends RecyclerView.Adapter<RoutesItemAdapter.ViewHolder> {



    private List<Route> routeList = new ArrayList<>();

    public void setRouteList(List<Route> routeList) {
        this.routeList = routeList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.routes_item_view,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.routes_item_title.setText(routeList.get(position).title);

    }

    @Override
    public int getItemCount() {
        return routeList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        MaterialTextView routes_item_title;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            routes_item_title = itemView.findViewById(R.id.title_of_route);


        }
    }
}
