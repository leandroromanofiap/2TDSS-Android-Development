package com.example.leandroromano.a09_dialogss;

import android.app.DatePickerDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abrirAlertDialog(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setTitle("Importante");
        builder.setMessage("Mensagem importante");

        builder.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "Excluido com sucesso", Toast.LENGTH_SHORT).show();
            }
        });

        builder.setNegativeButton("Não", null);

        builder.show();
    }

    public void abrirProgressDialog(View view) {
        ProgressDialog pd = new ProgressDialog(this);

        pd.setTitle("Aguarde");
        pd.setMessage("Estamos processando a sua solicitação...");

        pd.show();
    }

    public void abrirDatePickerDialog(View view) {
        DatePickerDialog datePickerDialog = new DatePickerDialog(this,
                new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        Toast.makeText(MainActivity.this
                                ,
                                dayOfMonth + "/" + month + "/" + year
                                , Toast.LENGTH_SHORT).show();
                    }
                },
                2018,
                05,
                10
        );

        datePickerDialog.show();
    }
}
