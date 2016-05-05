package com.example.toni.proyectorbnofragment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    List items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        items = new ArrayList();

        items.add(new Libro(R.string.tituloEADA, R.string.autorEADA, R.string.yearEADA, R.string.explicacionEADA, R.drawable.fromm));
        items.add(new Libro(R.string.tituloEALL, R.string.autorEALL, R.string.yearEALL, R.string.explicacionEALL, R.drawable.erasmo));
        items.add(new Libro(R.string.tituloEMAL, R.string.autorEMAL, R.string.yearEMAL, R.string.explicacionEMAL, R.drawable.seneca));
        items.add(new Libro(R.string.tituloLADV, R.string.autorLADV, R.string.yearLADV, R.string.explicacionLADV, R.drawable.swett));
        items.add(new Libro(R.string.tituloLRDP, R.string.autorLRDP, R.string.yearLRDP, R.string.explicacionLRDP, R.drawable.volney));

        recyclerView = (RecyclerView) findViewById(R.id.recycler);
        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        adapter = new LibroAdapter(items);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.simple_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.bonus:
                Intent intent = new Intent(this, BonusActivity.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
