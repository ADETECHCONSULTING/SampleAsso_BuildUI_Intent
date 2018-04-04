package com.example.adama.myfirstappasso1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    private TextView lblResult;
    private ImageButton imbBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        lblResult = findViewById(R.id.lblResult);
        imbBack = findViewById(R.id.imbBack);
    }

    @Override
    protected void onStart() {
        super.onStart();

        Intent intent = getIntent();

        lblResult.setText("Résultat : "+intent.getStringExtra("recherche"));

        imbBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}
