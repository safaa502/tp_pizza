package com.example.pizza;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // Récupérer les données transmises par l'Intent
        Intent intent = getIntent();
        String description = intent.getStringExtra("description");
        String detailsIngred = intent.getStringExtra("detailsIngred");
        String preparation = intent.getStringExtra("preparation");
        String nomProduit = intent.getStringExtra("nomProduit");
        int photo = intent.getIntExtra("imageResourceId", 0);


        // Maintenant, utilisez ces données pour afficher dans votre interface utilisateur
        TextView descriptionTextView = findViewById(R.id.descriptionTextView);
        TextView detailsIngredTextView = findViewById(R.id.detailsIngredTextView);
        TextView preparationTextView = findViewById(R.id.preparationTextView);
        TextView nomProduitTextView = findViewById(R.id.nomProduitTextView);
        ImageView imageResourceId = findViewById(R.id.imageResourceId);

        nomProduitTextView.setText(nomProduit);
        descriptionTextView.setText(description);
        detailsIngredTextView.setText(detailsIngred);
        preparationTextView.setText(preparation);
        imageResourceId.setImageResource(photo);

    }
}