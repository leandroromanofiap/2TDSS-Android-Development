package com.example.logonrm.a04_radiobutton_checkbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox chkEstouAprendendo;
    RadioGroup rdgDificuldade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chkEstouAprendendo = findViewById(R.id.chkEstouAprendendo);
        rdgDificuldade = findViewById(R.id.rdgDificuldade);
    }

    public void salvar(View view) {
        boolean marcado = chkEstouAprendendo.isChecked();
        Toast.makeText(this, "Estou aprendendo Android? " + marcado, Toast.LENGTH_SHORT).show();

        String mensagem = "";
        int selecionado = rdgDificuldade.getCheckedRadioButtonId();
        switch (selecionado){
            case R.id.rdbFacil:
                mensagem = "Vc selecionou o facil.";
                break;
            case R.id.rdbMedio:
                mensagem = "Vc selecionou o medio.";
                break;
            case R.id.rdbDificil:
                mensagem = "Vc selecionou o dificil.";
                break;
            default:
                mensagem = "Vc nao selecionou nada.";
        }
    }
}
