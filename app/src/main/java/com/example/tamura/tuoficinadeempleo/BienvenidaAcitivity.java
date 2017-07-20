package com.example.tamura.tuoficinadeempleo;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class BienvenidaAcitivity extends AppCompatActivity {
    private int t_de_espera=3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bienvenida_acitivity);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent pasar = new Intent(BienvenidaAcitivity.this, TabsActivity.class);
                startActivity(pasar);
                finish();
            }
        }, t_de_espera );
    }
}
