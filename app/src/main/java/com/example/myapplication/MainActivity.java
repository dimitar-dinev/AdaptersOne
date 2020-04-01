package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Animal animal1 = new Animal("Dog", R.drawable.kanye1);
        Animal animal2 = new Animal("Cat", R.drawable.kanye2);
        Animal animal3 = new Animal("Parrot", R.drawable.kanye3);
        Animal animal4 = new Animal("Lion", R.drawable.kanye4);
        Animal animal5 = new Animal("Zebra", R.drawable.kanye1);
        Animal animal6 = new Animal("Turtle", R.drawable.kanye2);
        Animal animal7 = new Animal("Pig", R.drawable.kanye3);


        List<Animal> animalList = new ArrayList<Animal>();
        animalList.add(animal1);
        animalList.add(animal2);
        animalList.add(animal3);
        animalList.add(animal4);
        animalList.add(animal5);
        animalList.add(animal6);
        animalList.add(animal7);


        ArrayAdapter<Animal> adapter = new AnimalAdapter(this, animalList);

        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(adapter);
    }
}
