package com.example.app1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    /*
    Button btn1;
    Button btn2;
    TextView txt1;*/

    EditText etxt1;
    Button btn1;
    TextView txtCopy, txtCount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
//Activité 1
        /*btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        txt1=findViewById(R.id.txt1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt1.setText("Bonjour");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt1.setText("");
            }
        });*/
//Activité 4
        /*
        // 1. Liaison des vues
        etxt1   = findViewById(R.id.etxt1);
        btn1    = findViewById(R.id.btn1);
        txtCopy = findViewById(R.id.txtcopy);
        txtCount= findViewById(R.id.txtcount);

        // 2. On clique sur le bouton
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Récupère le texte saisi
                String input = etxt1.getText().toString();

                // Copie dans le TextView
                txtCopy.setText(input);

                // Calcule la longueur et affiche
                int length = input.length();
                txtCount.setText("Nombre de caractères : " + length);
            }
        });*/

//Activité 5

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}