package com.twobrotherscompany.meutplink.ConfAssistidoComputador;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.twobrotherscompany.meutplink.R;

public class PassoUmPcActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passo_um_pc);

    }

    public void Feito (View view) {
        Intent intent = new Intent(this, PassoDoisPcActivity.class);
        startActivity(intent);
    }
}
