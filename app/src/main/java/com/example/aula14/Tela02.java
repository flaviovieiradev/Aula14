package com.example.aula14;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class Tela02 extends AppCompatActivity {
    String listpreco[] = {"10.00", "11.00", "12.00", "14.00", "300.00"};
    int listImages[] = {R.drawable.sor_chiclete,
                        R.drawable.sor_chocolate,
                        R.drawable.sor_menta,
                        R.drawable.sor_morango};
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela02);
        listView = (ListView) findViewById(R.id.listView1);
        AdapImg adap = new AdapImg(getApplicationContext(), listpreco, listImages);
        listView.setAdapter(adap);
        //mapeando os componentes
        final TextInputEditText campo1 = (TextInputEditText) findViewById(R.id.txt1);
        final TextInputEditText campo2 = (TextInputEditText) findViewById(R.id.txtv2);
        final Button botao = (Button) findViewById(R.id.button);
        Bundle bundle = new Bundle();
        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    int cod, qtd;
                    cod = Integer.parseInt(campo1.getText().toString());
                    qtd = Integer.parseInt(campo2.getText().toString());
                    Intent intent = new Intent(Tela02.this, Tela03.class);
                    switch (cod) {
                        case 0:
                            bundle.putInt("cod", 0);
                            bundle.putDouble("valor", Double.parseDouble(listpreco[0]));
                            bundle.putInt("qtd", qtd);
                            intent.putExtras(bundle);
                            startActivity(intent);
                            break;
                        case 1:
                            bundle.putInt("cod", 1);
                            bundle.putDouble("valor", Double.parseDouble(listpreco[1]));
                            bundle.putInt("qtd", qtd);
                            intent.putExtras(bundle);
                            startActivity(intent);
                            break;
                        case 2:
                            bundle.putInt("cod", 2);
                            bundle.putDouble("valor", Double.parseDouble(listpreco[2]));
                            bundle.putInt("qtd", qtd);
                            intent.putExtras(bundle);
                            startActivity(intent);
                            break;
                        case 3:
                            bundle.putInt("cod", 3);
                            bundle.putDouble("valor", Double.parseDouble(listpreco[3]));
                            bundle.putInt("qtd", qtd);
                            intent.putExtras(bundle);
                            startActivity(intent);
                            break;
                        default:
                            break;
                    }
                } catch (Exception e) {

                }
            }
        });
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                campo1.setText("" + i);
            }
        });
    }
}