package com.twobrotherscompany.meutplink.ConfAssistidoComputador;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.twobrotherscompany.meutplink.R;

public class PassoDoisPcActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passo_dois_pc);
    }

    public void LoginSenha (View view) {
        Intent intent = new Intent(this, PassoTresPcActivity.class);
        startActivity(intent);
    }
}
