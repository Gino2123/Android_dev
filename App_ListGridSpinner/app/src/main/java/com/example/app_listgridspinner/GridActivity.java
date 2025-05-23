package com.example.app_listgridspinner;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Arrays;
import java.util.List;

public class GridActivity extends AppCompatActivity {

    List<String> pays = Arrays.asList("Maroc", "Burkina Faso", "Niger", "Mali", "Togo", "Côte d'ivoire",
            "Ghana", "Benin", "Gabon", "Senegal", "Mauritanie", "Cap-vert",
            "Egypte", "Tunisie", "Cameroun", "Tchad", "Rwanda", "Djibouti", "Madagascar", "Espagne", "Chine","Angola",
            "Afrique du Sud", "Éthiopie", "Kenya", "Ouganda", "Tanzanie", "Mozambique", "Zimbabwe", "Zambie", "République démocratique du Congo",
            "République du Congo", "Somalie", "Libye", "Soudan", "Soudan du Sud",
            "Namibie", "Botswana", "Lesotho");

    Button btnback;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_grid);

        GridView gridview = findViewById(R.id.GridView);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,                                   // contexte
                android.R.layout.simple_list_item_1,    // layout prédéfini pour chaque ligne
                pays                                    // liste de données
        );
        gridview.setAdapter(adapter);

        btnback = findViewById(R.id.btnBack);

        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intentback=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intentback);
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}