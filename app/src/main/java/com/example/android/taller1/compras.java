package com.example.android.taller1;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class compras extends AppCompatActivity {

    private TextView total;
    private EditText cantidad;
    private Spinner genero, tipo, marca;
    private Resources resources;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compras);



        total = (TextView) findViewById(R.id.lblResultado);
        cantidad = (EditText) findViewById(R.id.txtCantidad);
        marca = (Spinner) findViewById(R.id.cmbMarca);
        tipo = (Spinner) findViewById(R.id.cmbTipo);
        genero = (Spinner) findViewById(R.id.cmbGenero);

        resources = this.getResources();


        ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.generos, android.R.layout.simple_spinner_item);
        genero.setAdapter(adapter);
    ArrayAdapter adapter1 = ArrayAdapter.createFromResource(this, R.array.tipo, android.R.layout.simple_spinner_item);
        tipo.setAdapter(adapter1);
    ArrayAdapter adapter2 = ArrayAdapter.createFromResource(this, R.array.marca, android.R.layout.simple_spinner_item);
        marca.setAdapter(adapter2);}


    public void calcular (View view){

        int valorU=0, valorT, canti;
        canti =Integer.parseInt ( cantidad.getText().toString());


        if (genero.getSelectedItemPosition() == 0 && tipo.getSelectedItemPosition() == 0 && marca.getSelectedItemPosition() == 0) {
            valorU = 120000;
        } else {
            if (genero.getSelectedItemPosition() == 0 && tipo.getSelectedItemPosition() == 0 && marca.getSelectedItemPosition() == 1) {
                valorU = 140000;
            } else {
                if (genero.getSelectedItemPosition() == 0 && tipo.getSelectedItemPosition() == 0 && marca.getSelectedItemPosition() == 2) {
                    valorU = 130000;
                } else {
                    if (genero.getSelectedItemPosition() == 0 && tipo.getSelectedItemPosition() == 1 && marca.getSelectedItemPosition() == 0) {
                        valorU = 50000;
                    } else {
                        if (genero.getSelectedItemPosition() == 0 && tipo.getSelectedItemPosition() == 1 && marca.getSelectedItemPosition() == 1) {
                            valorU = 80000;
                        } else {
                            if (genero.getSelectedItemPosition() == 0 && tipo.getSelectedItemPosition() == 1 && marca.getSelectedItemPosition() == 2) {
                                valorU = 100000;
                            } else {
                                if (genero.getSelectedItemPosition() == 1 && tipo.getSelectedItemPosition() == 0 && marca.getSelectedItemPosition() == 0) {
                                    valorU = 100000;
                                } else {
                                    if (genero.getSelectedItemPosition() == 1 && tipo.getSelectedItemPosition() == 0 && marca.getSelectedItemPosition() == 1) {
                                        valorU = 130000;
                                    } else {
                                        if (genero.getSelectedItemPosition() == 1 && tipo.getSelectedItemPosition() == 0 && marca.getSelectedItemPosition() == 2) {
                                            valorU = 110000;
                                        } else {
                                            if (genero.getSelectedItemPosition() == 1 && tipo.getSelectedItemPosition() == 1 && marca.getSelectedItemPosition() == 0) {
                                                valorU = 60000;
                                            } else {
                                                if (genero.getSelectedItemPosition() == 1 && tipo.getSelectedItemPosition() == 1 && marca.getSelectedItemPosition() == 1) {
                                                    valorU = 70000;
                                                } else {
                                                    if (genero.getSelectedItemPosition() == 1 && tipo.getSelectedItemPosition() == 1 && marca.getSelectedItemPosition() == 2) {
                                                        valorU = 120000;
                                                                    }


                                                                            }
                                                                        }

                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
