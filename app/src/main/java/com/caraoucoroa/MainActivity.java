package com.caraoucoroa;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends Activity {
    private ImageView jogar;
    private String [] opcao = {"cara","coroa"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        jogar = (ImageView) findViewById(R.id .jogar_id);
        jogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int tamanhoLista = opcao.length;
                Random random = new Random();
                int numeroAleatorio = random.nextInt(tamanhoLista);
                Intent intent = new Intent(getApplication(),Resultado.class);
                intent.putExtra("opcao",opcao[numeroAleatorio]);

                startActivity(intent);
            }
        });
    }
}
