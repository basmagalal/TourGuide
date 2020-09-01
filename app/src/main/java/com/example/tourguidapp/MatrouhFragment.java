package com.example.tourguidapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Objects;
import androidx.fragment.app.Fragment;

class MatrouhFragment extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container,  Bundle savedInstanceState) {

        ArrayList<Places> MatrouhPlace = new ArrayList<>();

        MatrouhPlace.add(new Places("Ageba",R.drawable.m1 ));
        MatrouhPlace.add(new Places("Gharam Beach",R.drawable.ghram));
        MatrouhPlace.add(new Places("Fayrouz Beach",R.drawable.fayroz));
        MatrouhPlace.add(new Places("Cleopatra Beach",R.drawable.cleo));

        View rootView = inflater.inflate(R.layout.places_list, container, false);

        // Create PlaceAdapter object in current activity for data from places array

        PlacesAdapter placeAdapter = new PlacesAdapter(Objects.requireNonNull(getActivity()),  MatrouhPlace);

        // Create ListView object in places_list.xml and set the PlaceAdapter object to it
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(placeAdapter);

        // Return current View object with the data
        return rootView;



       }







}




