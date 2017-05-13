package com.openlab.pokedex;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Bryam Soto on 13/05/2017.
 */

public class DetalleActivity extends AppCompatActivity{

    private ImageView imgPokemon;
    private TextView nombrePokemon, tipoPokemon, vidaPokemon, ataquePokemon;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        imgPokemon = (ImageView) findViewById(R.id.tv_pokemon_imagen);
        nombrePokemon = (TextView) findViewById(R.id.tv_pokemon_nombre);
        tipoPokemon = (TextView) findViewById(R.id.tv_pokemon_tipo);
        vidaPokemon = (TextView) findViewById(R.id.tv_pokemon_vida);
        ataquePokemon = (TextView) findViewById(R.id.tv_pokemon_ataque);

    }
}
