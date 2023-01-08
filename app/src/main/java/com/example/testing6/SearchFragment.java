package com.example.testing6;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;

import java.util.ArrayList;
import java.util.List;

public class SearchFragment extends Fragment {

    public SearchFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_search, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        MaterialAutoCompleteTextView et_from = view.findViewById(R.id.et_start_location);
        MaterialAutoCompleteTextView et_to = view.findViewById(R.id.et_end_location);
        MaterialButton btn_search = view.findViewById(R.id.btn_search);


        List<String> locationList = new ArrayList<>();
        locationList.add("Shibbari");
        locationList.add("Fulbari");
        locationList.add("Rupsa");
        locationList.add("Rupali");
        locationList.add("Sonadanga");
        locationList.add("New Market");


        ArrayAdapter<String> adapter = new ArrayAdapter<>(requireContext(), android.R.layout.simple_list_item_1,locationList);
        et_from.setAdapter(adapter);
        et_to.setAdapter(adapter);


        btn_search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String from_string = et_from.getText().toString().trim();
                String to_string = et_to.getText().toString().trim();

                if(from_string.isEmpty() || to_string.isEmpty()){
                    Toast.makeText(requireContext(), "Invalid location!!", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}