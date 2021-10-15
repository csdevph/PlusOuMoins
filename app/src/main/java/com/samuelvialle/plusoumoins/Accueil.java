package com.samuelvialle.plusoumoins;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Accueil extends AppCompatActivity {
    //Vaiables globales
    Button bntPlusOuMoins;

    public void init() {
        bntPlusOuMoins = findViewById(R.id.btnPlusOuMoins);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accueil);

        init();
        bntPlusOuMoins.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // création de l'Intent (départ , destination)
                Intent intent = new Intent(Accueil.this, PlusOuMoins.class);

                String titre = bntPlusOuMoins.getText().toString();
                intent.putExtra("TitrePage", titre);

                // lancement de l'activité PlusOuMoins
                startActivity(intent);
            }
        });
    }
}