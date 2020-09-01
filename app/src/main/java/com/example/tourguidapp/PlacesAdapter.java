package com.example.tourguidapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

class PlacesAdapter extends ArrayAdapter <Places> {

    public PlacesAdapter(@NonNull Context context, ArrayList<Places>object) {
        super(context, 0, object);    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

       View listView = convertView;
       if(listView==null){
           listView = LayoutInflater.from(getContext()).inflate(
                   R.layout.listview, parent, false); }

       Places currentPosition=getItem(position);

        TextView PlaceName = listView.findViewById(R.id.place_text_view);
        assert currentPosition != null;
        PlaceName.setText(currentPosition.getPlace_name());

        ImageView image= listView.findViewById(R.id.img);
        image.setImageResource(currentPosition.getResourceId());

        return listView; }}

