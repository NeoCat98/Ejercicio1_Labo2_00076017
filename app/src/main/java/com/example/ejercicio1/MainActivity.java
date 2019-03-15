package com.example.ejercicio1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button checkButton;
    private TextView texto;
    private EditText textoM;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkButton = findViewById(R.id.checkButton);
        checkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texto= findViewById(R.id.texto);
                textoM = findViewById(R.id.texto_user);
                texto.setText(textoM.getText());
            }
        });
        checkButton.setOnLongClickListener(new View.OnLongClickListener(){

            @Override
            public boolean onLongClick(View v) {
                texto= findViewById(R.id.texto);
                textoM = findViewById(R.id.texto_pass);
                texto.setText(textoM.getText());
                return false;
            }
        });
    }
}
