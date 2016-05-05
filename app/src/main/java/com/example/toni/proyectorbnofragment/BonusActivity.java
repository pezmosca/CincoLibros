package com.example.toni.proyectorbnofragment;

import android.app.SearchManager;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;

public class BonusActivity extends AppCompatActivity {

    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bonus);

        spinner = (Spinner)findViewById(R.id.spinner);
    }

    public void buscar(View view){

        String libro = spinner.getSelectedItem().toString();

        String[] posiciones = getResources().getStringArray(R.array.titulos);

        //Se podría haber hecho con un switch o incluso sin switch, pero se ha
        //hecho así para cumplir el punto de la rúbrica que pone que se ha de
        //utilizar un if.

        if (libro.equals(posiciones[0])) {
            Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
            intent.putExtra(SearchManager.QUERY, posiciones[0]);
            startActivity(intent);
        }

        else if (libro.equals(posiciones[1])) {
            Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
            intent.putExtra(SearchManager.QUERY, posiciones[1]);
            startActivity(intent);
        }

        else if (libro.equals(posiciones[2])) {
            Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
            intent.putExtra(SearchManager.QUERY, posiciones[2]);
            startActivity(intent);
        }

        else if (libro.equals(posiciones[3])) {
            Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
            intent.putExtra(SearchManager.QUERY, posiciones[3]);
            startActivity(intent);
        }

        else if (libro.equals(posiciones[4])) {
            Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
            intent.putExtra(SearchManager.QUERY, posiciones[4]);
            startActivity(intent);
        }
    }
}
