package com.example.testing6;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class RoutesFragment extends Fragment {
    public RoutesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_routes, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        RecyclerView recyclerView = view.findViewById(R.id.recycler_view);

        RoutesItemAdapter routesItemAdapter = new RoutesItemAdapter();

        List<Route> routes = new ArrayList<>();

        routes.add(new Route("To Khalispur"));
        routes.add(new Route("To new market"));
        routes.add(new Route("To fulbari"));
        routes.add(new Route("To rupsa"));
        routes.add(new Route("To rupsa"));
        routes.add(new Route("To rupsa"));
        routes.add(new Route("To rupsa"));
        routes.add(new Route("To rupsa"));
        routes.add(new Route("To rupsa"));
        routes.add(new Route("To rupsa"));
        routes.add(new Route("To rupsa"));
        routes.add(new Route("To rupsa"));
        routes.add(new Route("To rupsa"));
        routes.add(new Route("To rupsa"));
        routes.add(new Route("To rupsa"));
        routes.add(new Route("To rupsa"));
        routes.add(new Route("To rupsa"));
        routes.add(new Route("To rupsa"));
        routes.add(new Route("To rupsa"));
        routes.add(new Route("To rupsa"));
        routes.add(new Route("To rupsa"));
        routes.add(new Route("To rupsa"));
        routes.add(new Route("To rupsa"));
        routes.add(new Route("To rupsa"));
        routes.add(new Route("To rupsa"));
        routes.add(new Route("To rupsa"));
        routes.add(new Route("To rupsa"));
        routes.add(new Route("To rupsa"));
        routes.add(new Route("To rupsa"));
        routes.add(new Route("To rupsa"));
        routes.add(new Route("To rupsa"));
        routes.add(new Route("To rupsa"));

        routesItemAdapter.setRouteList(routes);


        recyclerView.setAdapter(routesItemAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
    }
}