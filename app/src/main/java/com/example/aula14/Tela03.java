package com.example.aula14;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Tela03 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela03);
        Bundle bundle = getIntent().getExtras();
        int cod = bundle.getInt("cod");
        double valor = bundle.getDouble("valor");
        int qtd = bundle.getInt("qtd");
        double total = valor * qtd;
        final ImageView img = (ImageView) findViewById(R.id.imageView3);
        final TextView texto = (TextView) findViewById(R.id.textView3);
        switch (cod) {
            case 0:
                img.setImageResource(R.drawable.sor_chiclete);
                texto.setText("Sorvete de Chiclete:\nValor: R$" + valor + "\nQuantidade: " + qtd + "\nTotal: R$" + total);
                break;
            case 1:
                img.setImageResource(R.drawable.sor_chocolate);
                texto.setText("Sorvete de Chocolate:\nValor: R$" + valor + "\nQuantidade: " + qtd + "\nTotal: R$" + total);
                break;
            case 2:
                img.setImageResource(R.drawable.sor_menta);
                texto.setText("Sorvete de Menta:\nValor: R$" + valor + "\nQuantidade: " + qtd + "\nTotal: R$" + total);
                break;
            case 3:
                img.setImageResource(R.drawable.sor_morango);
                texto.setText("Sorvete de Morango:\nValor: R$" + valor + "\nQuantidade: " + qtd + "\nTotal: R$" + total);
                break;
            default:
                break;
        }
    }
}