package com.caraoucoroa;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Resultado extends Activity {
    private ImageView voltar;
    private ImageView moeda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);
        voltar = (ImageView) findViewById(R.id.voltar_id);
        moeda = (ImageView) findViewById(R.id.moeda_id);
        Bundle extra = getIntent().getExtras();
        if(extra!=null){
            String opcaoEscolhida = extra.getString("opcao");
            if(opcaoEscolhida.equals("cara")){
                moeda.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.moeda_cara));
            }else{
                moeda.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.moeda_coroa));
            }
        }


        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                startActivity(new Intent(getApplication(),MainActivity.class));
            }
        });
    }
}
