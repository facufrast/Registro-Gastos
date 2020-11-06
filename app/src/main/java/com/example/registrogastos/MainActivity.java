package com.example.registrogastos;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText cajaLunes, cajaMartes, cajaMiercoles, cajaJueves, cajaViernes, cajaSabado, cajaDomingo;
    private EditText ingresoLunes, ingresoMartes, ingresoMiercoles, ingresoJueves, ingresoViernes, ingresoSabado, ingresoDomingo;
    private EditText egresoLunes, egresoMartes, egresoMiercoles, egresoJueves, egresoViernes, egresoSabado, egresoDomingo;

    private TextView cajaTotal, ingresoTotal, egresoTotal;

    private Spinner spinnerDias, spinnerOpciones;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Icono en el activity.
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);

        cajaLunes = findViewById(R.id.txt_cajaLunes);
        cajaMartes = findViewById(R.id.txt_cajaMartes);
        cajaMiercoles = findViewById(R.id.txt_cajaMiercoles);
        cajaJueves = findViewById(R.id.txt_cajaJueves);
        cajaViernes = findViewById(R.id.txt_cajaViernes);
        cajaSabado = findViewById(R.id.txt_cajaSabado);
        cajaDomingo = findViewById(R.id.txt_cajaDomingo);

        ingresoLunes = findViewById(R.id.txt_ingresoLunes);
        ingresoMartes = findViewById(R.id.txt_ingresoMartes);
        ingresoMiercoles = findViewById(R.id.txt_ingresoMiercoles);
        ingresoJueves = findViewById(R.id.txt_ingresoJueves);
        ingresoViernes = findViewById(R.id.txt_ingresoViernes);
        ingresoSabado = findViewById(R.id.txt_ingresoSabado);
        ingresoDomingo = findViewById(R.id.txt_ingresoDomingo);

        egresoLunes = findViewById(R.id.txt_egresoLunes);
        egresoMartes = findViewById(R.id.txt_egresoMartes);
        egresoMiercoles = findViewById(R.id.txt_egresoMiercoles);
        egresoJueves = findViewById(R.id.txt_egresoJueves);
        egresoViernes = findViewById(R.id.txt_egresoViernes);
        egresoSabado = findViewById(R.id.txt_egresoSabado);
        egresoDomingo = findViewById(R.id.txt_egresoDomingo);

        cajaTotal = findViewById(R.id.tv_totalCaja);
        ingresoTotal = findViewById(R.id.tv_totalIngreso);
        egresoTotal = findViewById(R.id.tv_totalEgreso);

        spinnerDias = findViewById(R.id.spinner_dias);
        spinnerOpciones = findViewById(R.id.spinner_opciones);

        String [] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        String [] opciones = {"Caja", "Ingreso", "Egreso"};

        ArrayAdapter <String> adapterDias = new ArrayAdapter<>(this, R.layout.spinner_item_dias, dias);
        spinnerDias.setAdapter(adapterDias);

        ArrayAdapter <String> adapterOpciones = new ArrayAdapter<>(this, R.layout.spinner_item_opciones, opciones);
        spinnerOpciones.setAdapter(adapterOpciones);

        SharedPreferences preferences = getSharedPreferences("datos", Context.MODE_PRIVATE);
        cajaLunes.setText(preferences.getString("cajaLunes", ""));
        cajaMartes.setText(preferences.getString("cajaMartes", ""));
        cajaMiercoles.setText(preferences.getString("cajaMiercoles", ""));
        cajaJueves.setText(preferences.getString("cajaJueves", ""));
        cajaViernes.setText(preferences.getString("cajaViernes", ""));
        cajaSabado.setText(preferences.getString("cajaSabado", ""));
        cajaDomingo.setText(preferences.getString("cajaDomingo", ""));

        ingresoLunes.setText(preferences.getString("ingresoLunes", ""));
        ingresoMartes.setText(preferences.getString("ingresoMartes", ""));
        ingresoMiercoles.setText(preferences.getString("ingresoMiercoles", ""));
        ingresoJueves.setText(preferences.getString("ingresoJueves", ""));
        ingresoViernes.setText(preferences.getString("ingresoViernes", ""));
        ingresoSabado.setText(preferences.getString("ingresoSabado", ""));
        ingresoDomingo.setText(preferences.getString("ingresoDomingo", ""));

        egresoLunes.setText(preferences.getString("egresoLunes", ""));
        egresoMartes.setText(preferences.getString("egresoMartes", ""));
        egresoMiercoles.setText(preferences.getString("egresoMiercoles", ""));
        egresoJueves.setText(preferences.getString("egresoJueves", ""));
        egresoViernes.setText(preferences.getString("egresoViernes", ""));
        egresoSabado.setText(preferences.getString("egresoSabado", ""));
        egresoDomingo.setText(preferences.getString("egresoDomingo", ""));

//        String c1 = preferences.getString("cajaLunes", "");
//        String c2 = preferences.getString("cajamartes", "");
//        String c3 = preferences.getString("cajaMiercoles", "");
//        String c4 = preferences.getString("cajaJueves", "");
//        String c5 = preferences.getString("cajaViernes", "");
//        String c6 = preferences.getString("cajaSabado", "");
//        String c7 = preferences.getString("cajaDomingo", "");
//
//        String i1 = preferences.getString("ingresoLunes", "");
//        String i2 = preferences.getString("ingresoMartes", "");
//        String i3 = preferences.getString("ingresoMiercoles", "");
//        String i4 = preferences.getString("ingresoJueves", "");
//        String i5 = preferences.getString("ingresoViernes", "");
//        String i6 = preferences.getString("ingresoSabado", "");
//        String i7 = preferences.getString("ingresoDomingo", "");
//
//        String e1 = preferences.getString("egresoLunes", "");
//        String e2 = preferences.getString("egresoMartes", "");
//        String e3 = preferences.getString("egresoMiercoles", "");
//        String e4 = preferences.getString("egresoJueves", "");
//        String e5 = preferences.getString("egresoViernes", "");
//        String e6 = preferences.getString("egresoSabado", "");
//        String e7 = preferences.getString("egresoDomingo", "");



//        String c1 = preferences.getString("cajaLunes", "");
//        cajaLunes.setText("$" + c1);
//        String c2 = preferences.getString("cajamartes", "");
//        cajaMartes.setText("$" + c2);
//        String c3 = preferences.getString("cajaMiercoles", "");
//        cajaMiercoles.setText("$" + c3);
//        String c4 = preferences.getString("cajaJueves", "");
//        cajaJueves.setText("$" + c4);
//        String c5 = preferences.getString("cajaViernes", "");
//        cajaViernes.setText("$" + c5);
//        String c6 = preferences.getString("cajaSabado", "");
//        cajaSabado.setText("$" + c6);
//        String c7 = preferences.getString("cajaDomingo", "");
//        cajaDomingo.setText("$" + c7);
//
//        String i1 = preferences.getString("ingresoLunes", "");
//        ingresoLunes.setText("$" + i1);
//        String i2 = preferences.getString("ingresoMartes", "");
//        ingresoMartes.setText("$" + i2);
//        String i3 = preferences.getString("ingresoMiercoles", "");
//        ingresoMiercoles.setText("$" + i3);
//        String i4 = preferences.getString("ingresoJueves", "");
//        ingresoJueves.setText("$" + i4);
//        String i5 = preferences.getString("ingresoViernes", "");
//        ingresoViernes.setText("$" + i5);
//        String i6 = preferences.getString("ingresoSabado", "");
//        ingresoSabado.setText("$" + i6);
//        String i7 = preferences.getString("ingresoDomingo", "");
//        ingresoDomingo.setText("$" + i7);
//
//        String e1 = preferences.getString("egresoLunes", "");
//        egresoLunes.setText("$" + e1);
//        String e2 = preferences.getString("egresoMartes", "");
//        egresoMartes.setText("$" + e2);
//        String e3 = preferences.getString("egresoMiercoles", "");
//        egresoMiercoles.setText("$" + e3);
//        String e4 = preferences.getString("egresoJueves", "");
//        egresoJueves.setText("$" + e4);
//        String e5 = preferences.getString("egresoViernes", "");
//        egresoViernes.setText("$" + e5);
//        String e6 = preferences.getString("egresoSabado", "");
//        egresoSabado.setText("$" + e6);
//        String e7 = preferences.getString("egresoDomingo", "");
//        egresoDomingo.setText("$" + e7);

        String totalCaja = preferences.getString("totalCaja", "");
        String totalIngreso = preferences.getString("totalIngreso", "");
        String totalEgreso = preferences.getString("totalEgreso", "");

        cajaTotal.setText("$" + totalCaja);
        ingresoTotal.setText("$" + totalIngreso);
        egresoTotal.setText("$" + totalEgreso);

        //Validaciones para que deje deshabilitado los casilleros que ya contienen datos.
        if (cajaLunes.getText().toString().equals("")) {
            cajaLunes.setEnabled(true);
        }
        else {
            cajaLunes.setEnabled(false);
        }

        if (cajaMartes.getText().toString().equals("")) {
            cajaMartes.setEnabled(true);
        }
        else {
            cajaMartes.setEnabled(false);
        }

        if (cajaMiercoles.getText().toString().equals("")) {
            cajaMiercoles.setEnabled(true);
        }
        else {
            cajaMiercoles.setEnabled(false);
        }

        if (cajaJueves.getText().toString().equals("")) {
            cajaJueves.setEnabled(true);
        }
        else {
            cajaJueves.setEnabled(false);
        }

        if (cajaViernes.getText().toString().equals("")) {
            cajaViernes.setEnabled(true);
        }
        else {
            cajaViernes.setEnabled(false);
        }

        if (cajaSabado.getText().toString().equals("")) {
            cajaSabado.setEnabled(true);
        }
        else {
            cajaSabado.setEnabled(false);
        }

        if (cajaDomingo.getText().toString().equals("")) {
            cajaDomingo.setEnabled(true);
        }
        else {
            cajaDomingo.setEnabled(false);
        }

        if (ingresoLunes.getText().toString().equals("")) {
            ingresoLunes.setEnabled(true);
        }
        else {
            ingresoLunes.setEnabled(false);
        }

        if (ingresoMartes.getText().toString().equals("")) {
            ingresoMartes.setEnabled(true);
        }
        else {
            ingresoMartes.setEnabled(false);
        }

        if (ingresoMiercoles.getText().toString().equals("")) {
            ingresoMiercoles.setEnabled(true);
        }
        else {
            ingresoMiercoles.setEnabled(false);
        }

        if (ingresoJueves.getText().toString().equals("")) {
            ingresoJueves.setEnabled(true);
        }
        else {
            ingresoJueves.setEnabled(false);
        }

        if (ingresoViernes.getText().toString().equals("")) {
            ingresoViernes.setEnabled(true);
        }
        else {
            ingresoViernes.setEnabled(false);
        }

        if (ingresoSabado.getText().toString().equals("")) {
            ingresoSabado.setEnabled(true);
        }
        else {
            ingresoSabado.setEnabled(false);
        }

        if (ingresoDomingo.getText().toString().equals("")) {
            ingresoDomingo.setEnabled(true);
        }
        else {
            ingresoDomingo.setEnabled(false);
        }

        if (egresoLunes.getText().toString().equals("")) {
            egresoLunes.setEnabled(true);
        }
        else {
            egresoLunes.setEnabled(false);
        }

        if (egresoMartes.getText().toString().equals("")) {
            egresoMartes.setEnabled(true);
        }
        else {
            egresoMartes.setEnabled(false);
        }

        if (egresoMiercoles.getText().toString().equals("")) {
            egresoMiercoles.setEnabled(true);
        }
        else {
            egresoMiercoles.setEnabled(false);
        }

        if (egresoJueves.getText().toString().equals("")) {
            egresoJueves.setEnabled(true);
        }
        else {
            egresoJueves.setEnabled(false);
        }

        if (egresoViernes.getText().toString().equals("")) {
            egresoViernes.setEnabled(true);
        }
        else {
            egresoViernes.setEnabled(false);
        }

        if (egresoSabado.getText().toString().equals("")) {
            egresoSabado.setEnabled(true);
        }
        else {
            egresoSabado.setEnabled(false);
        }

        if (egresoDomingo.getText().toString().equals("")) {
            egresoDomingo.setEnabled(true);
        }
        else {
            egresoDomingo.setEnabled(false);
        }

    }

    public void calcularTotal(View view) {
        SharedPreferences preferences = getSharedPreferences("datos", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();

        String cLunes = cajaLunes.getText().toString();
        String cMartes = cajaMartes.getText().toString();
        String cMiercoles = cajaMiercoles.getText().toString();
        String cJueves = cajaJueves.getText().toString();
        String cViernes = cajaViernes.getText().toString();
        String cSabado = cajaSabado.getText().toString();
        String cDomingo = cajaDomingo.getText().toString();

        String iLunes = ingresoLunes.getText().toString();
        String iMartes = ingresoMartes.getText().toString();
        String iMiercoles = ingresoMiercoles.getText().toString();
        String iJueves = ingresoJueves.getText().toString();
        String iViernes = ingresoViernes.getText().toString();
        String iSabado = ingresoSabado.getText().toString();
        String iDomingo = ingresoDomingo.getText().toString();

        String eLunes = egresoLunes.getText().toString();
        String eMartes = egresoMartes.getText().toString();
        String eMiercoles = egresoMiercoles.getText().toString();
        String eJueves = egresoJueves.getText().toString();
        String eViernes = egresoViernes.getText().toString();
        String eSabado = egresoSabado.getText().toString();
        String eDomingo = egresoDomingo.getText().toString();

        if (cLunes.equals("")) {
            cLunes = "0";
        }

        if (cMartes.equals("")) {
            cMartes = "0";
        }

        if (cMiercoles.equals("")) {
            cMiercoles = "0";
        }

        if (cJueves.equals("")) {
            cJueves = "0";
        }

        if (cViernes.equals("")) {
            cViernes = "0";
        }

        if (cSabado.equals("")) {
            cSabado = "0";
        }

        if (cDomingo.equals("")) {
            cDomingo = "0";
        }

        if (iLunes.equals("")) {
            iLunes = "0";
        }

        if (iMartes.equals("")) {
            iMartes = "0";
        }

        if (iMiercoles.equals("")) {
            iMiercoles = "0";
        }

        if (iJueves.equals("")) {
            iJueves = "0";
        }

        if (iViernes.equals("")) {
            iViernes = "0";
        }

        if (iSabado.equals("")) {
            iSabado = "0";
        }

        if (iDomingo.equals("")) {
            iDomingo = "0";
        }

        if (eLunes.equals("")) {
            eLunes = "0";
        }

        if (eMartes.equals("")) {
            eMartes = "0";
        }

        if (eMiercoles.equals("")) {
            eMiercoles = "0";
        }

        if (eJueves.equals("")) {
            eJueves = "0";
        }

        if (eViernes.equals("")) {
            eViernes = "0";
        }

        if (eSabado.equals("")) {
            eSabado = "0";
        }

        if (eDomingo.equals("")) {
            eDomingo = "0";
        }

        int caja1 = Integer.parseInt(cLunes);
        int caja2 = Integer.parseInt(cMartes);
        int caja3 = Integer.parseInt(cMiercoles);
        int caja4 = Integer.parseInt(cJueves);
        int caja5 = Integer.parseInt(cViernes);
        int caja6 = Integer.parseInt(cSabado);
        int caja7 = Integer.parseInt(cDomingo);

        int ingreso1 = Integer.parseInt(iLunes);
        int ingreso2 = Integer.parseInt(iMartes);
        int ingreso3 = Integer.parseInt(iMiercoles);
        int ingreso4 = Integer.parseInt(iJueves);
        int ingreso5 = Integer.parseInt(iViernes);
        int ingreso6 = Integer.parseInt(iSabado);
        int ingreso7 = Integer.parseInt(iDomingo);

        int egreso1 = Integer.parseInt(eLunes);
        int egreso2 = Integer.parseInt(eMartes);
        int egreso3 = Integer.parseInt(eMiercoles);
        int egreso4 = Integer.parseInt(eJueves);
        int egreso5 = Integer.parseInt(eViernes);
        int egreso6 = Integer.parseInt(eSabado);
        int egreso7 = Integer.parseInt(eDomingo);

        int sumaCaja = caja1 + caja2 + caja3 + caja4 + caja5 + caja6 + caja7;
        int sumaIngreso = ingreso1 + ingreso2 + ingreso3 + ingreso4 + ingreso5 + ingreso6 + ingreso7;
        int sumaEgreso = egreso1 + egreso2 + egreso3 + egreso4 + egreso5 + egreso6 + egreso7;

        String resultadoCaja = String.valueOf(sumaCaja);
        String resultadoIngreso = String.valueOf(sumaIngreso);
        String resultadoEgreso = String.valueOf(sumaEgreso);

        cajaTotal.setText("$" + resultadoCaja);
        ingresoTotal.setText("$" + resultadoIngreso);
        egresoTotal.setText("$" + resultadoEgreso);

        editor.putString("totalCaja", resultadoCaja);
        editor.putString("totalIngreso", resultadoIngreso);
        editor.putString("totalEgreso", resultadoEgreso);
        editor.commit();

    }

    public void guardarDatos(View view) {
        calcularTotal(view);
        Intent main = new Intent(this, MainActivity.class);
        SharedPreferences preferencias = getSharedPreferences("datos", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferencias.edit();

        if (cajaLunes.getText().toString().equals("")) {
            cajaLunes.setEnabled(true);
        }
        else {
            cajaLunes.setEnabled(false);
        }

        if (cajaMartes.getText().toString().equals("")) {
            cajaMartes.setEnabled(true);
        }
        else {
            cajaMartes.setEnabled(false);
        }

        if (cajaMiercoles.getText().toString().equals("")) {
            cajaMiercoles.setEnabled(true);
        }
        else {
            cajaMiercoles.setEnabled(false);
        }

        if (cajaJueves.getText().toString().equals("")) {
            cajaJueves.setEnabled(true);
        }
        else {
            cajaJueves.setEnabled(false);
        }

        if (cajaViernes.getText().toString().equals("")) {
            cajaViernes.setEnabled(true);
        }
        else {
            cajaViernes.setEnabled(false);
        }

        if (cajaSabado.getText().toString().equals("")) {
            cajaSabado.setEnabled(true);
        }
        else {
            cajaSabado.setEnabled(false);
        }

        if (cajaDomingo.getText().toString().equals("")) {
            cajaDomingo.setEnabled(true);
        }
        else {
            cajaDomingo.setEnabled(false);
        }

        if (ingresoLunes.getText().toString().equals("")) {
            ingresoLunes.setEnabled(true);
        }
        else {
            ingresoLunes.setEnabled(false);
        }

        if (ingresoMartes.getText().toString().equals("")) {
            ingresoMartes.setEnabled(true);
        }
        else {
            ingresoMartes.setEnabled(false);
        }

        if (ingresoMiercoles.getText().toString().equals("")) {
            ingresoMiercoles.setEnabled(true);
        }
        else {
            ingresoMiercoles.setEnabled(false);
        }

        if (ingresoJueves.getText().toString().equals("")) {
            ingresoJueves.setEnabled(true);
        }
        else {
            ingresoJueves.setEnabled(false);
        }

        if (ingresoViernes.getText().toString().equals("")) {
            ingresoViernes.setEnabled(true);
        }
        else {
            ingresoViernes.setEnabled(false);
        }

        if (ingresoSabado.getText().toString().equals("")) {
            ingresoSabado.setEnabled(true);
        }
        else {
            ingresoSabado.setEnabled(false);
        }

        if (ingresoDomingo.getText().toString().equals("")) {
            ingresoDomingo.setEnabled(true);
        }
        else {
            ingresoDomingo.setEnabled(false);
        }

        if (egresoLunes.getText().toString().equals("")) {
            egresoLunes.setEnabled(true);
        }
        else {
            egresoLunes.setEnabled(false);
        }

        if (egresoMartes.getText().toString().equals("")) {
            egresoMartes.setEnabled(true);
        }
        else {
            egresoMartes.setEnabled(false);
        }

        if (egresoMiercoles.getText().toString().equals("")) {
            egresoMiercoles.setEnabled(true);
        }
        else {
            egresoMiercoles.setEnabled(false);
        }

        if (egresoJueves.getText().toString().equals("")) {
            egresoJueves.setEnabled(true);
        }
        else {
            egresoJueves.setEnabled(false);
        }

        if (egresoViernes.getText().toString().equals("")) {
            egresoViernes.setEnabled(true);
        }
        else {
            egresoViernes.setEnabled(false);
        }

        if (egresoSabado.getText().toString().equals("")) {
            egresoSabado.setEnabled(true);
        }
        else {
            egresoSabado.setEnabled(false);
        }

        if (egresoDomingo.getText().toString().equals("")) {
            egresoDomingo.setEnabled(true);
        }
        else {
            egresoDomingo.setEnabled(false);
        }

        editor.putString("cajaLunes", cajaLunes.getText().toString());
        editor.putString("cajaMartes", cajaMartes.getText().toString());
        editor.putString("cajaMiercoles", cajaMiercoles.getText().toString());
        editor.putString("cajaJueves", cajaJueves.getText().toString());
        editor.putString("cajaViernes", cajaViernes.getText().toString());
        editor.putString("cajaSabado", cajaSabado.getText().toString());
        editor.putString("cajaDomingo", cajaDomingo.getText().toString());

        editor.putString("ingresoLunes", ingresoLunes.getText().toString());
        editor.putString("ingresoMartes", ingresoMartes.getText().toString());
        editor.putString("ingresoMiercoles", ingresoMiercoles.getText().toString());
        editor.putString("ingresoJueves", ingresoJueves.getText().toString());
        editor.putString("ingresoViernes", ingresoViernes.getText().toString());
        editor.putString("ingresoSabado", ingresoSabado.getText().toString());
        editor.putString("ingresoDomingo", ingresoDomingo.getText().toString());

        editor.putString("egresoLunes", egresoLunes.getText().toString());
        editor.putString("egresoMartes", egresoMartes.getText().toString());
        editor.putString("egresoMiercoles", egresoMiercoles.getText().toString());
        editor.putString("egresoJueves", egresoJueves.getText().toString());
        editor.putString("egresoViernes", egresoViernes.getText().toString());
        editor.putString("egresoSabado", egresoSabado.getText().toString());
        editor.putString("egresoDomingo", egresoDomingo.getText().toString());
        editor.commit();

        calcularTotal(view);
        Toast.makeText(this, "Datos guardados con éxito.", Toast.LENGTH_SHORT).show();
        finish();
        startActivity(main);
    }

    public void editarDatos(View view) {
        String dia = spinnerDias.getSelectedItem().toString();

        if (dia.equals("Lunes")) {
            cajaLunes.setEnabled(true);
            ingresoLunes.setEnabled(true);
            egresoLunes.setEnabled(true);
        }

        if (dia.equals("Martes")) {
            cajaMartes.setEnabled(true);
            ingresoMartes.setEnabled(true);
            egresoMartes.setEnabled(true);
        }

        if (dia.equals("Miércoles")) {
            cajaMiercoles.setEnabled(true);
            ingresoMiercoles.setEnabled(true);
            egresoMiercoles.setEnabled(true);
        }

        if (dia.equals("Jueves")) {
            cajaJueves.setEnabled(true);
            ingresoJueves.setEnabled(true);
            egresoJueves.setEnabled(true);
        }

        if (dia.equals("Viernes")) {
            cajaViernes.setEnabled(true);
            ingresoViernes.setEnabled(true);
            egresoViernes.setEnabled(true);
        }

        if (dia.equals("Sábado")) {
            cajaSabado.setEnabled(true);
            ingresoSabado.setEnabled(true);
            egresoSabado.setEnabled(true);
        }

        if (dia.equals("Domingo")) {
            cajaDomingo.setEnabled(true);
            ingresoDomingo.setEnabled(true);
            egresoDomingo.setEnabled(true);
        }

    }

    public void borrarDatos(View view) {
        final Intent main = new Intent(this, MainActivity.class);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("¿Estás seguro de borrar los datos?");
        builder.setTitle("Confirmación de Borrado");
        builder.setPositiveButton("SI", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {
                SharedPreferences preferencias = getSharedPreferences("datos", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = preferencias.edit();
                editor.putString("cajaLunes", "");
                editor.putString("cajaMartes", "");
                editor.putString("cajaMiercoles", "");
                editor.putString("cajaJueves", "");
                editor.putString("cajaViernes", "");
                editor.putString("cajaSabado", "");
                editor.putString("cajaDomingo", "");

                editor.putString("ingresoLunes", "");
                editor.putString("ingresoMartes", "");
                editor.putString("ingresoMiercoles", "");
                editor.putString("ingresoJueves", "");
                editor.putString("ingresoViernes", "");
                editor.putString("ingresoSabado", "");
                editor.putString("ingresoDomingo", "");

                editor.putString("egresoLunes", "");
                editor.putString("egresoMartes", "");
                editor.putString("egresoMiercoles", "");
                editor.putString("egresoJueves", "");
                editor.putString("egresoViernes", "");
                editor.putString("egresoSabado", "");
                editor.putString("egresoDomingo", "");

                editor.putString("totalCaja", "");
                editor.putString("totalIngreso", "");
                editor.putString("totalEgreso", "");

                editor.commit();
                finish();
                startActivity(main);
                Toast.makeText(MainActivity.this, "Datos Borrados con éxito.", Toast.LENGTH_SHORT).show();
            }
        });

        builder.setNegativeButton("NO", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

        AlertDialog dialog = builder.create();
        dialog.show();
    }
}