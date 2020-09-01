package com.example.tourguidapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Objects;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

class AlexFragment extends Fragment {
    @Override
    public View onCreateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup container,  Bundle savedInstanceState) {


        ArrayList<Places> places = new ArrayList<>();

        places.add(new Places("Alexandaria Library",R.drawable.ma));
        places.add(new Places("Alexandaria Zoo",R.drawable.zoo));
        places.add(new Places("Stanley Bridge ",R.drawable.s));
        places.add(new Places("Al-Alameen",R.drawable.as));

        assert inflater != null;
        View rootView = inflater.inflate(R.layout.places_list, container, false);

        // Create PlaceAdapter object in current activity for data from places array
        PlacesAdapter adapter = new PlacesAdapter(Objects.requireNonNull(getActivity()),places);

        // Create ListView object in places_list.xml and set the PlaceAdapter object to it
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        // Return current View object with the data
        return rootView;


    }
}
