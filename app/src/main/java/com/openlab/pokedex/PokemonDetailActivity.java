package com.openlab.pokedex;

import android.graphics.Color;
import android.os.Build;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.transition.Explode;
import android.transition.Fade;
import android.transition.Slide;
import android.widget.ImageView;
import android.widget.TextView;

public class PokemonDetailActivity extends AppCompatActivity {

    private Pokemon pokemon;
    private ImageView imgPokemon;
    private TextView tvPokemonNombre, tvPokemonTipo, tvPokemonVida, tvPokemonAtaque;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pokemon_detail);

        getIntent().getExtras().getBundle("pokemon");
        pokemon = (Pokemon) getIntent().getExtras().getSerializable("pokemon");

        imgPokemon = (ImageView) findViewById(R.id.img_pokemon);
        tvPokemonNombre = (TextView) findViewById(R.id.tv_pokemon_nombre);
        tvPokemonTipo = (TextView) findViewById(R.id.tv_pokemon_tipo);
        tvPokemonVida = (TextView) findViewById(R.id.tv_pokemon_vida);
        tvPokemonAtaque = (TextView) findViewById(R.id.tv_pokemon_ataque);

        showToolbar(pokemon.getNombre(),false);

        imgPokemon.setImageResource(pokemon.getImagen());
        tvPokemonNombre.setText(pokemon.getNombre());
        tvPokemonTipo.setText(pokemon.getTipo());
        tvPokemonVida.setText(pokemon.getVida());
        tvPokemonAtaque.setText(pokemon.getAtaque());

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setStatusBarColor(Color.TRANSPARENT);
            getWindow().setExitTransition(new Slide());
        }

    }

    public void showToolbar(String title, boolean upButton) {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(title);
        getSupportActionBar().setDisplayHomeAsUpEnabled(upButton);
        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
    }

}
