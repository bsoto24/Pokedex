package com.openlab.pokedex;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

/**
 * Created by Bryam Soto on 06/05/2017.
 */

public class MainActivity  extends AppCompatActivity{

    private RecyclerView rvPokemones;
    private GridLayoutManager manager;
    private PokemonAdapter adapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        rvPokemones = (RecyclerView) findViewById(R.id.rv_pokemones);
        manager = new GridLayoutManager(this, 2);
        rvPokemones.setLayoutManager(manager);
        adapter = new PokemonAdapter(getPokemones(), this);
        rvPokemones.setAdapter(adapter);

    }

    private ArrayList<Pokemon> getPokemones(){
        ArrayList<Pokemon> pokemones = new ArrayList<>();
        pokemones.add(new Pokemon("Pikachu", R.drawable.img_pikachu));
        pokemones.add(new Pokemon("Makey", R.drawable.mankey));
        pokemones.add(new Pokemon("Meowth", R.drawable.meowth));
        pokemones.add(new Pokemon("Pidget", R.drawable.pidgey));
        pokemones.add(new Pokemon("Mew", R.drawable.mew));
        return  pokemones;
    }
}
