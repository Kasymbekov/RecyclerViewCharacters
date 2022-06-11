package com.example.recyclerviewcharacters;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<String> characters, abilities;
    private int[] images = {R.drawable.batman, R.drawable.ironman, R.drawable.spiderman, R.drawable.flash, R.drawable.superman, R.drawable.thor, R.drawable.america, R.drawable.hulk, R.drawable.antman,
            R.drawable.vision, R.drawable.doctor, R.drawable.thanos};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        characters = new ArrayList<>();
        abilities = new ArrayList<>();
        createData(characters, abilities);

        recyclerView = findViewById(R.id.recyclerview);
        CharacterAdapter characterAdapter = new CharacterAdapter(characters, abilities, images);
        recyclerView.setAdapter(characterAdapter);
    }

    private void createData(ArrayList<String> characters, ArrayList<String> abilities) {
        characters.add("Batman");
        characters.add("Iron-Man");
        characters.add("Spider-Man");
        characters.add("Flash");
        characters.add("Superman");
        characters.add("Thor");
        characters.add("Captain America");
        characters.add("Hulk");
        characters.add("Ant-Man");
        characters.add("Vision");
        characters.add("Doctor Strange");
        characters.add("Thanos");

        abilities.add("MONEY");
        abilities.add("INTELLIGENCE");
        abilities.add("SPIDERWEB");
        abilities.add("SPEED");
        abilities.add("POWER");
        abilities.add("HAMMER");
        abilities.add("SHIELD");
        abilities.add("POWER");
        abilities.add("SIZE");
        abilities.add("COMPUTER BRAIN");
        abilities.add("MANIPULATION");
        abilities.add("SUPERHUMAN POWER");
    }
}