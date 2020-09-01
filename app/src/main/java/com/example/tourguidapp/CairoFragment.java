package com.example.tourguidapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Objects;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

class CairoFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ArrayList<Places> places = new ArrayList<>();

        places.add(new Places("Al-Azhar Mosque",R.drawable.mosque));
        places.add(new Places("Mosque of Muhammed Ali",R.drawable.moali));
        places.add(new Places("Egyptian Museum ",R.drawable.museumegypt));
        places.add(new Places("Cairo Tower",R.drawable.tower));

        View rootView = inflater.inflate(R.layout.places_list, container, false);

        // Create PlaceAdapter object in current activity for data from places array
        PlacesAdapter placeAdapter = new PlacesAdapter(Objects.requireNonNull(getActivity()), places);

        // Create ListView object in places_list.xml and set the PlaceAdapter object to it
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(placeAdapter);

        // Return current View object with the data
        return rootView;

    }
}
