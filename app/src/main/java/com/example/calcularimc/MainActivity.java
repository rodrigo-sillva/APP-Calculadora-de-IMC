package com.example.calcularimc;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private TextView textResultado;
    private EditText editPeso;
    private EditText editAltura;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        textResultado = findViewById(R.id.textResultado);
        editPeso = findViewById(R.id.editPeso);
        editAltura = findViewById(R.id.editAltura);
    }

    public void calcularImc(View view){

        double peso = Double.parseDouble(editPeso.getText().toString());
        double altura = Double.parseDouble(editAltura.getText().toString());
        double resultado = peso / (altura * altura);


        //se
        if (resultado < 19){
            textResultado.setText("Você está abaixo do peso");

        }else if(resultado <= 19 || resultado < 25){
            textResultado.setText("Você está com peso normal");
        }else if (resultado <= 25 || resultado < 30){
            textResultado.setText("Você está com sobrepeso");
        }else if (resultado <= 30 || resultado < 40) {
            textResultado.setText("Obesidade tipo 1");
        }else if (resultado>= 40){
            textResultado.setText("Obesidade Tipo 2");
        }
    }
}