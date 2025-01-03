package com.twobrotherscompany.meutplink;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.twobrotherscompany.meutplink.ConfAssistidoComputador.PassoUmPcActivity;

public class ConfiguracaoAssistidaActivity extends AppCompatActivity {

    private TextView TxtBemVindo, TxtExplicUm, TxtExplicDois, TxtExplicTres, TxtCompCel;
    private Button buttonSim, buttonNao, buttonCelular, buttonPC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configuracao_assistida);

        TxtBemVindo = findViewById(R.id.TxtBemVindo);
        TxtExplicUm = findViewById(R.id.TxtExplicUm);
        TxtExplicDois = findViewById(R.id.TxtExplicDois);
        TxtExplicTres = findViewById(R.id.TxtExplicTres);
        TxtCompCel = findViewById(R.id.TxtCompCel);

        buttonSim = findViewById(R.id.buttonSim);
        buttonNao = findViewById(R.id.buttonNao);
        buttonCelular = findViewById(R.id.buttonCelular);
        buttonPC = findViewById(R.id.buttonPC);

        TxtBemVindo.setVisibility(View.VISIBLE);
        TxtExplicUm.setVisibility(View.VISIBLE);
        TxtExplicDois.setVisibility(View.VISIBLE);
        TxtExplicTres.setVisibility(View.VISIBLE);
        buttonSim.setVisibility(View.VISIBLE);
        buttonNao.setVisibility(View.VISIBLE);

        TxtCompCel.setVisibility(View.INVISIBLE);
        buttonPC.setVisibility(View.INVISIBLE);
        buttonCelular.setVisibility(View.INVISIBLE);
    }

    public void NaoComecar (View view) {
        Intent intent = new Intent(this, MenuPrincipal.class);
        startActivity(intent);
    }

    public void SimComecar (View view) {
        TxtBemVindo.setVisibility(View.INVISIBLE);
        TxtExplicUm.setVisibility(View.INVISIBLE);
        TxtExplicDois.setVisibility(View.INVISIBLE);
        TxtExplicTres.setVisibility(View.INVISIBLE);
        buttonSim.setVisibility(View.INVISIBLE);
        buttonNao.setVisibility(View.INVISIBLE);

        TxtCompCel.setVisibility(View.VISIBLE);
        buttonPC.setVisibility(View.VISIBLE);
        buttonCelular.setVisibility(View.VISIBLE);
    }

    public void Computador (View view) {
        Intent intent = new Intent(this, PassoUmPcActivity.class);
        startActivity(intent);
    }/*

    public void Celular (View view) {
        Intent intent = new Intent(this, AssistidoCelular.class);
        startActivity(intent);
    }*/
}
