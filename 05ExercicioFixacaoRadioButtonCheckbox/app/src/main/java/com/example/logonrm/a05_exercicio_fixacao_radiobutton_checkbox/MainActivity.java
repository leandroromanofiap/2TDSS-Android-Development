package com.example.logonrm.a05_exercicio_fixacao_radiobutton_checkbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RadioGroup rdgRacas;
    RadioButton rdbBorderCollie;
    RadioButton rdbPitBull;
    RadioButton rdbPastorAlemao;
    RadioButton rdbPastorCanadense;

    CheckBox chkFemea;
    CheckBox chkAdestrado;
    CheckBox chkVacinas;

    TextView txtValorFinal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rdgRacas = findViewById(R.id.rdgRacas);
        rdbBorderCollie = findViewById(R.id.rdbBorderCollie);
        rdbPitBull = findViewById(R.id.rdbPitBull);
        rdbPastorAlemao = findViewById(R.id.rdbPastorAlemao);
        rdbPastorCanadense = findViewById(R.id.rdbPastorCanadense);

        chkFemea = findViewById(R.id.chkFemea);
        chkAdestrado = findViewById(R.id.chkAdestrado);
        chkVacinas = findViewById(R.id.chkVacinas);

        txtValorFinal = findViewById(R.id.txtValorFinal);
    }

    public void calcular(View view) {

        double valorFinal = 0;

        int racaEscolhida = rdgRacas.getCheckedRadioButtonId();

        switch (racaEscolhida){
            case R.id.rdbBorderCollie:
                valorFinal += 800;
                break;
            case R.id.rdbPitBull:
                valorFinal += 750;
                break;
            case R.id.rdbPastorAlemao:
                valorFinal += 700;
                break;
            case R.id.rdbPastorCanadense:
                valorFinal += 800;
                break;
            default:
                valorFinal = 0;
        }

        if (chkFemea.isChecked())
            valorFinal += 180;

        if (chkAdestrado.isChecked())
            valorFinal += 400;

        if (chkVacinas.isChecked())
            valorFinal += 200;

        txtValorFinal.setText("R$ " + valorFinal);

    }
}
