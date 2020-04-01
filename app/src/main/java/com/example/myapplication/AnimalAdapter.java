package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AnimalAdapter extends ArrayAdapter<Animal> {

    private List<Animal> mAnimals;

    AnimalAdapter(Context context,  List<Animal> objects) {
        super(context, 0, objects);

        mAnimals = objects;
    }

    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {

        convertView = LayoutInflater.from(getContext()).inflate(R.layout.animal_list_item, parent, false);

        Animal animal = mAnimals.get(position);

        ImageView img = convertView.findViewById(R.id.animal_img);
        TextView name = convertView.findViewById(R.id.animal_name);

        name.setText(animal.getmName());
        img.setImageResource(animal.getmDrawableID());


        return convertView;
    }
}
