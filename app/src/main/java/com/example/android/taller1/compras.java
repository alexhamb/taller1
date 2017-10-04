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

import static com.example.android.taller1.R.id.Genero;

public class compras extends AppCompatActivity {

    private TextView total;
    private EditText cantidad;
    private Spinner genero, tipo, marca;
    private String Opciones[];
    ArrayAdapter<String> adapter;
    private Resources resources;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compras);
        total = (TextView) findViewById(R.id.lblResultado);
        cantidad = (EditText) findViewById(R.id.txtCantidad);
        resources = this.getResources();


        genero =(Spinner)findViewById(R.id.cmbGenero);
        Opciones = resources.getStringArray(R.array.generos);
        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,Opciones);
        genero.setAdapter(adapter);


        tipo =(Spinner)findViewById(R.id.cmbTipo);
        Opciones = resources.getStringArray(R.array.tipo);
        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,Opciones);
        tipo.setAdapter(adapter);


        marca =(Spinner)findViewById(R.id.cmbMarca);
        Opciones = resources.getStringArray(R.array.marca);
        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,Opciones);
        marca.setAdapter(adapter);

        genero.setSelection(0);
        tipo.setSelection(0);
        marca.setSelection(0);
    }


    public void calcular(View v){
        double precioTotal=0.0;
        int Genero,Tipo,Marca;

        if(validar()){
            Genero=genero.getSelectedItemPosition();
            Tipo=tipo.getSelectedItemPosition();
            Marca=marca.getSelectedItemPosition();


            int cant = Integer.parseInt(cantidad.getText().toString());

            if(Genero==0){

                if(Tipo==0){

                    if(Marca==0){
                        precioTotal=120000*cant;

                    }else{

                        if(Marca==1){
                            precioTotal=140000*cant;
                        }else{

                            precioTotal=130000*cant;
                        }
                    }
                }else{

                    if(Marca==0){
                        precioTotal=50000*cant;

                    }else{

                        if(Marca==1){
                            precioTotal=80000*cant;
                        }else{

                            precioTotal=100000*cant;
                        }
                    }
                }
            }else{

                if(Tipo==0){

                    if(Marca==0){
                        precioTotal=100000*cant;

                    }else{

                        if(Marca==1){
                            precioTotal=130000*cant;
                        }else{

                            precioTotal=110000*cant;
                        }
                    }
                }else{

                    if(Marca==0){
                        precioTotal=60000*cant;

                    }else{

                        if(Marca==1){
                            precioTotal=70000*cant;
                        }else{

                            precioTotal=120000*cant;
                        }
                    }
                }
            }

        }
        total.setText("\n$ "+precioTotal);
    }

    public boolean validar(){
        cantidad = (EditText)findViewById(R.id.txtCantidad);
        String x =cantidad.getText().toString();
        int cant2 = Integer.parseInt(cantidad.getText().toString());
        if(x.isEmpty()||cantidad.getText().toString().trim().isEmpty()||cant2==0){
            cantidad.setError(resources.getString(R.string.mensaje_de_error));
            cantidad.setText("");
            cantidad.requestFocus();
            return false;
        }

        return true;
    }
}
