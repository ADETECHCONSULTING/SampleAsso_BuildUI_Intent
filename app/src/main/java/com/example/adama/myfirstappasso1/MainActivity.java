package com.example.adama.myfirstappasso1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edtRecherche;
    private Button btnOk;
    private ImageButton imbCopyright;
    private String recherche;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        if(savedInstanceState != null){
            recherche = savedInstanceState.getString("message");
            edtRecherche.setText(recherche);
        }

        edtRecherche = findViewById(R.id.edtRecherche);
        btnOk = findViewById(R.id.btnOk);
        imbCopyright = findViewById(R.id.imbCopyright);

    }

    @Override
    protected void onStart() {
        super.onStart();

        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                intent.putExtra("recherche", edtRecherche.getText().toString());
                startActivity(intent); // lancer l'intent
            }
        });

        imbCopyright.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CopyrightActivity.class);
                startActivity(intent);
            }
        });

    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putString("message", edtRecherche.getText().toString());
        
    }
}
