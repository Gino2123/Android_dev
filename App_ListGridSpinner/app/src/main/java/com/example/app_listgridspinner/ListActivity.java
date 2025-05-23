package com.example.app_listgridspinner;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ListActivity extends AppCompatActivity {
    TextView txt;
    Button btnback, btnadd, btnmod, btndel;
    // Exemple simple – liste de chaînes
    List<String> pays = new ArrayList<>(Arrays.asList("Maroc", "Burkina Faso", "Niger", "Mali", "Togo", "Côte d'ivoire",
            "Ghana", "Benin", "Gabon", "Senegal", "Mauritanie", "Cap-vert",
            "Egypte", "Tunisie", "Cameroun", "Tchad", "Rwanda", "Djibouti", "Madagascar", "Espagne");



    @SuppressLint({"MissingInflatedId", "ResourceType"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_list);



        ListView listView = findViewById(R.id.listview1);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,                                   // contexte
                android.R.layout.simple_list_item_1,    // layout prédéfini pour chaque ligne
                pays                                    // liste de données
        );
        listView.setAdapter(adapter);



        btnback = findViewById(R.id.btnBack);
        btnadd = findViewById(R.id.btnAdd);
        btnmod = findViewById(R.id.btnMod);
        btndel = findViewById(R.id.btnDel);

        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intentback=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intentback);
            }
        });

        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intentback=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intentback);
            }
        });

        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intentback=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intentback);
            }
        });

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